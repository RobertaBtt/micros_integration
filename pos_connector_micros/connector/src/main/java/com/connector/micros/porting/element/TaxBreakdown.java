package com.connector.micros.porting.element;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.StringReader;

@XmlRootElement(name = "TaxBreakdown")
public class TaxBreakdown {

    private ArrayOfTaxTotal arrayOfTaxTotal;

    public TaxBreakdown() {
    }

    public TaxBreakdown(ArrayOfTaxTotal arrayOfTaxTotal) {
        super();
        this.arrayOfTaxTotal = arrayOfTaxTotal;
    }


    @XmlElement(name = "ArrayOfTaxTotal")
    public ArrayOfTaxTotal getArrayOfTaxTotal() {
        return arrayOfTaxTotal;
    }

    public void setArrayOfTaxTotal(ArrayOfTaxTotal arrayOfTaxTotal) {
        this.arrayOfTaxTotal = arrayOfTaxTotal;
    }


    public static class Factory {

        public static TaxBreakdown parse(String xml) throws Exception {

            JAXBContext jaxbContext = JAXBContext.newInstance(TaxBreakdown.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            StringReader reader = new StringReader(xml);
            //Object obj = unmarshaller.unmarshal(reader);

            TaxBreakdown object = (TaxBreakdown) unmarshaller.unmarshal(reader);

            return object;
        }
    }


}

