package com.connector.micros.porting.element;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.StringReader;
import java.math.BigDecimal;

@XmlRootElement(name = "DetailLine")
public class DetailLine {


    private String detailType;
    private String parentDetailLink;
    private TenderMedia tenderMedia;
    private BigDecimal total;
    private String voidLink;
    private String detailLink;
    private BigDecimal salesCount;
    private MenuItem menuItem;
    private taxTotals taxTotals;
    private Discount discount;
    private ServiceCharge serviceCharge;

    public DetailLine() {
    }

    public DetailLine(String detailType) {
        super();
        this.detailType = detailType;
    }

    @XmlElement(name = "ParentDetailLink")
    public String getParentDetailLink() {
        return parentDetailLink;
    }

    @XmlElement(name = "DetailType")
    public String getDetailType() {
        return detailType;
    }

    @XmlElement(name = "TenderMedia")
    public TenderMedia getTenderMedia() {
        return tenderMedia;
    }

    @XmlElement(name = "VoidLink")
    public String getVoidLink() {
        return voidLink;
    }

    @XmlElement(name = "DetailLink")
    public String getDetailLink() {
        return detailLink;
    }

    @XmlElement(name = "Total")
    public BigDecimal getTotal() {
        return total;
    }

    @XmlElement(name = "SalesCount")
    public BigDecimal getSalesCount() {
        return salesCount;
    }

    @XmlElement(name = "MenuItem")
    public MenuItem getMenuItem() {
        return menuItem;
    }

    @XmlElement(name = "taxTotals")
    public taxTotals getTaxTotals() {
        return taxTotals;
    }

    @XmlElement(name = "Discount")
    public Discount getDiscount() {
        return discount;
    }

    @XmlElement(name = "ServiceCharge")
    public ServiceCharge getServiceCharge() {
        return serviceCharge;
    }

    public void setDetailType(String detailType) {
        this.detailType = detailType;
    }

    public void setParentDetailLink(String parentDetailLink) {
        this.parentDetailLink = parentDetailLink;
    }

    public void setTenderMedia(TenderMedia tenderMedia) {
        this.tenderMedia = tenderMedia;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public void setVoidLink(String voidLink) {
        this.voidLink = voidLink;
    }

    public void setDetailLink(String DetailLink) {
        this.detailLink = DetailLink;
    }

    public void setSalesCount(BigDecimal salesCount) {
        this.salesCount = salesCount;
    }

    public void setMenuItem(MenuItem menuItem) {
        this.menuItem = menuItem;
    }

    public void setTaxTotals(taxTotals taxTotals) {
        this.taxTotals = taxTotals;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public void setServiceCharge(ServiceCharge serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public static class Factory {

        public static DetailLine parse(String xml) throws Exception {

            JAXBContext jaxbContext = JAXBContext.newInstance(DetailLine.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            StringReader reader = new StringReader(xml);
            //Object obj = unmarshaller.unmarshal(reader);

            DetailLine object = (DetailLine) unmarshaller.unmarshal(reader);

            return object;
        }
    }


}

