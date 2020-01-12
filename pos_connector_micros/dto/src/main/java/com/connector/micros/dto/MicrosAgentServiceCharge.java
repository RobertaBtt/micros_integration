package com.connector.micros_micros.dto;

import com.connector.micros.dto.AgentServiceCharge;
import com.connector.micros.dto.AgentServiceChargeTypesEnum;
import pos.common.type.Money;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


/***
 * @doc: A Micros Service Charge
 * Depending on the type, could have setted the amount or the percentage
 */
@Getter
@Setter
public class MicrosAgentServiceCharge extends AgentServiceCharge {


    private String name;
    private String objectNumber;
    private String serviceChargeID;
    private Money percentageAmount;
    private Money fixedAmount;
    private AgentServiceChargeTypesEnum serviceChargeType;
    private Integer displayOrder;
    private String parentId;
    private String id;

    @Builder
    public MicrosAgentServiceCharge(String objectNumber, String serviceChargeID, String name, Money percentageAmount, Money fixedAmount, AgentServiceChargeTypesEnum serviceChargeType, Integer displayOrder) {
        this.objectNumber = objectNumber;
        this.serviceChargeID = serviceChargeID;
        this.name = name;
        this.percentageAmount = percentageAmount;
        this.fixedAmount = fixedAmount;
        this.serviceChargeType = serviceChargeType;
        this.displayOrder = displayOrder;
    }

    public String getIdentifier() {

        return this.id;
    }
}
