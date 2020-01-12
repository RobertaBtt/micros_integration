package com.connector.micros.porting.element;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.StringReader;

@SuppressWarnings({"unchecked", "unused"})
@XmlRootElement
public class MicrosSimphonyPosApi_DiscountResponseObject {


    public static class Factory {

        public static MicrosSimphonyPosApi_DiscountResponseObject parse(String xml) throws Exception {

            JAXBContext jaxbContext = JAXBContext.newInstance(MicrosSimphonyPosApi_DiscountResponseObject.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            StringReader reader = new StringReader(xml);
            MicrosSimphonyPosApi_DiscountResponseObject object = (MicrosSimphonyPosApi_DiscountResponseObject) unmarshaller.unmarshal(reader);

            return object;
        }
    }

}
