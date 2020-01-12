package com.pos.connector.data_modifier;

import com.pos.connector.dto.AgentOrder;
import com.pos.connector.dto.PosException;
import com.pos.connector.dto.PosRequest;

public interface AgentOrderModifierInterface {

    /***
     * @doc addPaymentRequest
     * @param addPaymentRequest contains the parameters in form: key-value
     */
    public AgentOrder addPayment(PosRequest addPaymentRequest) throws PosException;


}
