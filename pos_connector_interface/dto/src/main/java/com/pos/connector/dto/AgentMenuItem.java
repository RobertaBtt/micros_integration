package com.pos.connector.dto;

import lombok.Getter;
import lombok.Setter;


/***
 * @doc: An item is the object that can be part of an order. could be food, condiment, prefix condiment.
 */
@Getter
@Setter
public class AgentMenuItem {

    private String name;
    private String identifier;

    private AgentMenuItemTypesEnum itemType;


    public AgentMenuItem(String name, String identifier, AgentMenuItemTypesEnum itemType) {
        this.name = name;
        this.identifier = identifier;
        this.itemType = itemType;
    }

    public AgentMenuItem() {
    }
}
