package com.pos.connector.dto;

import lombok.Getter;
import lombok.Setter;


/***
 * @doc: A payment is used to close the order. It contains
 * the information about the payment method.
 */
@Getter
@Setter
public class AgentPayment {

    private String name;
    private String identifier;
    private String subType;
    private String description;
    private AgentPaymentTypesEnum paymentType;
    private Integer displayOrder;
    private boolean isChild;
    private String parentId;
    private String id;

    public AgentPayment(String name, String subType, String description, String identifier, AgentPaymentTypesEnum paymentType, Integer displayOrder) {
        this.name = name;
        this.description = description;
        this.identifier = identifier;
        this.paymentType = paymentType;
    }

    public AgentPayment() {
    }
}
