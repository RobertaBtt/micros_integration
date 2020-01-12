package com.pos.connector.dto;

import com.pos.common.type.Money;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


/***
 * @doc: A product is a the product item contained in a Order.
 * A Product has a quantity, an amount, and a not-mandatory discount.
 */
@Getter
@Setter
public class AgentProduct {


    private String name;
    private String identifier;
    private String subType;
    private BigDecimal quantity;
    private Money amount;
    private AgentDiscount discount;
    private Integer displayOrder;
    private String parentId;
    private String id;

    public AgentProduct(String name, String subType, String identifier, BigDecimal quantity, Money amount, AgentDiscount discount, Integer displayOrder) {

        this.name = name;
        this.subType = subType;
        this.identifier = identifier;
        this.quantity = quantity;
        this.amount = amount;
        this.discount = discount;
        this.displayOrder = displayOrder;
    }

    public AgentProduct() {
    }
}
