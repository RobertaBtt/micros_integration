package com.connector.micros.porting.element;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.StringReader;


@SuppressWarnings({"unchecked", "unused"})
@XmlRootElement(name = "ArrayOfTaxTotal")
public class ArrayOfTaxTotal {

    private TaxTotal taxTotal;


    public ArrayOfTaxTotal() {
    }

    public ArrayOfTaxTotal(TaxTotal taxTotal) {
        super();
        this.taxTotal = taxTotal;
    }

    @XmlElement(name = "TaxTotal")
    public TaxTotal getTaxTotal() {
        return taxTotal;
    }

    public void setTaxTotal(TaxTotal taxTotal) {
        this.taxTotal = taxTotal;
    }

    public static class Factory {

        public static ArrayOfTaxTotal parse(String xml) throws Exception {

            JAXBContext jaxbContext = JAXBContext.newInstance(ArrayOfTaxTotal.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            StringReader reader = new StringReader(xml);
            //Object obj = unmarshaller.unmarshal(reader);

            ArrayOfTaxTotal object = (ArrayOfTaxTotal) unmarshaller.unmarshal(reader);

            return object;
        }
    }


}
