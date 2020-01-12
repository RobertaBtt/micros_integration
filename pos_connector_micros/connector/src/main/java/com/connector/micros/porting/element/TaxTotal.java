package com.connector.micros.porting.element;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.StringReader;
import java.math.BigDecimal;


@SuppressWarnings({"unchecked", "unused"})
@XmlRootElement(name = "TaxTotal")
public class TaxTotal {

    private String name;
    private BigDecimal taxableTotal;


    public TaxTotal() {
    }

    public TaxTotal(String name) {
        super();
        this.name = name;
    }

    @XmlElement(name = "Name")
    public String getName() {
        return name;
    }

    @XmlElement(name = "TaxableTotal")
    public BigDecimal getTaxableTotal() {
        return taxableTotal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTaxableTotal(BigDecimal taxableTotal) {
        this.taxableTotal = taxableTotal;
    }

    public static class Factory {

        public static TaxTotal parse(String xml) throws Exception {

            JAXBContext jaxbContext = JAXBContext.newInstance(TaxTotal.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            StringReader reader = new StringReader(xml);
            //Object obj = unmarshaller.unmarshal(reader);

            TaxTotal object = (TaxTotal) unmarshaller.unmarshal(reader);

            return object;
        }
    }


}
