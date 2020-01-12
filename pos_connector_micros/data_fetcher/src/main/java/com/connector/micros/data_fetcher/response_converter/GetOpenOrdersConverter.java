package com.connector.micros.data_fetcher.response_converter;

import com.pos.connector.dto.AgentOrder;
import com.connector.micros.config.ApplicationProperty;
import com.connector.micros.config.reader.ConfigReader;
import com.connector.micros.dto.MicrosAgentOrder;
import com.connector.micros.dto.MicrosAgentOrderType;
import pos.common.type.Money;
import com.connector.micros.porting.response.MicrosGetOpenChecksResponse;
import com.micros_hosting.egateway.SimphonyPosApi_CheckSummary;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GetOpenOrdersConverter {

    /***
     *
     * @param response MicrosGetOpenChecksResponse
     * @return The list of AgentOrder of specific Micros type
     */
    public static List<AgentOrder> convertResponse(MicrosGetOpenChecksResponse response) {

        List<AgentOrder> openChecks = new ArrayList<AgentOrder>();

        if (response != null) {

            if (isSuccess(response)) {

                SimphonyPosApi_CheckSummary[] posApi_CheckSummary = getCheckSummary(response);

                AgentOrder openCheckToInsert;
                MicrosAgentOrderType typeOfTheOrder;

                /*If there aren't checks, posApi_CheckSummary is null*/
                if (posApi_CheckSummary != null && posApi_CheckSummary.length > 0) {

                    ConfigReader configReader = ConfigReader.getInstance(null);

                    String currency = configReader.getProperty(ApplicationProperty.GLOBAL_POS_CURRENCY);

                    for (SimphonyPosApi_CheckSummary check : posApi_CheckSummary) {

                        typeOfTheOrder = new MicrosAgentOrderType();
                        typeOfTheOrder.setOrderTypeID(check.getCheckOrderType());

                        openCheckToInsert = MicrosAgentOrder.builder()
                                .number(check.getCheckNum())
                                .sequence(check.getCheckSeq())
                                .orderType(typeOfTheOrder)
                                .tableNumber(check.getCheckTableObjectNum())
                                .totalDue(Money.of(new BigDecimal(String.valueOf(check.getCheckTotalDue())), currency))
                                .lastServiceTime(check.getCheckLastServiceTime().getTimeInMillis())
                                .openTime(check.getCheckOpenTime().getTimeInMillis())
                                .build();

                        openChecks.add(openCheckToInsert);

                    }

                }
            }

        }

        return openChecks;

    }

    private static boolean isSuccess(MicrosGetOpenChecksResponse response) {
        return Optional.ofNullable(response)
                .map(resp -> resp.getOpenChecks())
                .map(open -> open.getOperationalResult())
                .map(opResult -> opResult.getSuccess())
                .orElse(false);


        //return response.getOpenChecks().getOperationalResult().getSuccess();
    }

    private static SimphonyPosApi_CheckSummary[] getCheckSummary(MicrosGetOpenChecksResponse response) {
        return Optional.ofNullable(response)
                .map(resp -> resp.getOpenChecks())
                .map(open -> open.getCheckSummary())
                .map(summary -> summary.getSimphonyPosApi_CheckSummary())
                .orElse(null);
    }
}
