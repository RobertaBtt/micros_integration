package com.connector.micros_micros.dto;

import com.connector.micros.dto.AgentEmployee;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


/***
 * @doc: An employee is used, in some implementation of the POS Agent integrations,
 * like the waiter or employee of the merchant who manage the orders and closes them
 */
@Getter
@Setter
public class MicrosAgentEmployee extends AgentEmployee {

    /***
     private String name;
     private String identifier;
     */


    private int objectNumber;
    private int employeeID;
    private int idNumber;
    private String lastName;
    private String firstName;
    private String checkName;

    private String name;
    private String identifier;

    @Builder
    public MicrosAgentEmployee(int objectNumber, int employeeID, int idNumber, String firstName, String lastName, String checkName) {

        this.objectNumber = objectNumber;
        this.employeeID = employeeID;
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.checkName = checkName;
    }

    public String getIdentifier() {

        return this.objectNumber + "." + this.employeeID;

    }

    @Override
    public String getName() {
        return this.checkName;
    }
}
