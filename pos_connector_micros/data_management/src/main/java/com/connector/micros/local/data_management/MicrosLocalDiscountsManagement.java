package com.connector.micros.local.data_management;

import com.pos.connector.local.data_management.AgentLocalDiscountsManagementInterface;
import com.connector.micros.dto.MicrosAgentDiscount;

import java.util.HashMap;

public class MicrosLocalDiscountsManagement implements AgentLocalDiscountsManagementInterface {

    private MicrosLocalDiscountsManagement() {
    }

    private HashMap<String, Object> agentDiscountsHashMap;
    private static final MicrosLocalDiscountsManagement instance = new MicrosLocalDiscountsManagement();

    public static MicrosLocalDiscountsManagement getInstance() {
        return instance;
    }


    @Override
    public void saveSingleDiscountLocal(Object discount) {

        if (agentDiscountsHashMap == null)
            agentDiscountsHashMap = new HashMap<String, Object>();

        /**
         * @doc We base this HashMap by Discount name, the key is the Discount Name because
         * when we want to apply a discount we search for a string that contains " Discount",
         * and then we retrieve back the Object number of the AgentDiscount
         * */
        agentDiscountsHashMap.put(((MicrosAgentDiscount) discount).getName(), (MicrosAgentDiscount) discount);

    }

    @Override
    public Object getDiscountByPosName(String discountPosName) {
        return agentDiscountsHashMap.get(discountPosName);
    }
}
