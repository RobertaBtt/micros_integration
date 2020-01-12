package com.connector.micros.porting.element;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.StringReader;

@XmlRootElement(name = "ServiceCharge")
public class ServiceCharge {

    private String obj;
    private String name;
    private String chargeTipTotal;

    public ServiceCharge() {
    }

    public ServiceCharge(String obj) {
        super();
        this.obj = obj;
    }

    @XmlElement(name = "obj")
    public String getObj() {
        return obj;
    }

    @XmlElement(name = "Name")
    public String getName() {
        return name;
    }


    public void setObj(String obj) {
        this.obj = obj;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static class Factory {

        public static ServiceCharge parse(String xml) throws Exception {

            JAXBContext jaxbContext = JAXBContext.newInstance(ServiceCharge.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            StringReader reader = new StringReader(xml);
            ServiceCharge object = (ServiceCharge) unmarshaller.unmarshal(reader);

            return object;
        }
    }


}

