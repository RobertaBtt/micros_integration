package com.connector.micros_micros.dto;

import com.connector.micros.dto.AgentProduct;
import pos.common.type.Money;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


/***
 * @doc: A Micros Product
 */
@Getter
@Setter
public class MicrosAgentProduct extends AgentProduct {

    private String name;
    private String subType;
    private Long objectNumber;
    private BigDecimal quantity;
    private Money amount;
    private MicrosAgentDiscount discount;
    private Integer displayOrder;
    private String parentId;
    private String id;

    @Builder
    public MicrosAgentProduct(String name, String subType, Long objectNumber, BigDecimal quantity, Money amount, MicrosAgentDiscount discount, Integer displayOrder) {

        this.name = name;
        this.subType = subType;
        this.objectNumber = objectNumber;
        this.quantity = quantity;
        this.amount = amount;
        this.discount = discount;
        this.displayOrder = displayOrder;
    }


    public String getIdentifier() {
        return id;
    }


}
