package com.pos.connector.dto;

import lombok.Getter;
import lombok.Setter;


/***
 * @doc: An order type has one or more number, that identifies it in the POS,
 * and at least one human-readable description
 */
@Getter
@Setter
public class AgentOrderType {

    private String description;
    private String identifier;

}
