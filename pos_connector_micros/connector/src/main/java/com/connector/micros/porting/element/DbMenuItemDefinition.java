package com.connector.micros.porting.element;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DbMenuItemDefinition")
public class DbMenuItemDefinition {

    private String menuItemClassObjNum;
    private String miMasterObjNum;
    private DbMenuItemDefinition.Name1 name1;



    public DbMenuItemDefinition() {
    }

    public DbMenuItemDefinition(String menuItemClassObjNum) {
        super();
        this.menuItemClassObjNum = menuItemClassObjNum;
    }


    @XmlElement(name = "MenuItemClassObjNum")
    public String getMenuItemClassObjNum() {
        return menuItemClassObjNum;
    }

    @XmlElement(name = "MiMasterObjNum")
    public String getMiMasterObjNum() {
        return miMasterObjNum;
    }

    @XmlElement(name = "Name1")
    public DbMenuItemDefinition.Name1 getName1() {
        return name1;
    }


    public void setMenuItemClassObjNum(String menuItemClassObjNum) {
        this.menuItemClassObjNum = menuItemClassObjNum;
    }

    public void setMiMasterObjNum(String miMasterObjNum) {
        this.miMasterObjNum = miMasterObjNum;
    }


    @XmlRootElement(name = "Name1")
    public static class Name1 {

        private String stringText;

        public Name1() {
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
