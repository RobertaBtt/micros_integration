package com.connector.micros.porting.element;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.StringReader;

@XmlRootElement(name = "taxTotals")
public class taxTotals {

    private CGwTaxTotals cGwTaxTotals;

    public taxTotals() {
    }

    public taxTotals(String name) {
        super();
    }

    @XmlElement(name = "CGwTaxTotals")
    public CGwTaxTotals getCGwTaxTotals() {
        return cGwTaxTotals;
    }

    public void setCGwTaxTotals(CGwTaxTotals cGwTaxTotals) {
        this.cGwTaxTotals = cGwTaxTotals;
    }

    public static class Factory {

        public static taxTotals parse(String xml) throws Exception {

            JAXBContext jaxbContext = JAXBContext.newInstance(taxTotals.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            StringReader reader = new StringReader(xml);
            //Object obj = unmarshaller.unmarshal(reader);

            taxTotals object = (taxTotals) unmarshaller.unmarshal(reader);

            return object;
        }
    }


}

