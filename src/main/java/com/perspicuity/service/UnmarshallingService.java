package com.perspicuity.service;

import com.sun.xml.bind.v2.runtime.IllegalAnnotationsException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.ByteArrayInputStream;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Andrew Mingola
 *
 * This class provides a single method, unmarshal(), which accepts a Class and a String represented the well-formed XML
 * to be unmarshalled.
 */
@Service
public class UnmarshallingService{

    private final String clarityPackage;
    private final String clarityUri;

    public UnmarshallingService(@Value("${clarityPackage}") String clarityPackage, @Value("$clarityUri") String clarityUri){
        this.clarityPackage = clarityPackage;
        this.clarityUri = clarityUri;
    }


    private static final Logger logger = LoggerFactory.getLogger(UnmarshallingService.class);

    /**
     * This method takes a Class and a String representing the well-formed XML to be unmarshalled and returns
     * JAXBElement of that class' type, but anonymized (JAXBElement&lt;?&gt;)
     * @param payloadType The Class you want the resulting object to be
     * @param payload String representing the well-formed XML payload
     * @return a JAXBElement&lt;?&gt; object, whose underlying <code>value</code> (of the type specified in payloadType)
     * can be accessed by calling <code>getValue()</code> on this return type, than casting to <code>[payloadType]</code>
     * @throws JAXBException if anything goes wrong with the unmarshalling
     * @throws ClassNotFoundException if the class can not be found
     */
    public JAXBElement<?> unmarshal(@NonNull Class<?> payloadType, String payload)
            throws JAXBException, ClassNotFoundException{

        //Get the ObjectFactory class that corresponds to the payload's type - this implementation should always work
        //because the payloadType class should always have its ObjectFactory adjacent to it in the same package
        Class<?> objectFactoryClass = Class.forName(payloadType.getPackage().getName() + ".ObjectFactory");

        Set<Class<?>> classesForJAXBContext = new HashSet<>();
        classesForJAXBContext.add(objectFactoryClass);

        //Use the ObjectFactory class that corresponds to the payload's type for the unmarshaller's context
        Unmarshaller unmarshaller;
        boolean done = false;
        do {

            Class<?>[] classes = classesForJAXBContext.toArray(new Class<?>[0]);

            try {

                JAXBContext context = JAXBContext.newInstance(classes);
                unmarshaller = context.createUnmarshaller();
                done = true;
                return (JAXBElement<?>) unmarshaller.unmarshal(new ByteArrayInputStream(payload.getBytes()));

            } catch (IllegalAnnotationsException e2) {

                //Grab the name of the Clarity datatype mentioned in the exception
                String missingObjectFactory = getObjectFactoryMissingFromJAXBContext(payload, e2);
                logger.info("Need " + missingObjectFactory);

                //Update Class[] with the missing Clarity datatype
                addClassFromNameToArray(missingObjectFactory, classesForJAXBContext);

            }

        }while(!done);

        return null;

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

    private static void addClassFromNameToArray(String missingClass, Set<Class<?>> classesForJAXBContext) throws ClassNotFoundException {
        Class<?> classNeeded = Class.forName(missingClass);
        if(classesForJAXBContext.contains(classNeeded)){
            String msg = "The class " + missingClass + " is already in the JAXBContext and it didn't fix the problem." +
                    " Throwing this exception to avoid an infinite loop. Game over.";
            throw new RuntimeException(msg);
        }
        classesForJAXBContext.add(classNeeded);
    }

}
