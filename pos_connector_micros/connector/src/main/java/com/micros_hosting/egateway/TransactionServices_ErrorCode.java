/**
 * TransactionServices_ErrorCode.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:50 GMT)
 */
package com.micros_hosting.egateway;


/**
 * TransactionServices_ErrorCode bean class
 */
@SuppressWarnings({"unchecked",
        "unused"
})
public class TransactionServices_ErrorCode implements org.apache.axis2.databinding.ADBBean {
    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://micros-hosting.com/EGateway/",
            "TransactionServices_ErrorCode", "");
    private static java.util.HashMap _table_ = new java.util.HashMap();
    public static final java.lang.String _AmountNotEntered = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "AmountNotEntered");
    public static final java.lang.String _AppInitInProgress = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "AppInitInProgress");
    public static final java.lang.String _CCAuthDeclined = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CCAuthDeclined");
    public static final java.lang.String _CCAuthDeclinedWithMessage = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CCAuthDeclinedWithMessage");
    public static final java.lang.String _CCServerDown = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CCServerDown");
    public static final java.lang.String _CheckEmployeeNumberMismatch = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CheckEmployeeNumberMismatch");
    public static final java.lang.String _CheckNotFound = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CheckNotFound");
    public static final java.lang.String _CheckListNotFound = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CheckListNotFound");
    public static final java.lang.String _CheckOpenedOnSystem = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CheckOpenedOnSystem");
    public static final java.lang.String _CheckTableNumberMismatch = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CheckTableNumberMismatch");
    public static final java.lang.String _ComboMealNotFound = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "ComboMealNotFound");
    public static final java.lang.String _ConnectionDown = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "ConnectionDown");
    public static final java.lang.String _DataOutOfRange = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "DataOutOfRange");
    public static final java.lang.String _DetailDoesNotSupportTriggeredEvents = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "DetailDoesNotSupportTriggeredEvents");
    public static final java.lang.String _DiscountNotFound = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "DiscountNotFound");
    public static final java.lang.String _DiscountAmountRequired = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "DiscountAmountRequired");
    public static final java.lang.String _DiscountAmountTooLarge = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "DiscountAmountTooLarge");
    public static final java.lang.String _DiscountAmountZero = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "DiscountAmountZero");
    public static final java.lang.String _DiscountItemNotAllowed = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "DiscountItemNotAllowed");
    public static final java.lang.String _DiscountNotAllowedFilterActive = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "DiscountNotAllowedFilterActive");
    public static final java.lang.String _DiscountOnParentCombo = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "DiscountOnParentCombo");
    public static final java.lang.String _DuplicateLineNumber = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "DuplicateLineNumber");
    public static final java.lang.String _EGatewayClientStartError = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "EGatewayClientStartError");
    public static final java.lang.String _EGatewayClientStopError = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "EGatewayClientStopError");
    public static final java.lang.String _EGatewayConnectionError = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "EGatewayConnectionError");
    public static final java.lang.String _EGatewayConnectionNotInPool = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "EGatewayConnectionNotInPool");
    public static final java.lang.String _EGatewayWaitConnectionTimeout = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "EGatewayWaitConnectionTimeout");
    public static final java.lang.String _EmployeeClockIOStatusMismatch = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "EmployeeClockIOStatusMismatch");
    public static final java.lang.String _EmployeeIDMismatch = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "EmployeeIDMismatch");
    public static final java.lang.String _EmployeeNotFound = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "EmployeeNotFound");
    public static final java.lang.String _EmployeeRVCMismatch = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "EmployeeRVCMismatch");
    public static final java.lang.String _ErrorCreatingGuestcheck = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "ErrorCreatingGuestcheck");
    public static final java.lang.String _ErrorInvalidWorkstation = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "ErrorInvalidWorkstation");
    public static final java.lang.String _ErrorReadingCheck = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "ErrorReadingCheck");
    public static final java.lang.String _ErrorPickupCheck = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "ErrorPickupCheck");
    public static final java.lang.String _FailedDataStoreInitialization = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "FailedDataStoreInitialization");
    public static final java.lang.String _FailedDbSettingLoad = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "FailedDbSettingLoad");
    public static final java.lang.String _FailedErrorTranslationInitial = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "FailedErrorTranslationInitial");
    public static final java.lang.String _FailedPostCARequest = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "FailedPostCARequest");
    public static final java.lang.String _FailedInitialization = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "FailedInitialization");
    public static final java.lang.String _FailedLoggerInitialization = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "FailedLoggerInitialization");
    public static final java.lang.String _FailedSecurityAPIInitialization = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "FailedSecurityAPIInitialization");
    public static final java.lang.String _FailedSubmitPrintJob = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "FailedSubmitPrintJob");
    public static final java.lang.String _InternalCommunicationError = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "InternalCommunicationError");
    public static final java.lang.String _InternalProcessingError = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "InternalProcessingError");
    public static final java.lang.String _InvalidArguments = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "InvalidArguments");
    public static final java.lang.String _InvaildAuthCode = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "InvaildAuthCode");
    public static final java.lang.String _InvalidCheckNumber = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "InvalidCheckNumber");
    public static final java.lang.String _InvalidCreditCardExpirationDate = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "InvalidCreditCardExpirationDate");
    public static final java.lang.String _InvalidCreditCardHost = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "InvalidCreditCardHost");
    public static final java.lang.String _InvalidCreditCardNumber = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "InvalidCreditCardNumber");
    public static final java.lang.String _InvalidClientName = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "InvalidClientName");
    public static final java.lang.String _InvalidClosedDays = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "InvalidClosedDays");
    public static final java.lang.String _InvalidConfigInfoRequestType = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "InvalidConfigInfoRequestType");
    public static final java.lang.String _InvalidConfigInfoType = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "InvalidConfigInfoType");
    public static final java.lang.String _InvalidCustomerInfo = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "InvalidCustomerInfo");
    public static final java.lang.String _InvalidDetailLine = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "InvalidDetailLine");
    public static final java.lang.String _InvalidDetailLineType = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "InvalidDetailLineType");
    public static final java.lang.String _InvalidEmployeeNumber = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "InvalidEmployeeNumber");
    public static final java.lang.String _InvalidGuestCount = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "InvalidGuestCount");
    public static final java.lang.String _InvalidLineNumber = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "InvalidLineNumber");
    public static final java.lang.String _InvalidMenuItemPrice = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "InvalidMenuItemPrice");
    public static final java.lang.String _InvalidOrderTypeNumber = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "InvalidOrderTypeNumber");
    public static final java.lang.String _InvalidPropertyNum = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "InvalidPropertyNum");
    public static final java.lang.String _InvalidRvcNum = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "InvalidRvcNum");
    public static final java.lang.String _InvalidServingPeriod = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "InvalidServingPeriod");
    public static final java.lang.String _InvalidTableNumber = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "InvalidTableNumber");
    public static final java.lang.String _InvalidTranslationSpecifier = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "InvalidTranslationSpecifier");
    public static final java.lang.String _ItemDiscountNeedsParentItem = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "ItemDiscountNeedsParentItem");
    public static final java.lang.String _LicensingFailed = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "LicensingFailed");
    public static final java.lang.String _MenuItemOutOfOrder = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "MenuItemOutOfOrder");
    public static final java.lang.String _MissingDetailLinesElement = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "MissingDetailLinesElement");
    public static final java.lang.String _MissingTransactionElement = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "MissingTransactionElement");
    public static final java.lang.String _MissingTransactionHeaderElement = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "MissingTransactionHeaderElement");
    public static final java.lang.String _NoRequestHeader = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "NoRequestHeader");
    public static final java.lang.String _NoSalesForDiscount = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "NoSalesForDiscount");
    public static final java.lang.String _NotImplemented = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "NotImplemented");
    public static final java.lang.String _NoSalesToApplyServiceCharge = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "NoSalesToApplyServiceCharge");
    public static final java.lang.String _NullInput = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "NullInput");
    public static final java.lang.String _PaidPartially = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "PaidPartially");
    public static final java.lang.String _PaymentAborted = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "PaymentAborted");
    public static final java.lang.String _PriceMenuItemWithZeroAmount = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "PriceMenuItemWithZeroAmount");
    public static final java.lang.String _SecurityInitFailed = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "SecurityInitFailed");
    public static final java.lang.String _ServiceChargeTaxClassNotFound = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "ServiceChargeTaxClassNotFound");
    public static final java.lang.String _Success = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "Success");
    public static final java.lang.String _TenderTypeNotFound = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "TenderTypeNotFound");
    public static final java.lang.String _TransactionEmployeeNotFound = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "TransactionEmployeeNotFound");
    public static final java.lang.String _TranslationFileNotAvailable = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "TranslationFileNotAvailable");
    public static final java.lang.String _UnhandledException = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "UnhandledException");
    public static final java.lang.String _UnknownCreditCardType = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "UnknownCreditCardType");
    public static final java.lang.String _UnknownExceptionCode = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "UnknownExceptionCode");
    public static final java.lang.String _TransactionLocked = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "TransactionLocked");
    public static final TransactionServices_ErrorCode AmountNotEntered = new TransactionServices_ErrorCode(_AmountNotEntered,
            true);
    public static final TransactionServices_ErrorCode AppInitInProgress = new TransactionServices_ErrorCode(_AppInitInProgress,
            true);
    public static final TransactionServices_ErrorCode CCAuthDeclined = new TransactionServices_ErrorCode(_CCAuthDeclined,
            true);
    public static final TransactionServices_ErrorCode CCAuthDeclinedWithMessage = new TransactionServices_ErrorCode(_CCAuthDeclinedWithMessage,
            true);
    public static final TransactionServices_ErrorCode CCServerDown = new TransactionServices_ErrorCode(_CCServerDown,
            true);
    public static final TransactionServices_ErrorCode CheckEmployeeNumberMismatch =
            new TransactionServices_ErrorCode(_CheckEmployeeNumberMismatch, true);
    public static final TransactionServices_ErrorCode CheckNotFound = new TransactionServices_ErrorCode(_CheckNotFound,
            true);
    public static final TransactionServices_ErrorCode CheckListNotFound = new TransactionServices_ErrorCode(_CheckListNotFound,
            true);
    public static final TransactionServices_ErrorCode CheckOpenedOnSystem = new TransactionServices_ErrorCode(_CheckOpenedOnSystem,
            true);
    public static final TransactionServices_ErrorCode CheckTableNumberMismatch = new TransactionServices_ErrorCode(_CheckTableNumberMismatch,
            true);
    public static final TransactionServices_ErrorCode ComboMealNotFound = new TransactionServices_ErrorCode(_ComboMealNotFound,
            true);
    public static final TransactionServices_ErrorCode ConnectionDown = new TransactionServices_ErrorCode(_ConnectionDown,
            true);
    public static final TransactionServices_ErrorCode DataOutOfRange = new TransactionServices_ErrorCode(_DataOutOfRange,
            true);
    public static final TransactionServices_ErrorCode DetailDoesNotSupportTriggeredEvents =
            new TransactionServices_ErrorCode(_DetailDoesNotSupportTriggeredEvents,
                    true);
    public static final TransactionServices_ErrorCode DiscountNotFound = new TransactionServices_ErrorCode(_DiscountNotFound,
            true);
    public static final TransactionServices_ErrorCode DiscountAmountRequired = new TransactionServices_ErrorCode(_DiscountAmountRequired,
            true);
    public static final TransactionServices_ErrorCode DiscountAmountTooLarge = new TransactionServices_ErrorCode(_DiscountAmountTooLarge,
            true);
    public static final TransactionServices_ErrorCode DiscountAmountZero = new TransactionServices_ErrorCode(_DiscountAmountZero,
            true);
    public static final TransactionServices_ErrorCode DiscountItemNotAllowed = new TransactionServices_ErrorCode(_DiscountItemNotAllowed,
            true);
    public static final TransactionServices_ErrorCode DiscountNotAllowedFilterActive =
            new TransactionServices_ErrorCode(_DiscountNotAllowedFilterActive, true);
    public static final TransactionServices_ErrorCode DiscountOnParentCombo = new TransactionServices_ErrorCode(_DiscountOnParentCombo,
            true);
    public static final TransactionServices_ErrorCode DuplicateLineNumber = new TransactionServices_ErrorCode(_DuplicateLineNumber,
            true);
    public static final TransactionServices_ErrorCode EGatewayClientStartError = new TransactionServices_ErrorCode(_EGatewayClientStartError,
            true);
    public static final TransactionServices_ErrorCode EGatewayClientStopError = new TransactionServices_ErrorCode(_EGatewayClientStopError,
            true);
    public static final TransactionServices_ErrorCode EGatewayConnectionError = new TransactionServices_ErrorCode(_EGatewayConnectionError,
            true);
    public static final TransactionServices_ErrorCode EGatewayConnectionNotInPool =
            new TransactionServices_ErrorCode(_EGatewayConnectionNotInPool, true);
    public static final TransactionServices_ErrorCode EGatewayWaitConnectionTimeout =
            new TransactionServices_ErrorCode(_EGatewayWaitConnectionTimeout, true);
    public static final TransactionServices_ErrorCode EmployeeClockIOStatusMismatch =
            new TransactionServices_ErrorCode(_EmployeeClockIOStatusMismatch, true);
    public static final TransactionServices_ErrorCode EmployeeIDMismatch = new TransactionServices_ErrorCode(_EmployeeIDMismatch,
            true);
    public static final TransactionServices_ErrorCode EmployeeNotFound = new TransactionServices_ErrorCode(_EmployeeNotFound,
            true);
    public static final TransactionServices_ErrorCode EmployeeRVCMismatch = new TransactionServices_ErrorCode(_EmployeeRVCMismatch,
            true);
    public static final TransactionServices_ErrorCode ErrorCreatingGuestcheck = new TransactionServices_ErrorCode(_ErrorCreatingGuestcheck,
            true);
    public static final TransactionServices_ErrorCode ErrorInvalidWorkstation = new TransactionServices_ErrorCode(_ErrorInvalidWorkstation,
            true);
    public static final TransactionServices_ErrorCode ErrorReadingCheck = new TransactionServices_ErrorCode(_ErrorReadingCheck,
            true);
    public static final TransactionServices_ErrorCode ErrorPickupCheck = new TransactionServices_ErrorCode(_ErrorPickupCheck,
            true);
    public static final TransactionServices_ErrorCode FailedDataStoreInitialization =
            new TransactionServices_ErrorCode(_FailedDataStoreInitialization, true);
    public static final TransactionServices_ErrorCode FailedDbSettingLoad = new TransactionServices_ErrorCode(_FailedDbSettingLoad,
            true);
    public static final TransactionServices_ErrorCode FailedErrorTranslationInitial =
            new TransactionServices_ErrorCode(_FailedErrorTranslationInitial, true);
    public static final TransactionServices_ErrorCode FailedPostCARequest = new TransactionServices_ErrorCode(_FailedPostCARequest,
            true);
    public static final TransactionServices_ErrorCode FailedInitialization = new TransactionServices_ErrorCode(_FailedInitialization,
            true);
    public static final TransactionServices_ErrorCode FailedLoggerInitialization =
            new TransactionServices_ErrorCode(_FailedLoggerInitialization, true);
    public static final TransactionServices_ErrorCode FailedSecurityAPIInitialization =
            new TransactionServices_ErrorCode(_FailedSecurityAPIInitialization, true);
    public static final TransactionServices_ErrorCode FailedSubmitPrintJob = new TransactionServices_ErrorCode(_FailedSubmitPrintJob,
            true);
    public static final TransactionServices_ErrorCode InternalCommunicationError =
            new TransactionServices_ErrorCode(_InternalCommunicationError, true);
    public static final TransactionServices_ErrorCode InternalProcessingError = new TransactionServices_ErrorCode(_InternalProcessingError,
            true);
    public static final TransactionServices_ErrorCode InvalidArguments = new TransactionServices_ErrorCode(_InvalidArguments,
            true);
    public static final TransactionServices_ErrorCode InvaildAuthCode = new TransactionServices_ErrorCode(_InvaildAuthCode,
            true);
    public static final TransactionServices_ErrorCode InvalidCheckNumber = new TransactionServices_ErrorCode(_InvalidCheckNumber,
            true);
    public static final TransactionServices_ErrorCode InvalidCreditCardExpirationDate =
            new TransactionServices_ErrorCode(_InvalidCreditCardExpirationDate, true);
    public static final TransactionServices_ErrorCode InvalidCreditCardHost = new TransactionServices_ErrorCode(_InvalidCreditCardHost,
            true);
    public static final TransactionServices_ErrorCode InvalidCreditCardNumber = new TransactionServices_ErrorCode(_InvalidCreditCardNumber,
            true);
    public static final TransactionServices_ErrorCode InvalidClientName = new TransactionServices_ErrorCode(_InvalidClientName,
            true);
    public static final TransactionServices_ErrorCode InvalidClosedDays = new TransactionServices_ErrorCode(_InvalidClosedDays,
            true);
    public static final TransactionServices_ErrorCode InvalidConfigInfoRequestType =
            new TransactionServices_ErrorCode(_InvalidConfigInfoRequestType, true);
    public static final TransactionServices_ErrorCode InvalidConfigInfoType = new TransactionServices_ErrorCode(_InvalidConfigInfoType,
            true);
    public static final TransactionServices_ErrorCode InvalidCustomerInfo = new TransactionServices_ErrorCode(_InvalidCustomerInfo,
            true);
    public static final TransactionServices_ErrorCode InvalidDetailLine = new TransactionServices_ErrorCode(_InvalidDetailLine,
            true);
    public static final TransactionServices_ErrorCode InvalidDetailLineType = new TransactionServices_ErrorCode(_InvalidDetailLineType,
            true);
    public static final TransactionServices_ErrorCode InvalidEmployeeNumber = new TransactionServices_ErrorCode(_InvalidEmployeeNumber,
            true);
    public static final TransactionServices_ErrorCode InvalidGuestCount = new TransactionServices_ErrorCode(_InvalidGuestCount,
            true);
    public static final TransactionServices_ErrorCode InvalidLineNumber = new TransactionServices_ErrorCode(_InvalidLineNumber,
            true);
    public static final TransactionServices_ErrorCode InvalidMenuItemPrice = new TransactionServices_ErrorCode(_InvalidMenuItemPrice,
            true);
    public static final TransactionServices_ErrorCode InvalidOrderTypeNumber = new TransactionServices_ErrorCode(_InvalidOrderTypeNumber,
            true);
    public static final TransactionServices_ErrorCode InvalidPropertyNum = new TransactionServices_ErrorCode(_InvalidPropertyNum,
            true);
    public static final TransactionServices_ErrorCode InvalidRvcNum = new TransactionServices_ErrorCode(_InvalidRvcNum,
            true);
    public static final TransactionServices_ErrorCode InvalidServingPeriod = new TransactionServices_ErrorCode(_InvalidServingPeriod,
            true);
    public static final TransactionServices_ErrorCode InvalidTableNumber = new TransactionServices_ErrorCode(_InvalidTableNumber,
            true);
    public static final TransactionServices_ErrorCode InvalidTranslationSpecifier =
            new TransactionServices_ErrorCode(_InvalidTranslationSpecifier, true);
    public static final TransactionServices_ErrorCode ItemDiscountNeedsParentItem =
            new TransactionServices_ErrorCode(_ItemDiscountNeedsParentItem, true);
    public static final TransactionServices_ErrorCode LicensingFailed = new TransactionServices_ErrorCode(_LicensingFailed,
            true);
    public static final TransactionServices_ErrorCode MenuItemOutOfOrder = new TransactionServices_ErrorCode(_MenuItemOutOfOrder,
            true);
    public static final TransactionServices_ErrorCode MissingDetailLinesElement = new TransactionServices_ErrorCode(_MissingDetailLinesElement,
            true);
    public static final TransactionServices_ErrorCode MissingTransactionElement = new TransactionServices_ErrorCode(_MissingTransactionElement,
            true);
    public static final TransactionServices_ErrorCode MissingTransactionHeaderElement =
            new TransactionServices_ErrorCode(_MissingTransactionHeaderElement, true);
    public static final TransactionServices_ErrorCode NoRequestHeader = new TransactionServices_ErrorCode(_NoRequestHeader,
            true);
    public static final TransactionServices_ErrorCode NoSalesForDiscount = new TransactionServices_ErrorCode(_NoSalesForDiscount,
            true);
    public static final TransactionServices_ErrorCode NotImplemented = new TransactionServices_ErrorCode(_NotImplemented,
            true);
    public static final TransactionServices_ErrorCode NoSalesToApplyServiceCharge =
            new TransactionServices_ErrorCode(_NoSalesToApplyServiceCharge, true);
    public static final TransactionServices_ErrorCode NullInput = new TransactionServices_ErrorCode(_NullInput,
            true);
    public static final TransactionServices_ErrorCode PaidPartially = new TransactionServices_ErrorCode(_PaidPartially,
            true);
    public static final TransactionServices_ErrorCode PaymentAborted = new TransactionServices_ErrorCode(_PaymentAborted,
            true);
    public static final TransactionServices_ErrorCode PriceMenuItemWithZeroAmount =
            new TransactionServices_ErrorCode(_PriceMenuItemWithZeroAmount, true);
    public static final TransactionServices_ErrorCode SecurityInitFailed = new TransactionServices_ErrorCode(_SecurityInitFailed,
            true);
    public static final TransactionServices_ErrorCode ServiceChargeTaxClassNotFound =
            new TransactionServices_ErrorCode(_ServiceChargeTaxClassNotFound, true);
    public static final TransactionServices_ErrorCode Success = new TransactionServices_ErrorCode(_Success,
            true);
    public static final TransactionServices_ErrorCode TenderTypeNotFound = new TransactionServices_ErrorCode(_TenderTypeNotFound,
            true);
    public static final TransactionServices_ErrorCode TransactionEmployeeNotFound =
            new TransactionServices_ErrorCode(_TransactionEmployeeNotFound, true);
    public static final TransactionServices_ErrorCode TranslationFileNotAvailable =
            new TransactionServices_ErrorCode(_TranslationFileNotAvailable, true);
    public static final TransactionServices_ErrorCode UnhandledException = new TransactionServices_ErrorCode(_UnhandledException,
            true);
    public static final TransactionServices_ErrorCode UnknownCreditCardType = new TransactionServices_ErrorCode(_UnknownCreditCardType,
            true);
    public static final TransactionServices_ErrorCode UnknownExceptionCode = new TransactionServices_ErrorCode(_UnknownExceptionCode,
            true);
    public static final TransactionServices_ErrorCode TransactionLocked = new TransactionServices_ErrorCode(_TransactionLocked,
            true);

    /**
     * field for TransactionServices_ErrorCode
     */
    protected java.lang.String localTransactionServices_ErrorCode;

    // Constructor
    protected TransactionServices_ErrorCode(java.lang.String value,
                                            boolean isRegisterValue) {
        localTransactionServices_ErrorCode = value;

        if (isRegisterValue) {
            _table_.put(localTransactionServices_ErrorCode, this);
        }
    }

    public java.lang.String getValue() {
        return localTransactionServices_ErrorCode;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj == this);
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public java.lang.String toString() {
        return localTransactionServices_ErrorCode.toString();
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
        return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                this, MY_QNAME));
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
                          javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
            org.apache.axis2.databinding.ADBException {
        serialize(parentQName, xmlWriter, false);
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
                          javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
            org.apache.axis2.databinding.ADBException {
        //We can safely assume an element has only one type associated with it
        java.lang.String namespace = parentQName.getNamespaceURI();
        java.lang.String _localName = parentQName.getLocalPart();

        writeStartElement(null, namespace, _localName, xmlWriter);

        // add the type details if this is used in a simple type
        if (serializeType) {
            java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                    "http://micros-hosting.com/EGateway/");

            if ((namespacePrefix != null) &&
                    (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":TransactionServices_ErrorCode",
                        xmlWriter);
            } else {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "TransactionServices_ErrorCode", xmlWriter);
            }
        }

        if (localTransactionServices_ErrorCode == null) {
            throw new org.apache.axis2.databinding.ADBException(
                    "TransactionServices_ErrorCode cannot be null !!");
        } else {
            xmlWriter.writeCharacters(localTransactionServices_ErrorCode);
        }

        xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://micros-hosting.com/EGateway/")) {
            return "";
        }

        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(java.lang.String prefix,
                                   java.lang.String namespace, java.lang.String localPart,
                                   javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

        if (writerPrefix != null) {
            xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
        } else {
            if (namespace.length() == 0) {
                prefix = "";
            } else if (prefix == null) {
                prefix = generatePrefix(namespace);
            }

            xmlWriter.writeStartElement(prefix, localPart, namespace);
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(java.lang.String prefix,
                                java.lang.String namespace, java.lang.String attName,
                                java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

        if (writerPrefix != null) {
            xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
        } else {
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
            xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(java.lang.String namespace,
                                java.lang.String attName, java.lang.String attValue,
                                javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attValue);
        } else {
            xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                    namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace,
                                     java.lang.String attName, javax.xml.namespace.QName qname,
                                     javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }

        java.lang.String attributeValue;

        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                    attributeValue);
        }
    }

    /**
     * method to handle Qnames
     */
    private void writeQName(javax.xml.namespace.QName qname,
                            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
        java.lang.String namespaceURI = qname.getNamespaceURI();

        if (namespaceURI != null) {
            java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

            if (prefix == null) {
                prefix = generatePrefix(namespaceURI);
                xmlWriter.writeNamespace(prefix, namespaceURI);
                xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
                xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qname));
            } else {
                // i.e this is the default namespace
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    qname));
        }
    }

    private void writeQNames(javax.xml.namespace.QName[] qnames,
                             javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
        if (qnames != null) {
            // we have to store this data until last moment since it is not possible to write any
            // namespace data after writing the charactor data
            java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
            java.lang.String namespaceURI = null;
            java.lang.String prefix = null;

            for (int i = 0; i < qnames.length; i++) {
                if (i > 0) {
                    stringToWrite.append(" ");
                }

                namespaceURI = qnames[i].getNamespaceURI();

                if (namespaceURI != null) {
                    prefix = xmlWriter.getPrefix(namespaceURI);

                    if ((prefix == null) || (prefix.length() == 0)) {
                        prefix = generatePrefix(namespaceURI);
                        xmlWriter.writeNamespace(prefix, namespaceURI);
                        xmlWriter.setPrefix(prefix, namespaceURI);
                    }

                    if (prefix.trim().length() > 0) {
                        stringToWrite.append(prefix).append(":")
                                .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                        qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qnames[i]));
                }
            }

            xmlWriter.writeCharacters(stringToWrite.toString());
        }
    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
        java.lang.String prefix = xmlWriter.getPrefix(namespace);

        if (prefix == null) {
            prefix = generatePrefix(namespace);

            javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

            while (true) {
                java.lang.String uri = nsContext.getNamespaceURI(prefix);

                if ((uri == null) || (uri.length() == 0)) {
                    break;
                }

                prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
            }

            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }

        return prefix;
    }

    /**
     * Factory class that keeps the parse method
     */
    public static class Factory {
        private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

        public static TransactionServices_ErrorCode fromValue(
                java.lang.String value) throws java.lang.IllegalArgumentException {
            TransactionServices_ErrorCode enumeration = (TransactionServices_ErrorCode) _table_.get(value);

            // handle unexpected enumeration values properly
            if (enumeration == null) {
                throw new java.lang.IllegalArgumentException();
            }

            return enumeration;
        }

        public static TransactionServices_ErrorCode fromString(
                java.lang.String value, java.lang.String namespaceURI)
                throws java.lang.IllegalArgumentException {
            try {
                return fromValue(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        value));
            } catch (java.lang.Exception e) {
                throw new java.lang.IllegalArgumentException();
            }
        }

        public static TransactionServices_ErrorCode fromString(
                javax.xml.stream.XMLStreamReader xmlStreamReader,
                java.lang.String content) {
            if (content.indexOf(":") > -1) {
                java.lang.String prefix = content.substring(0,
                        content.indexOf(":"));
                java.lang.String namespaceUri = xmlStreamReader.getNamespaceContext()
                        .getNamespaceURI(prefix);

                return TransactionServices_ErrorCode.Factory.fromString(content,
                        namespaceUri);
            } else {
                return TransactionServices_ErrorCode.Factory.fromString(content,
                        "");
            }
        }

        /**
         * static method to create the object
         * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
         * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
         * Postcondition: If this object is an element, the reader is positioned at its end element
         * If this object is a complex type, the reader is positioned at the end element of its outer element
         */
        public static TransactionServices_ErrorCode parse(
                javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            TransactionServices_ErrorCode object = null;

            // initialize a hash map to keep values
            java.util.Map attributeMap = new java.util.HashMap();
            java.util.List extraAttributeList = new java.util.ArrayList<org.apache.axiom.om.OMAttribute>();

            int event;
            javax.xml.namespace.QName currentQName = null;
            java.lang.String nillableValue = null;
            java.lang.String prefix = "";
            java.lang.String namespaceuri = "";

            try {
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                currentQName = reader.getName();

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                while (!reader.isEndElement()) {
                    if (reader.isStartElement() || reader.hasText()) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " +
                                            "TransactionServices_ErrorCode" +
                                            "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        if (content.indexOf(":") > 0) {
                            // this seems to be a Qname so find the namespace and send
                            prefix = content.substring(0, content.indexOf(":"));
                            namespaceuri = reader.getNamespaceURI(prefix);
                            object = TransactionServices_ErrorCode.Factory.fromString(content,
                                    namespaceuri);
                        } else {
                            // this seems to be not a qname send and empty namespace incase of it is
                            // check is done in fromString method
                            object = TransactionServices_ErrorCode.Factory.fromString(content,
                                    "");
                        }
                    } else {
                        reader.next();
                    }
                } // end of while loop
            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }
    } //end of factory class
}
