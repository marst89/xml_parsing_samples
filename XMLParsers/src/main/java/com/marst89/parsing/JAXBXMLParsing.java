package com.marst89.parsing;

import javax.xml.bind.JAXBContext;



import com.marst89.xml.Shiporder;
import com.thoughtworks.xstream.XStream;

import java.io.File;
import java.io.FileReader;

/**
 * Created by marst89 on 7/12/2017.
 */
public class JAXBXMLParsing {
    public static String FILENAME = "XMLParsers/src/main/java/com/marst89/xml/sample.xml";

    public static void main(String ... args){
        try{
            File file = new File(FILENAME);
            JAXBContext context = JAXBContext.newInstance(Shiporder.class);
            javax.xml.bind.Unmarshaller jaxbUnmarshaller = context.createUnmarshaller();
            Shiporder shiporder = (Shiporder) jaxbUnmarshaller.unmarshal(file);

            System.out.println(shiporder.getOrderid());
            System.out.println(shiporder.getOrderperson());

            /*Try with castor without spring usage to see what will happen*/
            FileReader reader = new FileReader(FILENAME);
            Shiporder shiporder1 = (Shiporder) org.exolab.castor.xml.Unmarshaller.unmarshal(Shiporder.class, reader);
            System.out.println(shiporder1.getOrderperson());

            /*Xstream seems to need aliases to be set in order to recognize class, otherwise it throws an exceptio
                com.thoughtworks.xstream.mapper.CannotResolveClassException
             */
            XStream xStream = new XStream();
            //the autodetect did not work
            //xStream.autodetectAnnotations(true);
            xStream.alias("shiporder", com.marst89.modelForXstream.Shiporder.class);
            xStream.aliasAttribute(com.marst89.modelForXstream.Shiporder.class, "orderid", "orderid");
            com.marst89.modelForXstream.Shiporder shiporder2 = (com.marst89.modelForXstream.Shiporder) xStream.fromXML(new FileReader(FILENAME));
            System.out.println(shiporder2.getOrderperson());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
