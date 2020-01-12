package com.pos.connector.data_converter;

import com.pos.connector.dto.AgentOrder;

public interface AgentDataConverterInterface {


    /***
     * @param agentOrder is the interface of the Agent Order, is the generic one
     * @return the converted, through the specific implemented mapper, the PosOrder, understandable by Ordering
     */
    public com.pos.connector.dto.AgentOrder convert(AgentOrder agentOrder);
}
