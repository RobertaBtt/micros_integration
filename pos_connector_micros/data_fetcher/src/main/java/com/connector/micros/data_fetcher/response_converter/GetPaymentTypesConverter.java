package com.connector.micros.data_fetcher.response_converter;

import com.pos.connector.dto.AgentPayment;
import com.pos.connector.dto.AgentPaymentTypesEnum;
import com.connector.micros.dto.MicrosAgentPayment;
import com.connector.micros.porting.element.ArrayOfDbTenderMedia;
import com.connector.micros.porting.element.DbTenderMedia;
import com.connector.micros.porting.response.MicrosGetConfigurationInfoResponse;

import java.util.ArrayList;
import java.util.List;

public class GetPaymentTypesConverter {

    /***
     *
     * @param response MicrosGetConfigurationInfoResponse
     * @return The string that represents the configuration of Agent specific of Micros
     */
    public static List<AgentPayment> convertResponse(MicrosGetConfigurationInfoResponse response) {

        ArrayOfDbTenderMedia arrayOfDbTenderMedia = null;
        List<DbTenderMedia> dbTenderMediaList;
        AgentPayment agentPaymentToRetrieve;
        AgentPaymentTypesEnum paymentTypesEnum;

        List<AgentPayment> payments = new ArrayList<AgentPayment>();

        if (response.getConfigInfoResponse().getOperationalResult().getSuccess()) {

            String paymentsXml = response.getConfigInfoResponse().getTenderMedia();

            if (!paymentsXml.isEmpty()) {

                try {
                    arrayOfDbTenderMedia = ArrayOfDbTenderMedia.Factory.parse(paymentsXml);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                if (arrayOfDbTenderMedia != null) {

                    dbTenderMediaList = arrayOfDbTenderMedia.getDbTenderMedia();
                    if (dbTenderMediaList.size() > 0) {
                        for (DbTenderMedia tenderMedia : dbTenderMediaList) {

                            agentPaymentToRetrieve = MicrosAgentPayment.builder()
                                    .name(tenderMedia.getName().getStringText())
                                    .tenderMediaId(tenderMedia.getTendMediaID())
                                    .objectNumber(tenderMedia.getObjectNumber())
                                    .paymentType(discoverPaymentType(tenderMedia.getName().getStringText()))
                                    .build();
                            payments.add(agentPaymentToRetrieve);
                        }
                    }

                }

            }

        } else {
            //throw new Exception of type GetOpenChecks or generic Get data with
            //message = response.getOpenChecks().getOperationalResult().getErrorMessage()
            //and errorCode = response.getOpenChecks().getOperationalResult().getErrorCode().getValue()
        }

        return payments;

    }

    private static AgentPaymentTypesEnum discoverPaymentType(String paymentName) {
        if (paymentName.equalsIgnoreCase("Cash"))
            return AgentPaymentTypesEnum.CASH;
        else if (paymentName.equalsIgnoreCase("American Express") ||
                paymentName.equalsIgnoreCase("MasterCard") ||
                paymentName.equalsIgnoreCase("Visa") ||
                paymentName.equalsIgnoreCase("Maestro"))
            return AgentPaymentTypesEnum.CREDIT_CARD;
        else
            return AgentPaymentTypesEnum.COUPON;
    }
}
