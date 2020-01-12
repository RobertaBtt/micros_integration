package com.connector.micros.porting.element;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.StringReader;

@XmlRootElement(name = "TenderMedia")
public class TenderMedia {

    private int obj;
    private String name;
    private String chargeTipTotal;

    public TenderMedia() {
    }

    public TenderMedia(int obj) {
        super();
        this.obj = obj;
    }

    @XmlElement(name = "obj")
    public int getObj() {
        return obj;
    }

    @XmlElement(name = "Name")
    public String getName() {
        return name;
    }

    @XmlElement(name = "ChargeTipTotal")
    public String getChargeTipTotal() {
        return chargeTipTotal;
    }


    public void setObj(int obj) {
        this.obj = obj;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setChargeTipTotal(String chargeTipTotal) {
        this.chargeTipTotal = chargeTipTotal;
    }


    public static class Factory {

        public static TenderMedia parse(String xml) throws Exception {

            JAXBContext jaxbContext = JAXBContext.newInstance(TenderMedia.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            StringReader reader = new StringReader(xml);
            //Object obj = unmarshaller.unmarshal(reader);

            TenderMedia object = (TenderMedia) unmarshaller.unmarshal(reader);

            return object;
        }
    }


}

