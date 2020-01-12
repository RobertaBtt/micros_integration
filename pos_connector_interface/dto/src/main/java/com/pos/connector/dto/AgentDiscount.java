package com.pos.connector.dto;

import com.pos.common.type.Money;
import lombok.Getter;
import lombok.Setter;


/***
 * @doc: A discount is used to apply one or more discount to the Order.
 * A Discount has a description, and, according to the type,
 * an amount or a percentage.
 */
@Getter
@Setter
public class AgentDiscount {

    private String name;
    private String identifier;
    private String subType;
    private Money percentageAmount;
    private Money fixedAmount;
    private AgentDiscountTypesEnum discountType;
    private Integer displayOrder;
    private String parentId;
    private String id;

    public AgentDiscount(String name, String subType, String identifier, Money percentageAmount, Money fixedAmount, AgentDiscountTypesEnum discountType, Integer displayOrder) {
        this.name = name;
        this.subType = subType;
        this.identifier = identifier;
        this.percentageAmount = percentageAmount;
        this.fixedAmount = fixedAmount;
        this.discountType = discountType;
        this.displayOrder = displayOrder;

    }

    public AgentDiscount() {
    }
}
