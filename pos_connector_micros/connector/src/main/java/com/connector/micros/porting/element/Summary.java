package com.connector.micros.porting.element;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.StringReader;
import java.math.BigDecimal;

@XmlRootElement(name = "Summary")
public class Summary {

    private int checkNumber;
    private int orderTypeID;
    private int orderTypeObjNum;
    private BigDecimal subTotal;
    private BigDecimal tax;
    private BigDecimal due;
    private String checkOpenTime;
    private int diningTableID;
    private int diningTableObjNum;
    private TaxBreakdown taxBreakdown;


    public Summary() {
    }

    public Summary(int checkNumber) {
        super();
        this.checkNumber = checkNumber;
    }

    @XmlElement(name = "CheckNumber")
    public int getCheckNumber() {
        return checkNumber;
    }

    @XmlElement(name = "SubTotal")
    public BigDecimal getSubTotal() {
        return subTotal;
    }

    @XmlElement(name = "Tax")
    public BigDecimal getTax() {
        return tax;
    }

    @XmlElement(name = "Due")
    public BigDecimal getDue() {
        return due;
    }

    @XmlElement(name = "OrderTypeID")
    public int getOrderTypeID() {
        return orderTypeID;
    }

    @XmlElement(name = "OrderTypeObjNum")
    public int getOrderTypeObjNum() {
        return orderTypeObjNum;
    }

    @XmlElement(name = "CheckOpenTime")
    public String getCheckOpenTime() {
        return checkOpenTime;
    }

    @XmlElement(name = "DiningTableID")
    public int getDiningTableID() {
        return diningTableID;
    }

    @XmlElement(name = "DiningTableObjNum")
    public int getDiningTableObjNum() {
        return diningTableObjNum;
    }


    @XmlElement(name = "TaxBreakdown")
    public TaxBreakdown getTaxBreakdown() {
        return taxBreakdown;
    }

    public void setCheckNumber(int checkNumber) {
        this.checkNumber = checkNumber;
    }

    public void setOrderTypeID(int orderTypeID) {
        this.orderTypeID = orderTypeID;
    }

    public void setOrderTypeObjNum(int orderTypeObjNum) {
        this.orderTypeObjNum = orderTypeObjNum;
    }

    public void setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public void setDue(BigDecimal due) {
        this.due = due;
    }

    public void setCheckOpenTime(String checkOpenTime) {
        this.checkOpenTime = checkOpenTime;
    }

    public void setDiningTableID(int diningTableID) {
        this.diningTableID = diningTableID;
    }

    public void setDiningTableObjNum(int diningTableObjNum) {
        this.diningTableObjNum = diningTableObjNum;
    }

    public void setTaxBreakdown(TaxBreakdown taxBreakdown) {
        this.taxBreakdown = taxBreakdown;
    }


    public static class Factory {

        public static Summary parse(String xml) throws Exception {

            JAXBContext jaxbContext = JAXBContext.newInstance(Summary.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            StringReader reader = new StringReader(xml);
            //Object obj = unmarshaller.unmarshal(reader);

            Summary object = (Summary) unmarshaller.unmarshal(reader);

            return object;
        }
    }


}

