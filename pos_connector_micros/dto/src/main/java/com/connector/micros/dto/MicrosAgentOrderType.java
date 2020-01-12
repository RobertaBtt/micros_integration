package com.connector.micros_micros.dto;

import com.connector.micros.dto.AgentOrderType;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


/***
 * @doc: An order type has one or more number, that identifies it in the POS,
 * and at least one human-readable description
 */
@Getter
@Setter
public class MicrosAgentOrderType extends AgentOrderType {

    private int orderTypeID;
    private int orderTypeObjectNumber;
    private String name;


    /* When we retrieve the list of the orders, we have the tag, CheckOrderType
     * When we retrieve the details of an order, we have: OrderTypeDbId
     */

    /***
     * @param orderTypeID could be treated ad an identificator of the object inside the POS database
     */
    @Builder
    public MicrosAgentOrderType(int orderTypeID, int orderTypeObjectNumber, String name) {

        this.orderTypeID = orderTypeID;
        this.orderTypeObjectNumber = orderTypeObjectNumber;
        this.name = name;
    }

    public String getIdentifier() {

        return this.orderTypeObjectNumber + "." + this.orderTypeID;
    }

    public MicrosAgentOrderType() {
    }

}
