package com.connector.micros.application;

import com.pos.connector.dto.AgentOrder;
import com.pos.connector.dto.PosException;
import com.pos.connector.dto.PosRequest;
import com.connector.micros.config.ApplicationProperty;
import com.connector.micros.config.reader.ConfigReader;
import com.connector.micros.config.reader.ConfigReaderInterface;
import com.connector.micros.config.reader.ConfigReader;
import com.connector.micros.data_converter.MicrosDataConverter;
import com.connector.micros.data_modifier.AddPaymentRequestMicros;
import com.connector.micros.data_modifier.MicrosOrderModifier;
import com.connector.micros.dto.MicrosAgentErrorCode;
import com.connector.micros.dto.MicrosAgentOrder;
import com.connector.micros.dto.MicrosAgentOrderType;
import com.connector.micros.local.data_management.MicrosLocalOpenOrdersManagement;
import com.connector.micros.local.data_management.MicrosLocalOrderTypeManagement;
import pos.common.exceptions.ErrorCode;
import com.pos.common.rabbitmq.rpc.service.RPCRemoteService;
import com.pos.common.rabbitmq.rpc.service.exception.InternalErrorException;
import com.pos.common.rabbitmq.rpc.service.exception.NotFoundException;
import com.pos.common.rabbitmq.rpc.service.exception.ServiceCurrentlyNotAvailableException;
import pos.common.type.Money;
import com.pos.connector.dto.request.AddPaymentRequest;
import io.reactivex.Single;

import javax.inject.Singleton;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Singleton
public class AddPaymentRemoteService implements RPCRemoteService<AddPaymentRequest, com.pos.connector.dto.AgentOrder> {


    @Override
    public Class getParameterClass() {
        return AddPaymentRequest.class;
    }

    @Override
    public String methodName() {
        return "addPayment";
    }


    @Override
    public Single<com.pos.connector.dto.AgentOrder> execute(AddPaymentRequest paymentToAdd) {

        MicrosLocalOpenOrdersManagement agentOrdersLocalManagementMicros = MicrosLocalOpenOrdersManagement.getInstance();

        try {
            ConfigReaderInterface ConfigReader = ConfigReader.getInstance(null);

            Map<String, String> parametersMap = buildStaticParametersMap(ConfigReader);

            MicrosOrderModifier agentPOSDataModifierMicros = new MicrosOrderModifier();
            MicrosDataConverter microsDataConverter = new MicrosDataConverter();


            AgentOrder currentOrder = null;
            MicrosAgentOrderType typeOfOrder = null;
            String orderTypeID;
            String tableObjectNumber;
            String eventObjectNumber;

            PosRequest addPaymentRequest;
            BigDecimal totalAmountDiscount = new BigDecimal(0.0);
            String discountsDescriptions = new String("");

            AgentOrder returnedOrder = null;
            com.pos.connector.dto.AgentOrder returnedConvertedToPosCollector = null;

            /*A typical micros order is made by two numbers, separated by a dot . */
            String[] posIdentificator = paymentToAdd.getOrderId().id().split("\\.");
            String checkNum = posIdentificator[0];
            String checkSequence = posIdentificator[1];

            try {
                currentOrder = (MicrosAgentOrder) agentOrdersLocalManagementMicros.getOrderByPosIdentifier(paymentToAdd.getOrderId().id());
            } catch (NullPointerException ex) {}

            if (currentOrder != null) {
                orderTypeID = getOrderTypeID( currentOrder);
                tableObjectNumber = getTableObjectNumber(currentOrder);

            } else {
                ErrorCode errorCode = ErrorCode.of(
                        MicrosAgentErrorCode.CHECK_NOT_FOUND_CACHE.getCode(),
                        MicrosAgentErrorCode.CHECK_NOT_FOUND_CACHE.getMessage());

                throw new InternalErrorException(errorCode);
            }

            parametersMap.put("checkNumber", checkNum);
            parametersMap.put("checkSequence", checkSequence);
            parametersMap.put("statusBit", "0");
            parametersMap.put("eventObjectNumber", "0");
            parametersMap.put("orderType", String.valueOf(orderTypeID));
            parametersMap.put("tableObjectNumber", tableObjectNumber);
            parametersMap.put("guestCount", "0");

            com.pos.connector.dto.AgentPayment payment = paymentToAdd.getPayment();
            Money tipAmount = payment.tipAmount();
            Money totalToPay = payment.paymentAmountWithTip().minus(tipAmount);

            String tenderMediaObjNumber = null;
            tenderMediaObjNumber = getPaymentObjectNumber(ConfigReader);

            if (tenderMediaObjNumber == null)
            {
                ErrorCode errorCode = ErrorCode.of(
                        MicrosAgentErrorCode.PAYMENT_NOT_FOUND.getCode(),
                        MicrosAgentErrorCode.PAYMENT_NOT_FOUND.getMessage());

                throw new InternalErrorException(errorCode);
            }
            parametersMap.put("tenderMediaObjectNumber", tenderMediaObjNumber);


            parametersMap.put("partialPayment", String.valueOf(totalToPay.getAmount()));
            parametersMap.put("tipAmount", String.valueOf(tipAmount.getAmount()));
            parametersMap.put("paymentTime", String.valueOf(paymentToAdd.getPayment().executed()));
            parametersMap.put("dateToFire", "0001-01-01 00:00:00");


            if (paymentToAdd.getDiscounts().size() > 0) {

                parametersMap.put("hasDiscount", "true");
                String discountObjectNumber = getDiscountObjectNumber(ConfigReader);

                if (discountObjectNumber == null){
                    ErrorCode errorCode = ErrorCode.of(
                            MicrosAgentErrorCode.DISCOUNT_NOT_FOUND.getCode(),
                            MicrosAgentErrorCode.DISCOUNT_NOT_FOUND.getMessage());

                    throw new InternalErrorException(errorCode);
                }


                for (com.pos.connector.dto.AgentOrderDiscount discount : paymentToAdd.getDiscounts()) {
                    totalAmountDiscount = totalAmountDiscount.add(discount.discount().getAmount());
                    discountsDescriptions += " " + discount.description();
                }

                parametersMap.put("discountObjectNumber", discountObjectNumber);
                parametersMap.put("discountReference", discountsDescriptions);
                parametersMap.put("discountAmount", String.valueOf(totalAmountDiscount));

            } else {
                parametersMap.put("hasDiscount", "false");
            }

            addPaymentRequest = new AddPaymentRequestMicros(parametersMap);
            returnedOrder = agentPOSDataModifierMicros.addPayment(addPaymentRequest);
            returnedConvertedToPosCollector = microsDataConverter.convert(returnedOrder);

            return Single.just(returnedConvertedToPosCollector);
        } catch (PosException e) {


            if (e.getErrorCode().equals(MicrosAgentErrorCode.ERROR_PICKUP_CHECK.getCode())) {
                throw new ServiceCurrentlyNotAvailableException(e.getErrorCode());
            } else if (e.getErrorCode().getCode().equals(MicrosAgentErrorCode.HOST_UNREACHABLE.getCode())) {
                throw new ServiceCurrentlyNotAvailableException(e.getErrorCode());
            } else if (e.getErrorCode().getCode().equals(MicrosAgentErrorCode.CHECK_NOT_FOUND.getCode())) {
                throw new NotFoundException(e.getErrorCode());
            } else {
                ErrorCode errorCode = ErrorCode.of(
                        MicrosAgentErrorCode.UNKOWN_ERROR.getCode(),
                        MicrosAgentErrorCode.UNKOWN_ERROR.getMessage() + " " + e.getMessage());

                throw new InternalErrorException(errorCode);
            }

        } catch (Exception e) {

            ErrorCode errorCode = ErrorCode.of(
                    MicrosAgentErrorCode.UNKOWN_ERROR.getCode(),
                    MicrosAgentErrorCode.UNKOWN_ERROR.getMessage()+ " " + e.getMessage());

            throw new InternalErrorException(errorCode);

        }

    }


