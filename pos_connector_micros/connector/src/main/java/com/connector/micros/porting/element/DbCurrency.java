package com.connector.micros.porting.element;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DbCurrency")
public class DbCurrency {

    private int objectNumber;
    private int currencyID;
    private DbCurrency.Name name;
    private DbCurrency.Symbol symbol;


    public DbCurrency() {
    }

    public DbCurrency(int objectNumber) {
        super();
        this.objectNumber = objectNumber;
    }

    @XmlElement(name = "CurrencyID")
    public int getCurrencyID() {
        return currencyID;
    }

    @XmlElement(name = "ObjectNumber")
    public int getObjectNumber() {
        return objectNumber;
    }

    @XmlElement(name = "Name")
    public DbCurrency.Name getName() {
        return name;
    }

    @XmlElement(name = "Symbol")
    public DbCurrency.Symbol getSymbol() {
        return symbol;
    }


    public void setObjectNumber(int objectNumber) {
        this.objectNumber = objectNumber;
    }

    public void setCurrencyID(int currencyID) {
        this.currencyID = currencyID;
    }

    public void setName(DbCurrency.Name name) {
        this.name = name;
    }

    public void setSymbol(DbCurrency.Symbol symbol) {
        this.symbol = symbol;
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


    @XmlRootElement(name = "Symbol")
    public static class Symbol {
        private String stringText;

        public Symbol() {
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
