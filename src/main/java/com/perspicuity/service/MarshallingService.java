package com.perspicuity.service;

import com.perspicuity.NamespaceMapper;
import com.sun.xml.bind.marshaller.NamespacePrefixMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.xml.bind.*;
import javax.xml.namespace.QName;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
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

    final NamespaceMapper namespaceMapper;

    public MarshallingService(NamespaceMapper namespaceMapper){
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

        Class<?>[] classesForJAXBContext = new Class[0];
        StringWriter sw = new StringWriter();
        sw.write(PAYLOAD_HEADER);

        boolean done = false;

        do{

            Marshaller marshaller = getBasicMarshaller(JAXBContext.newInstance(classesForJAXBContext));

            try{

                QName qName = getQNameForClass(payloadClass);
                JAXBElement<?> projectElement = new JAXBElement(qName, payloadClass, payload);

                //Attempt to marshal using the current aggregation of Clarity datatype classes; an exception will reveal
                //the next missing class, bringing us one step closer to the correct JAXBContext
                marshaller.marshal(projectElement, sw);
                done = true;

            }catch(MarshalException e){

                //Grab the name of the Clarity datatype mentioned in the exception
                String missingClass = getNextClassMissingFromJAXBContext(payload, e);
                logger.info("Need " +  missingClass);

                //Update Class[] with the missing Clarity datatype
                Class<?> classNeeded;
                classNeeded = Class.forName(missingClass);
                classesForJAXBContext = Arrays.copyOf(classesForJAXBContext, classesForJAXBContext.length + 1);
                classesForJAXBContext[classesForJAXBContext.length - 1] = classNeeded;

            }

        }while(!done);

        String xml = sw.toString();
        //logger.debug(xml);

        return xml;

    }

    private String getNextClassMissingFromJAXBContext(Object payload, MarshalException e) throws ClassNotFoundException {

        //Pull any mention of a Clarity datatype from the exception message
        Pattern p = Pattern.compile("(com.genologics.ri)(([a-z.$]+)\\w+)");
        Matcher m = p.matcher(e.toString());

        if(!m.find()) {

            //Without a class in the exception message this loop can not be exited
            throw new ClassNotFoundException("An exception was reported that made no mention of a " +
                    "Clarity datatype. Unable to marshal the payload " + payload +
                    "\nThe exception was:\n\n" + e);

        }

        return m.group();

    }

    /**
     * Converts the Class name of the XML object to the QName for the JAXBElement
     */
    private QName getQNameForClass(Class<?> payloadClass) {

        String packageName = payloadClass.getPackage().getName();
        String namespaceUri =  "http://genologics.com" +
                packageName.replace("com.genologics", "").replaceAll("\\.", "/");

        String localPart = payloadClass.getSimpleName().toLowerCase();

        return new QName(namespaceUri, localPart);

    }

    private Marshaller getBasicMarshaller(JAXBContext context) throws JAXBException{

        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty("com.sun.xml.bind.namespacePrefixMapper", namespaceMapper);
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        /*There is a known bug involving JAXB writing a duplicated:
        "<?xml version="1.0" encoding="UTF-8" standalone="yes"?>"
        line to any type of Writer under certain circumstances when calling Marshaller#marshal(), so use this prop to
        skip its automatic inclusion and just have it written whenever calling Marshaller#marshal()*/
        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

        return marshaller;

    }

}
