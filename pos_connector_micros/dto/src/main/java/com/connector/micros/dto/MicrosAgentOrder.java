package com.connector.micros_micros.dto;

import com.connector.micros.dto.*;
import pos.common.type.Money;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;


@Getter
@Setter
public class MicrosAgentOrder extends AgentOrder {

    public MicrosAgentOrder() {
    }

    public MicrosAgentOrder(AgentOrderType orderType, int tableNumber, Money totalDue, Long openTime) {
        this.identifier = identifier;
        this.orderType = orderType;
        this.tableNumber = tableNumber;
        this.totalDue = totalDue;
        this.openTime = openTime;
    }


    @Builder
    public MicrosAgentOrder(int number, int sequence, AgentOrderType orderType, int tableNumber, Money totalDue, Long openTime, Long lastServiceTime) {
        this.number = number;
        this.sequence = sequence;
        this.orderType = orderType;
        this.tableNumber = tableNumber;
        this.totalDue = totalDue;
        this.openTime = openTime;
        this.lastServiceTime = lastServiceTime;

    }


    public String getIdentifier() {

        return this.number + "." + this.sequence;
    }

    /***
     * @doc This is the checkNumber as it comes from the Micros POS
     * is a part of the identifier
     */
    private int number;


    /***
     * @doc This is the checkSequence as it comes from the Micros POS
     * is a part of the identifier
     */
    private int sequence;
    /***
     * @doc This is the POS number/id, or the POS list of numbers/ids, that come from the POS and
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
     * @doc the totality of the cost of the Order.
     */
    private Money total;

    /***
     * @doc the totality of the cost of the Order without the Vat value
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
     * @doc The currency represented by :
     * a: String symbol, a String name, a String identifier;*/
    private AgentCurrency currencyObject;


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
