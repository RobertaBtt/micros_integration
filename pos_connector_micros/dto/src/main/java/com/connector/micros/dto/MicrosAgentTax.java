package com.connector.micros_micros.dto;

import com.connector.micros.dto.AgentTax;
import pos.common.type.Money;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


/***
 * @doc: A tax is an object that represents a Tax added to a product or to a list of products.
 */
@Getter
@Setter
public class MicrosAgentTax extends AgentTax {


    private int objectNumber;
    private String subType;
    private Money amount;
    private String name;
    private Integer displayOrder;

    private String parentId;
    private String id;


    @Builder
    public MicrosAgentTax(String name, String subType, Money amount ) {

        this.subType = subType;
        this.name = name;
        this.amount = amount;
    }

    public String getIdentifier() {
        return id;
    }


}
