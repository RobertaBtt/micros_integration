package com.pos.connector.dto;


import com.pos.common.type.Money;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;


/**
 * Every simple data is String
 * Every composed data is an Item
 */

@Getter
@Setter
public class AgentOrder {

    public AgentOrder() {
    }

    public AgentOrder(String identifier, AgentOrderType orderType, int tableNumber, Money totalDue, Long openTime) {
        this.identifier = identifier;
        this.orderType = orderType;
        this.tableNumber = tableNumber;
        this.totalDue = totalDue;
        this.openTime = openTime;
    }


    /***
     * @doc This is the POS number/id, that come from the POS and
     * that allow to identify the Order inside the POS
     */
    private String identifier;


    /***
     * @doc This is the unique UUID provided by  during the installation of the Agent.
     */
    private UUID agentInstallationUUID;


    /***
     * @doc the Order type could be: Eat In | Take out
     * Could be mandatory in some POS implementation to close the order
     */
    private AgentOrderType orderType;


    /***
     * @doc This is the number of the table as we see in the human readable way.
     */
    private int tableNumber;


    /***
     * @doc The total of the Order.
     */
    private Money total;

    /***
     * @doc The total of the Order without the Vat value
     */
    private Money subtotal;

    /***
     * @doc How much remains to pay to close the Order
     */
    private Money totalDue;

    /***
     * @doc the Sum of all the Tip Added to the Order
     */
    private Money tipAmount;

    /***
     * @doc The not-formatted time when the Order was opened, as it comes from the POS
     */
    private Long openTime;

    /***
     * @doc The not-formatted time when the Order was closed, as it comes from the POS
     */
    private Long closeTime;

    /***
     * @doc The not-formatted time when the Order was modified the last time, as it comes from the POS
     */
    private Long lastServiceTime;

    /***
     * @doc The list of the menu item in the Order
     */
    List<AgentProduct> products;

    /***
     * @doc The list of the Discounts applied to the Order
     */
    List<AgentDiscount> discounts;


    /***
     * @doc The list of the Discounts applied to the Order
     */
    List<AgentServiceCharge> serviceCharges;


    /***
     * @doc The list of the Taxes applied to the Order
     */
    List<AgentTax> taxes;


}
