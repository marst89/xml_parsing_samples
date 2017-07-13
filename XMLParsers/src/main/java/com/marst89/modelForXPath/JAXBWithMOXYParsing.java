package com.marst89.modelForXPath;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * Created by MariaP on 7/13/2017.
 */
public class JAXBWithMOXYParsing {
    public static String FILENAME = "XMLParsers/src/main/java/com/marst89/xml/sample.xml";
    public static String FILENAME1 = "XMLParsers/src/main/java/com/marst89/xml/sample2.xml";

    public static void main(String ... args) throws JAXBException {
        File file = new File(FILENAME);
        //Example using Eclipse MOXy and XPath annotation
        JAXBContext jaxbContext = JAXBContext.newInstance(com.marst89.modelForXPath.Shiporder.class);
        //Ensuring we are using MOXy implementation
        System.out.println("jaxbContext is:" + jaxbContext.toString());
        if(!(jaxbContext instanceof org.eclipse.persistence.jaxb.JAXBContext))
            return;
        Unmarshaller unmarshallerWithMoxy = jaxbContext.createUnmarshaller();
        com.marst89.modelForXPath.Shiporder shiporder3 = (com.marst89.modelForXPath.Shiporder)unmarshallerWithMoxy.unmarshal(file);
        System.out.println("Destination city is : "+shiporder3.getDestinationAddress());
        System.out.println("Item title is : "+shiporder3.getItemTitle());
        System.out.println("Order id is: "+ shiporder3.getOrderid());

        File file1 = new File(FILENAME1);
        //Example using Eclipse MOXy and XPath annotation
        JAXBContext jaxbContext1 = JAXBContext.newInstance(com.marst89.modelForXPath.ShiporderChanged.class);
        //Ensuring we are using MOXy implementation
        System.out.println("jaxbContext is:" + jaxbContext1.toString());
        if(!(jaxbContext instanceof org.eclipse.persistence.jaxb.JAXBContext))
            return;
        Unmarshaller unmarshallerWithMoxy2 = jaxbContext1.createUnmarshaller();
        com.marst89.modelForXPath.ShiporderChanged shiporder4 = (com.marst89.modelForXPath.ShiporderChanged)unmarshallerWithMoxy2.unmarshal(file1);
        System.out.println("Destination city is : "+shiporder4.getDestinationAddress());
        System.out.println("Order id is: "+ shiporder4.getOrderid());

    }
}
