package com.connector.micros_micros.data_modifier;

import com.connector.micros.data_modifier.AgentOrderModifierInterface;
import com.connector.micros.dto.AgentOrder;
import com.connector.micros.dto.PosException;
import com.connector.micros.dto.PosRequest;
import com.connector.micros_micros.data_converter.AddPaymentConverter;
import com.connector.micros_micros.dto.MicrosAgentErrorCode;
import pos.common.exceptions.ErrorCode;
import com.connector.micros.porting.MicrosSimphonyAPI;
import com.connector.micros.porting.element.MicrosSimphonyPosApi_Discount;
import com.connector.micros.porting.element.MicrosSimphonyPosApi_SvcCharge;
import com.connector.micros.porting.response.MicrosAddToExistingCheckExResponse;
import com.connector.micros.porting.structure.MicrosEAccountDataSource;
import com.connector.micros.porting.structure.MicrosEAccountType;
import com.connector.micros.porting.structure.MicrosEPaymentDirective;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;


public class MicrosOrderModifier implements AgentOrderModifierInterface {

    /***
     * @doc addPaymentRequest
     * @param addPaymentRequest contains the parameters in form: key-value
     */
    @Override
    public AgentOrder addPayment(PosRequest addPaymentRequest) throws PosException {


        /*TODO: At this point is useful to check whether there are discounts or service Charge,
         * TODO: before creating the objects ?*/


        AddPaymentRequestMicros requestMicros = new AddPaymentRequestMicros(addPaymentRequest.getParameters());
        MicrosAddToExistingCheckExResponse response = null;

        MicrosSimphonyAPI microsService = MicrosSimphonyAPI.getInstance(null,
                requestMicros.getNamespaceUriServer(), requestMicros.getNamespaceUri(), requestMicros.getTargetEndPoint(),
                false);


        /*DISCOUNT*/
        MicrosSimphonyPosApi_Discount subTotalDiscountParam = new MicrosSimphonyPosApi_Discount(requestMicros.getNamespaceUri());
        if (requestMicros.getHasDiscount()) {
            subTotalDiscountParam.setDiscAmountOrPercent(requestMicros.getDiscountAmount());
            subTotalDiscountParam.setDiscObjectNum(requestMicros.getDiscountObjectNumber());
            subTotalDiscountParam.setDiscReference(requestMicros.getDiscountReference());
        }


        /*SERVICE CHARGE*/
        MicrosSimphonyPosApi_SvcCharge serviceChargeParam = new MicrosSimphonyPosApi_SvcCharge(requestMicros.getNamespaceUri());

        if (requestMicros.getHasServiceCharge()) {
            serviceChargeParam.setSvcChgAmountOrPercent(requestMicros.getServiceChargeAmount());
            serviceChargeParam.setSvcChgObjectNum(requestMicros.getServiceChargeObjectNumber());
            serviceChargeParam.setSvcChgReference(requestMicros.getServiceChargeReference());
        }

        /*PAYMENT ATTRIBUTES*/
        MicrosEAccountDataSource microsEAccountDataSource = (MicrosEAccountDataSource) MicrosEAccountDataSource.SOURCE_UNDEFINED;
        MicrosEAccountType microsEAccountType = MicrosEAccountType.ACCOUNT_TYPE_UNDEFINED;
        MicrosEPaymentDirective microsEPaymentDirective = MicrosEPaymentDirective.NO_E_PAYMENT;

        Locale locale = Locale.forLanguageTag(requestMicros.getLocale());
        Calendar dateToFireParam = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(requestMicros.getDateFormat(), locale);
        Calendar cardExpirationDate = Calendar.getInstance();
        Calendar startDate = Calendar.getInstance();
        try {
            dateToFireParam.setTime(sdf.parse(requestMicros.getDateToFire()));
            cardExpirationDate = dateToFireParam;
            startDate.setTimeInMillis(requestMicros.getPaymentTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        try {

            response = microsService.addToExistingCheckEx(
                    requestMicros.getEmployeeObjectNumber(),
                    requestMicros.getGuestCount(),
                    requestMicros.getCheckNumber(),
                    requestMicros.getOrderType(),
                    requestMicros.getRevenueCenter(),
                    requestMicros.getCheckSequence(),
                    requestMicros.getStatusBit(),
                    requestMicros.getTableObjectNumber(),
                    requestMicros.getEventObjectNumber(),
                    requestMicros.getTenderMediaObjectNumber(),
                    requestMicros.getPartialPayment(),
                    requestMicros.getTenderMediaReference(),
                    requestMicros.getTipAmount(),
                    subTotalDiscountParam,
                    serviceChargeParam,
                    microsEAccountDataSource,
                    microsEAccountType,
                    microsEPaymentDirective,
                    dateToFireParam,
                    cardExpirationDate,
                    startDate);
        } catch (java.rmi.RemoteException ex) {

            //RETRY
            String code = MicrosAgentErrorCode.HOST_UNREACHABLE.getCode();
            String message = MicrosAgentErrorCode.HOST_UNREACHABLE.getMessage();

            throw new PosException(ErrorCode.of(code, message));

        }


        if (response != null)
            return AddPaymentConverter.convertResponse(response, requestMicros.getCurrencyString(), requestMicros.getAgentInstallationUUID());

        else {

            //NO RETRY
            String code = MicrosAgentErrorCode.UNKOWN_ERROR.getCode();
            String message = MicrosAgentErrorCode.UNKOWN_ERROR.getMessage();

            throw new PosException(ErrorCode.of(code, message));


        }
    }


}