    private Map<String, String> buildStaticParametersMap(ConfigReaderInterface configReader) {

        Map<String, String> parametersMap = new HashMap<String, String>();
        ConfigReader configReader = (ConfigReader)configReader;

        String namespaceUriServer = configReader.getProperty(ApplicationProperty.NAMESPACE_URI_SERVER);
        String namespaceUri = configReader.getProperty(ApplicationProperty.NAMESPACE_URI);
        String targetEndPoint = namespaceUriServer + configReader.getProperty(ApplicationProperty.END_POINT_ASMX);
        String revenueCenter = configReader.getProperty(ApplicationProperty.ENUM_REVENUECENTERS);
        String agentInstallationUUID = configReader.getProperty(ApplicationProperty.AGENT_INSTALLATION_UUID);
        String currencyString = configReader.getProperty(ApplicationProperty.GLOBAL_POS_CURRENCY);
        String localeString = configReader.getProperty(ApplicationProperty.GLOBAL_POS_LOCALE);
        String employeeObjectNumber = configReader.getProperty(ApplicationProperty.EMPLOYEE_OBJ_NUM);
        String PaymentReference = configReader.getProperty(ApplicationProperty.PAYMENT_REFERENCE);
        String defaultDateFormat = configReader.getProperty(ApplicationProperty.DEFAULT_DATE_FORMAT);

        parametersMap.put("namespaceUriServer", namespaceUriServer);
        parametersMap.put("namespaceUri", namespaceUri);
        parametersMap.put("targetEndPoint", targetEndPoint);
        parametersMap.put("employeeObjectNumber", employeeObjectNumber);
        parametersMap.put("revenueCenter", revenueCenter);
        parametersMap.put("currencyString", currencyString);
        parametersMap.put("locale", localeString);
        parametersMap.put("agentInstallationUUID", agentInstallationUUID);
        parametersMap.put("dateFormat", defaultDateFormat);
        parametersMap.put("tenderMediaReference", PaymentReference);
        parametersMap.put("cardExpirationDate", "0001-01-01 00:00:00");

        return parametersMap;
    }

    private String getPaymentObjectNumber(ConfigReaderInterface configReader) {

        String PaymentObjectNumber = null;
        PaymentObjectNumber = ((ConfigReader)configReader).getProperty(ApplicationProperty.PAYMENT_ID);

        return PaymentObjectNumber;
    }

    private String getDiscountObjectNumber(ConfigReaderInterface configReader) {

        String DiscountObjectNumber = null;
        DiscountObjectNumber = ((ConfigReader)configReader).getProperty(ApplicationProperty.DISCOUNT_ID);

        return DiscountObjectNumber;
    }


    private String getOrderTypeID(AgentOrder currentOrderToPay) {

        MicrosAgentOrderType microsAgentOrderType = (MicrosAgentOrderType) currentOrderToPay.getOrderType();
        String orderTypeID = String.valueOf(microsAgentOrderType.getOrderTypeID());
        return orderTypeID;
    }

    private String getTableObjectNumber(AgentOrder currentOrderToPay) {

        String tableObjectNumber = String.valueOf(currentOrderToPay.getTableNumber());
        return tableObjectNumber;
    }


}
