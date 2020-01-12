package com.pos.connector.dto;

import lombok.Getter;
import lombok.Setter;


/***
 * @doc: A currency is the entity that identifies the Monetary Currency
 * detected in the POS.
 */
@Getter
@Setter
public class AgentCurrency {

    private String name;
    private String identifier;
    private String symbol;

    public AgentCurrency(String symbol, String name, String identifier) {
        this.symbol = symbol;
        this.name = name;
        this.identifier = identifier;
    }

    public AgentCurrency() {
    }

}
