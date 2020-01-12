package com.connector.micros.porting.element;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

@XmlRootElement(name = "DbDiscount")
public class DbDiscount {

    private String objectNumber;
    private String dscntID;
    private String optionBits;
    private DbDiscount.Name name;
    private BigDecimal percentage;
    private BigDecimal amount;


    public DbDiscount() {
    }

    public DbDiscount(String objectNumber) {
        super();
        this.objectNumber = objectNumber;
    }

    @XmlElement(name = "ObjectNumber")
    public String getObjectNumber() {
        return objectNumber;
    }

    @XmlElement(name = "DscntID")
    public String getDscntID() {
        return dscntID;
    }

    @XmlElement(name = "OptionBits")
    public String getOptionBits() {
        return optionBits;
    }

    @XmlElement(name = "Name")
    public DbDiscount.Name getName() {
        return name;
    }

    @XmlElement(name = "Percentage")
    public BigDecimal getPercentage() {
        return percentage;
    }

    @XmlElement(name = "Amount")
    public BigDecimal getAmount() {
        return amount;
    }


    public void setObjectNumber(String objectNumber) {
        this.objectNumber = objectNumber;
    }

    public void setDscntID(String dscntID) {
        this.dscntID = dscntID;
    }

    public void setOptionBits(String optionBits) {
        this.optionBits = optionBits;
    }

    public void setName(DbDiscount.Name name) {
        this.name = name;
    }

    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @XmlRootElement(name = "Name")
    public static class Name {

        private String stringText;

        public Name() {
        }

        @XmlElement(name = "StringText")
        public String getStringText() {
            return stringText;
        }

        public void setStringText(String stringText) {
            this.stringText = stringText;
        }

    }


}
