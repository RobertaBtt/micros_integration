package com.connector.micros.porting.element;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DbDiscount")
public class DbEmployee {

    private int objectNumber;
    private String firstName;
    private String lastName;
    private String checkName;
    private int employeeID;
    private int idNumber;

    public DbEmployee() {
    }

    public DbEmployee(int objectNumber) {
        super();
        this.objectNumber = objectNumber;
    }

    @XmlElement(name = "ObjectNumber")
    public int getObjectNumber() {
        return objectNumber;
    }

    @XmlElement(name = "EmployeeID")
    public int getEmployeeID() {
        return employeeID;
    }

    @XmlElement(name = "FirstName")
    public String getFirstName() {
        return firstName;
    }

    @XmlElement(name = "LastName")
    public String getLastName() {
        return lastName;
    }

    @XmlElement(name = "CheckName")
    public String getCheckName() {
        return checkName;
    }


    @XmlElement(name = "IdNumber")
    public int getIdNumber() {
        return idNumber;
    }


    public void setObjectNumber(int objectNumber) {
        this.objectNumber = objectNumber;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCheckName(String checkName) {
        this.checkName = checkName;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }


}
