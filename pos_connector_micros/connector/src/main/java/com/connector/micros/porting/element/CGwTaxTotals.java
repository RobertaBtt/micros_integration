package com.connector.micros.porting.element;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.StringReader;
import java.math.BigDecimal;

@XmlRootElement(name = "CGwTaxTotals")
public class CGwTaxTotals {

    private String name;
    private BigDecimal mTaxableTotal;
    private BigDecimal mTaxCollectedTotal;

    @XmlElement(name = "Name")
    public String getName() {
        return name;
    }

    @XmlElement(name = "mTaxableTotal")
    public BigDecimal getmTaxableTotal() {
        return mTaxableTotal;
    }

    @XmlElement(name = "mTaxCollectedTotal")
    public BigDecimal getmTaxCollectedTotal() {
        return mTaxCollectedTotal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setmTaxableTotal(BigDecimal mTaxableTotal) {
        this.mTaxableTotal = mTaxableTotal;
    }

    public void setmTaxCollectedTotal(BigDecimal mTaxCollectedTotal) {
        this.mTaxCollectedTotal = mTaxCollectedTotal;
    }

    public CGwTaxTotals() {
    }

    public CGwTaxTotals(String name) {
        super();
        this.name = name;
    }


    public static class Factory {

        public static CGwTaxTotals parse(String xml) throws Exception {

            JAXBContext jaxbContext = JAXBContext.newInstance(CGwTaxTotals.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            StringReader reader = new StringReader(xml);
            //Object obj = unmarshaller.unmarshal(reader);

            CGwTaxTotals object = (CGwTaxTotals) unmarshaller.unmarshal(reader);

            return object;
        }
    }


}

