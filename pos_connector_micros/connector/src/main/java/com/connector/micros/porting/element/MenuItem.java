package com.connector.micros.porting.element;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.StringReader;

@XmlRootElement(name = "MenuItem")
public class MenuItem {


    private String name;
    private String obj;


    public MenuItem() {
    }

    public MenuItem(String name) {
        super();
        this.name = name;
    }

    @XmlElement(name = "Name")
    public String getName() {
        return name;
    }

    @XmlElement(name = "obj")
    public String getObj() {
        return obj;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setObj(String obj) {
        this.obj = obj;
    }

    public static class Factory {

        public static MenuItem parse(String xml) throws Exception {

            JAXBContext jaxbContext = JAXBContext.newInstance(MenuItem.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            StringReader reader = new StringReader(xml);

            MenuItem object = (MenuItem) unmarshaller.unmarshal(reader);

            return object;
        }
    }


}

