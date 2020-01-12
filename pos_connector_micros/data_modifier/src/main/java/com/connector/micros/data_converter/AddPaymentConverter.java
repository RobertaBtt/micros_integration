package com.connector.micros_micros.data_converter;

import com.connector.micros.dto.AgentOrder;
import com.connector.micros.dto.PosException;
import com.connector.micros_micros.dto.MicrosAgentErrorCode;
import com.connector.micros_micros.dto.MicrosAgentOrder;
import pos.common.exceptions.ErrorCode;
import pos.common.type.Money;
import com.connector.micros.porting.response.MicrosAddToExistingCheckExResponse;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.UUID;

public class AddPaymentConverter {

    /***
     *
     * @param response MicrosAddToExistingCheckExResponse
     * @return
     */
    public static AgentOrder convertResponse(MicrosAddToExistingCheckExResponse response,
                                             String currency,
                                             UUID agentInstallationUUID) throws PosException {

        MicrosAgentOrder microsAgentOrder = null;

        if (response != null) {
            if (isSuccess(response)) {

                int checkNum = response.getPGuestCheck().getCheckNum();
                int checkSequence = response.getPGuestCheck().getCheckSeq();

                Long formattedOpenTimeCheck = response.getPTmedDetail().getTmedEPayment().getStartDate().getTimeInMillis();

                microsAgentOrder = MicrosAgentOrder.builder()
                        .number(checkNum)
                        .sequence(checkSequence)
                        .tableNumber(response.getPGuestCheck().getCheckTableObjectNum())
                        .totalDue(Money.of(new BigDecimal(response.getPTotalsResponse().getTotalsTotalDue()), currency))
                        .openTime(formattedOpenTimeCheck)
                        .build();

                microsAgentOrder.setAgentInstallationUUID(agentInstallationUUID);
                microsAgentOrder.setTotal(Money.of(new BigDecimal(response.getPTotalsResponse().getTotalsTotalDue()), currency));
                microsAgentOrder.setSubtotal(Money.of(new BigDecimal(response.getPTotalsResponse().getTotalsSubTotal()), currency));

            } else {

                String code = response.getPTotalsResponse().getOperationalResult().getErrorCode().getValue();
                String message = response.getPTotalsResponse().getOperationalResult().getErrorMessage();

                throw new PosException(ErrorCode.of(code, message));

            }

            return microsAgentOrder;

        } else {

            //NO RETRY
            String code = MicrosAgentErrorCode.UNKOWN_ERROR.getCode();
            String message = MicrosAgentErrorCode.UNKOWN_ERROR.getMessage();


            throw new PosException(ErrorCode.of(code, message));

        }

    }

    private static boolean isSuccess(MicrosAddToExistingCheckExResponse response) {

        return Optional.ofNullable(response)
                .map(resp -> resp.getPTotalsResponse())
                .map(open -> open.getOperationalResult())
                .map(opResult -> opResult.getSuccess())
                .orElse(false);

    }

}
