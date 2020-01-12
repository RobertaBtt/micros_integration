package com.connector.micros.porting.element;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Discount")
public class Discount {

    private String obj;
    private String dscDbId;
    private String name;


    public Discount() {
    }

    public Discount(String obj) {
        super();
        this.obj = obj;
    }

    @XmlElement(name = "obj")
    public String getObj() {
        return obj;
    }

    @XmlElement(name = "Name")
    public String getName() {
        return name;
    }


    @XmlElement(name = "dscDbId")
    public String getDscDbId() {
        return dscDbId;
    }

    public void setObj(String obj) {
        this.obj = obj;
    }

    public void setDscDbId(String dscDbId) {
        this.dscDbId = dscDbId;
    }

    public void setName(String name) {
        this.name = name;
    }


}
