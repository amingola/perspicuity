package com.perspicuity.service;

import com.perspicuity.NamespaceMapper;
import com.sun.xml.bind.marshaller.NamespacePrefixMapper;
import com.sun.xml.bind.v2.runtime.IllegalAnnotationsException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.xml.bind.*;
import javax.xml.namespace.QName;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Proxy;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Andrew Mingola
 *
 * This class provides one key method, <code>marshal()</code>, that marshals various payload types generically,
 * whichever the Clarity LIMS endpoint may require.
 *
 * <br/><br/><b>Note:</b> There are many classes of the same name, but in different packages. Often, you may need to use
 * the fully qualified path when declaring variables just for <i>clarity</i> (no pun intended), e.g.
 * <code>com.genologics.ri.container.sample.Sample details;</code>. This will be necessary if using two types with colliding
 * names, e.g.
 * <br/><br/><code>com.genologics.ri.container.sample.Sample</code>
 * <br/>and
 * <br/><code>com.genologics.ri.container.artifact.Sample</code>
 */
@Service
public class MarshallingService{

    private static final String PAYLOAD_HEADER = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n";
    private static final Logger logger = LoggerFactory.getLogger(NamespacePrefixMapper.class);

    private final String clarityPackage;
    private final String clarityPackageRoot;
    private final String clarityUri;

    final NamespaceMapper namespaceMapper;

    public MarshallingService(@Value("${clarityPackage}") String clarityPackage,
                              @Value("${clarityPackageRoot}") String clarityPackageRoot,
                              @Value("${clarityUri}") String clarityUri,
                              NamespaceMapper namespaceMapper){
        this.clarityPackage = clarityPackage;
        this.clarityPackageRoot = clarityPackageRoot;
        this.clarityUri = clarityUri;
        this.namespaceMapper = namespaceMapper;
    }

    /**
     * Marshal the given object to an XML payload conforming to the schema of the given Clarity datatype.
     * @param payloadClass The Class of a datatype within (any depth) the "com.genologics.ri" package.
     * @param payload The Object being marshalled to XML. Note that the object type must be a Clarity datatype.
     * @return the given payload represented as XML
     * @throws JAXBException
     * @throws ClassNotFoundException
     */
    public String marshal(Class<?> payloadClass, Object payload) throws JAXBException, ClassNotFoundException {

//        Class<?>[] classesForJAXBContext = new Class[0];
        Set<Class<?>> classesForJAXBContext = new HashSet<>();
        StringWriter sw = new StringWriter();
        sw.write(PAYLOAD_HEADER);

        Marshaller marshaller;
        boolean done = false;

        do{

            Class<?>[] classes = classesForJAXBContext.toArray(new Class<?>[0]);

            try{

                marshaller = getBasicMarshaller(JAXBContext.newInstance(classes));

                QName qName = getQNameForClass(payloadClass);
                JAXBElement<?> projectElement = new JAXBElement(qName, payloadClass, payload);

                //Attempt to marshal using the current aggregation of Clarity datatype classes; an exception will reveal
                //the next missing class, bringing us one step closer to the correct JAXBContext
                marshaller.marshal(projectElement, sw);
                done = true;

            }catch(MarshalException e){

                //Grab the name of the Clarity datatype mentioned in the exception
                String missingClass = getClassMissingFromJAXBContext(payload, e);
                logger.info("Need " +  missingClass);

                //Update Class[] with the missing Clarity datatype
                addClassFromNameToArray(missingClass, classesForJAXBContext);

            }catch(IllegalAnnotationsException e2){

                //Grab the name of the Clarity datatype mentioned in the exception
                String missingObjectFactory = getObjectFactoryMissingFromJAXBContext(payload, e2);
                logger.info("Need " +  missingObjectFactory);

                //Update Class[] with the missing Clarity datatype
                addClassFromNameToArray(missingObjectFactory, classesForJAXBContext);

            } catch (IllegalAccessException e) {
                logger.error("Could not extract localpart from annotations from " + payloadClass.getName(), e);
            }

        }while(!done);

        return sw.toString();

    }

    private String getClassMissingFromJAXBContext(Object payload, MarshalException e) throws ClassNotFoundException {

        //Pull any mention of a Clarity datatype from the exception message
        Pattern p = Pattern.compile("(" + clarityPackage + ")(([a-z.$]+)\\w+)");
        Matcher m = p.matcher(e.toString());

        if(!m.find()) {

            //Without a class in the exception message this loop can not be exited
            throw new ClassNotFoundException("An exception was reported that made no mention of a " +
                    "Clarity datatype. Unable to marshal the payload " + payload +
                    "\nThe exception was:\n\n" + e);

        }

        return m.group();

    }

    private String getObjectFactoryMissingFromJAXBContext(Object payload, IllegalAnnotationsException e) throws ClassNotFoundException {

        //Pull any mention of a Clarity datatype from the exception message
        Pattern p = Pattern.compile("(?!" + clarityUri + ")[a-z]*(?=})");
        Matcher m = p.matcher(e.toString());

        if(!m.find()) {

            //Without a class in the exception message this loop can not be exited
            throw new ClassNotFoundException("An exception was reported that made no mention of a " +
                    "Clarity datatype. Unable to marshal the payload " + payload +
                    "\nThe exception was:\n\n" + e);

        }

        return clarityPackage + "." + m.group() + ".ObjectFactory";

    }

    private void addClassFromNameToArray(String missingClass, Set<Class<?>> classesForJAXBContext) throws ClassNotFoundException {

        Class<?> classNeeded = Class.forName(missingClass);

        if(classesForJAXBContext.contains(classNeeded)){
            String msg = "The class " + missingClass + " is already in the JAXBContext and it didn't fix the problem." +
                    " Throwing this exception to avoid an infinite loop. Game over.";
            throw new RuntimeException(msg);
        }

        classesForJAXBContext.add(classNeeded);

    }

    /**
     * Converts the Class name of the XML object to the QName for the JAXBElement
     */
    private QName getQNameForClass(Class<?> payloadClass) throws IllegalAccessException {

        String packageName = payloadClass.getPackage().getName()
                .replace(clarityPackageRoot, "").replaceAll("\\.", "/");
        String namespaceUri =  clarityUri + packageName;

        //String localPart = payloadClass.getSimpleName().toLowerCase();
        //More reflection, which could have been avoided if the localpart of the QName was consistently the name of the
        //class, but there are a small number of exceptions to this, so invoke the Java Dark Arts of reflections...
        Field f = (Proxy.getInvocationHandler(payloadClass.getAnnotations()[1]).getClass().getDeclaredFields()[2]);
        f.setAccessible(true);
        LinkedHashMap map = (LinkedHashMap) f.get((Proxy.getInvocationHandler(payloadClass.getAnnotations()[1])));
        String localPart = (String) map.get("name");

        return new QName(namespaceUri, localPart);

    }

    private Marshaller getBasicMarshaller(JAXBContext context) throws JAXBException{

        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty("com.sun.xml.bind.namespacePrefixMapper", namespaceMapper);
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        /*There is a known bug involving JAXB writing a duplicated:
        "<?xml version="1.0" encoding="UTF-8" standalone="yes"?>"
        line to any type of Writer under certain circumstances when calling Marshaller#marshal(), so use this property
        to skip its automatic inclusion and just have it written whenever calling Marshaller#marshal()*/
        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

        return marshaller;

    }

}
