package com.connector.micros.porting.element;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DbOrderType")
public class DbOrderType {

    private int ordTypeID;
    private int ordTypeIndex;
    private Name name;

    public DbOrderType() {
    }

    public DbOrderType(int ordTypeID) {
        super();
        this.ordTypeID = ordTypeID;
    }

    @XmlElement(name = "OrdTypeID")
    public int getOrdTypeID() {
        return ordTypeID;
    }

    @XmlElement(name = "OrdTypeIndex")
    public int getOrdTypeIndex() {
        return ordTypeIndex;
    }

    @XmlElement(name = "Name")
    public Name getName() {
        return name;
    }


    public void setOrdTypeID(int ordTypeID) {
        this.ordTypeID = ordTypeID;
    }

    public void setOrdTypeIndex(int ordTypeIndex) {
        this.ordTypeIndex = ordTypeIndex;
    }

    public void setName(Name name) {
        this.name = name;
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
