package com.connector.micros.local.data_management;

import com.pos.connector.local.data_management.AgentLocalPaymentTypeManagementInterface;
import com.connector.micros.dto.MicrosAgentPayment;

import java.util.HashMap;

public class MicrosLocalPaymentTypeManagement implements AgentLocalPaymentTypeManagementInterface {

    private MicrosLocalPaymentTypeManagement() {
    }

    private HashMap<String, Object> agentPaymentTypesHashMap;
    private static final MicrosLocalPaymentTypeManagement instance = new MicrosLocalPaymentTypeManagement();

    public static MicrosLocalPaymentTypeManagement getInstance() {
        return instance;
    }


    /***
     * @doc This interface allows to add a single element of the AgentPayment, from POS, locally to the Agent
     * @param agentPaymentType is the AgentPayment that comes from the POS
     */
    @Override
    public void saveSinglePaymentTypeLocal(Object agentPaymentType) {
        if (agentPaymentTypesHashMap == null)
            agentPaymentTypesHashMap = new HashMap<String, Object>();

        /**
         * @doc We base this HashMap by payment name, the key is the Payment Name because
         * when we pay we want to search for a string that contains "", and then we retrieve back the Object number of the AgentPayment
         * */
        agentPaymentTypesHashMap.put(((MicrosAgentPayment) agentPaymentType).getName(), (MicrosAgentPayment) agentPaymentType);

    }

    /***
     *
     * @param paymentTypePosName is the String or number that identifies a Type of Payment inside the POS
     * @return the AgentPayment
     */
    @Override
    public Object getPaymentTypeByPosName(String paymentTypePosName) {
        if (agentPaymentTypesHashMap != null) {
            return agentPaymentTypesHashMap.get(paymentTypePosName);
        }
        return null;

    }
}
