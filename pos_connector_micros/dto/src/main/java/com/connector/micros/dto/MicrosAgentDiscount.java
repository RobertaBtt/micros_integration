package com.connector.micros_micros.dto;

import com.connector.micros.dto.AgentDiscount;
import com.connector.micros.dto.AgentDiscountTypesEnum;
import pos.common.type.Money;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


/***
 * @doc: A Micros Discount has the ObjectNumber and the DscntID,
 * A Discount is use to modify the Order.
 * Depending on the type, could have setted the amount or the percentage
 */
@Getter
@Setter
public class MicrosAgentDiscount extends AgentDiscount {


    private String name;
    private String objectNumber;
    private String discountID;
    private String subType;
    private Money percentageAmount;
    private Money fixedAmount;
    private Integer displayOrder;
    private AgentDiscountTypesEnum discountType;
    private String parentId;
    private String id;

    @Builder
    public MicrosAgentDiscount( String name, String subType, String objectNumber, String discountID, Money percentageAmount, Money fixedAmount, AgentDiscountTypesEnum discountType, Integer displayOrder) {
        this.name = name;
        this.subType = subType;
        this.objectNumber = objectNumber;
        this.discountID = discountID;

        this.percentageAmount = percentageAmount;
        this.fixedAmount = fixedAmount;
        this.discountType = discountType;
        this.displayOrder = displayOrder;

    }

    public String getIdentifier() {

        return this.id;
    }
}
