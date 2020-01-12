package com.connector.micros.porting.element;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.StringReader;

@XmlRootElement(name = "Check")
public class Check {

    private Summary summary;
    private DetailLines detailLines;

    public Check() {
    }

    public Check(Summary summary) {
        super();
        this.summary = summary;
    }

    public Summary getSummary() {
        return this.summary;
    }


    public DetailLines getDetailLines() {
        return this.detailLines;
    }

    @XmlElement(name = "Summary")
    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    @XmlElement(name = "DetailLines")
    public void setDetailLines(DetailLines detailLines) {
        this.detailLines = detailLines;
    }

    public static class Factory {

        public static Check parse(String xml) throws Exception {

            JAXBContext jaxbContext = JAXBContext.newInstance(Check.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            StringReader reader = new StringReader(xml);
            //Object obj = unmarshaller.unmarshal(reader);

            Check object = (Check) unmarshaller.unmarshal(reader);

            return object;
        }
    }

}

