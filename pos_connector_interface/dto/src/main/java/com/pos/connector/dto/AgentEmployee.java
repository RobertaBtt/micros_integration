package com.pos.connector.dto;

import lombok.Getter;
import lombok.Setter;


/***
 * @doc: An employee is used, in some implementation of the POS Agent integrations,
 * like the waiter or employee of the merchant who manage the orders and closes them
 */
@Getter
@Setter
public class AgentEmployee {

    private String name;
    private String identifier;

    public AgentEmployee(String name, String identifier) {
        this.name = name;
        this.identifier = identifier;
    }

    public AgentEmployee() {
    }
}
