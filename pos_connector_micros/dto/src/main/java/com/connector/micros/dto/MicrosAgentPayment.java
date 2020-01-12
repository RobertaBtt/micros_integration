package com.connector.micros_micros.dto;

import com.connector.micros.dto.AgentPayment;
import com.connector.micros.dto.AgentPaymentTypesEnum;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


/***
 * @doc: A payment is used to close the order. It contains
 * the information about the payment method.
 */
@Getter
@Setter
public class MicrosAgentPayment extends AgentPayment {

    private int objectNumber;
    private int tendMedID;
    private String name;

    private AgentPaymentTypesEnum paymentType;


    @Builder
    public MicrosAgentPayment(String name, int tenderMediaId, int objectNumber, AgentPaymentTypesEnum paymentType) {
        this.name = name;
        this.tendMedID = tenderMediaId;
        this.objectNumber = objectNumber;
        this.paymentType = paymentType;

    }

    public String getIdentifier() {

        return this.objectNumber + "." + this.tendMedID;
    }

}
