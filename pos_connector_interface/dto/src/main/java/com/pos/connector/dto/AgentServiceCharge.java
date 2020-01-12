package com.pos.connector.dto;

import com.pos.common.type.Money;
import lombok.Getter;
import lombok.Setter;


/***
 * @doc: A Service Charge is used to apply the amout of the Service to the Order.
 * A Service Charge has an amount.
 */
@Getter
@Setter
public class AgentServiceCharge {

    private String name;
    private String identifier;
    private String subType;

    private Money percentageAmount;
    private Money fixedAmount;
    private AgentServiceChargeTypesEnum serviceChargeType;
    private Integer displayOrder;
    private String parentId;
    private String id;

    public AgentServiceCharge(String name, String subType, String identifier, Money percentageAmount, Money fixedAmount, AgentServiceChargeTypesEnum serviceChargeType, Integer displayOrder) {
        this.name = name;
        this.subType = subType;
        this.identifier = identifier;
        this.percentageAmount = percentageAmount;
        this.fixedAmount = fixedAmount;
        this.serviceChargeType = serviceChargeType;
        this.displayOrder = displayOrder;
    }

    public AgentServiceCharge() {
    }
}
