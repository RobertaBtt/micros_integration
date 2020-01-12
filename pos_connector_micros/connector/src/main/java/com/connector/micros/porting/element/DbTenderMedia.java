package com.connector.micros.porting.element;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DbDiscount")
public class DbTenderMedia {

    private int tendMedID;
    private int objectNumber;
    private DbTenderMedia.Name name;


    public DbTenderMedia() {
    }

    public DbTenderMedia(int objectNumber) {
        super();
        this.objectNumber = objectNumber;
    }

    @XmlElement(name = "TendMedID")
    public int getTendMediaID() {
        return tendMedID;
    }

    @XmlElement(name = "ObjectNumber")
    public int getObjectNumber() {
        return objectNumber;
    }

    @XmlElement(name = "Name")
    public DbTenderMedia.Name getName() {
        return name;
    }

    public void setTendMedID(int tendMediaID) {
        this.tendMedID = tendMediaID;
    }

    public void setObjectNumber(int objectNumber) {
        this.objectNumber = objectNumber;
    }

    public void setName(DbTenderMedia.Name name) {
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
