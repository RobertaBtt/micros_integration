package com.connector.micros.porting.element;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DbMenuItemClass")
public class DbMenuItemClass {

    private int condimentPrefixType;
    private String objectNumber;
    private DbMenuItemClass.Name name;


    public DbMenuItemClass() {
    }

    @XmlElement(name = "Name")
    public DbMenuItemClass.Name getName() {
        return name;
    }

    @XmlElement(name = "CondimentPrefixType")
    public int getCondimentPrefixType() {
        return condimentPrefixType;
    }

    @XmlElement(name = "ObjectNumber")
    public String getObjectNumber() {
        return objectNumber;
    }

    public void setCondimentPrefixType(int condimentPrefixType) { this.condimentPrefixType = condimentPrefixType; }
    public void setObjectNumber(String objectNumber) { this.objectNumber = objectNumber; }
    public void setName(DbMenuItemClass.Name  name) {
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
