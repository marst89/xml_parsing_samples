package com.marst89.parsing;

import com.marst89.core.XMLConverter;
import com.marst89.xml.Shiporder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by marst89 on 7/12/2017.
 */
public class SpringOXMExample {
    public static String XML_FILE_NAME = "XMLParsers/src/main/java/com/marst89/xml/sample.xml";
    public static void main(String[] args) throws IOException {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");
        XMLConverter converter = (XMLConverter) appContext.getBean("XMLConverter");
        //from XML to object
        Shiporder shiporder = (Shiporder) converter.convertFromXMLToObject(XML_FILE_NAME);
        System.out.println("Using castor marshaller");
        System.out.println(shiporder.getOrderid());
        System.out.println(shiporder.getOrderperson());

        XMLConverter withJaxbConverter = (XMLConverter) appContext.getBean("XMLConverterWithJAXB2");
        Shiporder shiporder1 = (Shiporder) withJaxbConverter.convertFromXMLToObject(XML_FILE_NAME);
        System.out.println("Using jaxb2 marshaller");
        System.out.println(shiporder1.getOrderid());
        System.out.println(shiporder1.getOrderperson());

        //Both below work correctly
//        XMLConverter withXStreamMarshaller = (XMLConverter) appContext.getBean("XMLConverterWithXstream");
//        com.marst89.modelForXstream.Shiporder shiporder2 = (com.marst89.modelForXstream.Shiporder) withXStreamMarshaller.convertFromXMLToObject(XML_FILE_NAME);
//        System.out.println("Using xstream marshaller");
//        System.out.println(shiporder2.getOrderid());
//        System.out.println(shiporder2.getOrderperson());

        XMLConverter withXStreamMarshaller = (XMLConverter) appContext.getBean("XMLConverterWithXstream");
        Shiporder shiporder2 = (Shiporder) withXStreamMarshaller.convertFromXMLToObject(XML_FILE_NAME);
        System.out.println("Using xstream marshaller");
        System.out.println(shiporder2.getOrderid());
        System.out.println(shiporder2.getOrderperson());
    }
}
