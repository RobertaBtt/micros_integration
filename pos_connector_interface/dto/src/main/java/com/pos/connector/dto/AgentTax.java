package com.pos.connector.dto;

import com.pos.common.type.Money;
import lombok.Getter;
import lombok.Setter;


/***
 * @doc: A tax is an object that represents a Tax added to a product or to a list of products.
 */
@Getter
@Setter
public class AgentTax {

    private String name;
    private String identifier;
    private String subType;
    private Money amount;
    private String parentId;
    private String id;
    private Integer displayOrder;

    public AgentTax(String name, String subType, String identifier, Money amount, Integer displayOrder) {

        this.identifier = identifier;
        this.amount = amount;
        this.name = name;
        this.subType = subType;
    }

    public AgentTax() {
    }
}
