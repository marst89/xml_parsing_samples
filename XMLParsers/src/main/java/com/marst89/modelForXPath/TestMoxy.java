package com.marst89.modelForXPath;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * Created by marst89 on 7/13/2017.
 */
public class TestMoxy {
    public static String FILENAME = "XMLParsers/src/main/java/com/marst89/modelForXPath/anotherxml.xml";

    public static void main(String ... args) throws JAXBException {
        File file = new File(FILENAME);
        //Example using Eclipse MOXy and XPath annotation
        JAXBContext jaxbContext = JAXBContext.newInstance("com.marst89.modelForXPath");
        //Ensuring we are using MOXy implementation
        System.out.println("jaxbContext is:" + jaxbContext.toString());
        if (!(jaxbContext instanceof org.eclipse.persistence.jaxb.JAXBContext))
            return;
        Unmarshaller unmarshallerWithMoxy = jaxbContext.createUnmarshaller();
        com.marst89.modelForXPath.Person person = (com.marst89.modelForXPath.Person) unmarshallerWithMoxy.unmarshal(file);
        System.out.println("Person is : " + person.toString());
    }
}
