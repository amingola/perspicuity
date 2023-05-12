package com.perspicuity.service;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.ByteArrayInputStream;

/**
 * This class provides a single method, unmarshal(), which accepts a Class and a String represented the well-formed XML
 * to be unmarshalled.
 */
@Service
public class UnmarshallingService{

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
    public static JAXBElement<?> unmarshal(@NonNull Class<?> payloadType, String payload)
            throws JAXBException, ClassNotFoundException{

        //Get the ObjectFactory class that corresponds to the payload's type - this implementation should always work
        //because the payloadType class should always have its ObjectFactory adjacent to it in the same package
        Class<?> objectFactoryClass = Class.forName(payloadType.getPackage().getName() + ".ObjectFactory");

        //Use the ObjectFactory class that corresponds to the payload's type for the unmarshaller's context
        JAXBContext context = JAXBContext.newInstance(objectFactoryClass);
        Unmarshaller unmarshaller = context.createUnmarshaller();

        //Unmarshal - quick hack using an InputStream to eat the String payload
        return (JAXBElement<?>) unmarshaller.unmarshal(new ByteArrayInputStream(payload.getBytes()));

    }

}
