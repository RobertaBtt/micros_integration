package com.connector.micros_micros.dto;

import com.connector.micros.dto.AgentCurrency;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


/***
 * @doc: A currency is the entity that identifies the Monetary Currency
 * detected in the POS.
 */
@Getter
@Setter
public class MicrosAgentCurrency extends AgentCurrency {

    private String currencyID;
    private String objectNumber;
    private String name;
    private String symbol;


    @Builder
    public MicrosAgentCurrency(String currencyID, String name, String symbol, String objectNumber) {

        this.currencyID = currencyID;
        this.name = name;
        this.symbol = symbol;
        this.objectNumber = objectNumber;
    }


    @Override
    public String getIdentifier() {

        return this.objectNumber + "." + this.currencyID;
    }
}
