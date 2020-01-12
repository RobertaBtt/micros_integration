package com.connector.micros.data_fetcher.response_converter;

import com.pos.connector.dto.AgentOrderType;
import com.connector.micros.dto.MicrosAgentOrderType;
import com.connector.micros.porting.element.ArrayOfDbOrderType;
import com.connector.micros.porting.element.DbOrderType;
import com.connector.micros.porting.response.MicrosGetConfigurationInfoResponse;

import java.util.ArrayList;
import java.util.List;

public class GetOrderTypesConverter {

    /***
     *
     * @param response MicrosGetConfigurationInfoResponse
     * @return The list of all the types of order that a POS has
     */
    public static List<AgentOrderType> convertResponse(MicrosGetConfigurationInfoResponse response) {

        ArrayOfDbOrderType arrayOfDbOrderType = null;
        List<DbOrderType> dbOrderTypeList;

        AgentOrderType orderTypeToRetrieve;
        List<AgentOrderType> orderTypes = new ArrayList<AgentOrderType>();

        if (response.getConfigInfoResponse().getOperationalResult().getSuccess()) {

            String orderTypesXml = response.getConfigInfoResponse().getOrderType();

            if (!orderTypesXml.isEmpty()) {

                try {
                    arrayOfDbOrderType = ArrayOfDbOrderType.Factory.parse(orderTypesXml);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                if (arrayOfDbOrderType != null) {

                    dbOrderTypeList = arrayOfDbOrderType.getDbOrderType();
                    if (dbOrderTypeList.size() > 0) {
                        for (DbOrderType orderType : dbOrderTypeList) {

                            orderTypeToRetrieve = MicrosAgentOrderType.builder()
                                    .orderTypeID(orderType.getOrdTypeID())
                                    .orderTypeObjectNumber(orderType.getOrdTypeIndex())
                                    .name(orderType.getName().getStringText())
                                    .build();
                            orderTypes.add(orderTypeToRetrieve);
                        }
                    }

                }

            }

        } else {
            //throw new Exception of type GetOpenChecks or generic Get data with
            //message = response.getOpenChecks().getOperationalResult().getErrorMessage()
            //and errorCode = response.getOpenChecks().getOperationalResult().getErrorCode().getValue()
        }

        return orderTypes;

    }
}
