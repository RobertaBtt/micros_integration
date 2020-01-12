package com.connector.micros.porting;

import com.connector.micros.porting.element.*;
import com.connector.micros.porting.request.*;
import com.connector.micros.porting.response.*;
import com.connector.micros.porting.structure.*;
import com.micros_hosting.egateway.*;
import org.apache.axis2.AxisFault;
import org.apache.axis2.context.ConfigurationContext;

import java.rmi.RemoteException;
import java.util.Calendar;

public class MicrosSimphonyAPI {

    private String namespaceUriServer;
    private String namespaceUri;
    private String targetEndPoint;
    private ConfigurationContext configurationContext;
    private MicrosSimphonyPosAPIWeb microsSimphonyPosAPIWeb;
    private boolean useSeparateListener;
    private static final MicrosSimphonyAPI instance = new MicrosSimphonyAPI();

    private MicrosSimphonyAPI() {
    }

    public static MicrosSimphonyAPI getInstance(ConfigurationContext configurationContext,
                                                String namespaceUriServer,
                                                String namespaceUri,
                                                String targetEndpoint,
                                                boolean useSeparateListener) {
        instance.namespaceUri = namespaceUri;
        instance.namespaceUriServer = namespaceUriServer;
        instance.namespaceUri = namespaceUri;
        instance.targetEndPoint = targetEndpoint;
        instance.useSeparateListener = useSeparateListener;
        instance.configurationContext = configurationContext;


        if (instance.microsSimphonyPosAPIWeb == null) {
            try {
                instance.microsSimphonyPosAPIWeb = new MicrosSimphonyPosAPIWeb
                        (configurationContext,
                                namespaceUriServer,
                                namespaceUri,
                                targetEndpoint,
                                useSeparateListener);
            } catch (AxisFault axisFault) {
                axisFault.printStackTrace();
            }
        }


        return instance;
    }

    /***
     *
     * @param employeeObjectNumber
     * @return
     * @throws java.rmi.RemoteException
     */
    public MicrosGetOpenChecksResponse getOpenChecks(int employeeObjectNumber)
            throws java.rmi.RemoteException {

        MicrosGetOpenChecks getOpenChecks = new MicrosGetOpenChecks(namespaceUriServer, namespaceUri, targetEndPoint);
        MicrosGetOpenChecksResponse getOpenChecksResponse;

        /***
         * We set the parameters to the request.
         */
        getOpenChecks.setEmployeeObjectNum(employeeObjectNumber);

        SimphonyPosApi_OpenChecks openChecksReference = new SimphonyPosApi_OpenChecks();
        getOpenChecks.setOpenChecks(openChecksReference);
        /***
         * We perform the request.
         */
        getOpenChecksResponse = microsSimphonyPosAPIWeb.getOpenChecks(getOpenChecks);

        return getOpenChecksResponse;
    }

    /***
     *
     * @param checkNumber
     * @param checkSeqNumber
     * @return
     * @throws java.rmi.RemoteException
     */
    public MicrosGetCheckDetailResponse getCheckDetail(int checkNumber, int checkSeqNumber)
            throws java.rmi.RemoteException {

        MicrosGetCheckDetail getCheckDetail = new MicrosGetCheckDetail(namespaceUriServer, namespaceUri, targetEndPoint);
        MicrosSimphonyPosApi_CheckDetailRequest checkDetailFilterParam = new MicrosSimphonyPosApi_CheckDetailRequest(namespaceUri);
        MicrosGetCheckDetailResponse getCheckDetailResponse;

        /***
         * We set the parameters to the request.
         */
        checkDetailFilterParam.setCheckNumber(checkNumber);
        checkDetailFilterParam.setCheckSeqNumber(checkSeqNumber);
        getCheckDetail.setPpCheckDetailFilter(checkDetailFilterParam);

        /***
         * We perform the request
         */
        getCheckDetailResponse = microsSimphonyPosAPIWeb.getCheckDetail(getCheckDetail);

        return getCheckDetailResponse;
    }

    /***
     *
     * @param employeeObjectNumber
     * @param configurationType
     * @param revenueCenter
     * @return
     */
    public MicrosGetConfigurationInfoResponse getConfigurationInfo(int employeeObjectNumber,
                                                                   int configurationType,
                                                                   int revenueCenter)
            throws java.rmi.RemoteException {

        MicrosGetConfigurationInfo getConfigurationInfo = new MicrosGetConfigurationInfo(namespaceUriServer, namespaceUri, targetEndPoint);
        MicrosGetConfigurationInfoResponse microsGetConfigurationInfoResponse;
        MicrosArrayOfInt arrayOfIntParam = new MicrosArrayOfInt(namespaceUri);
        int[] paramInt = new int[]{configurationType};

        /***
         * We set the parameters to the reqiest
         */
        getConfigurationInfo.setEmployeeObjectNum(employeeObjectNumber);
        getConfigurationInfo.setRevenueCenter(revenueCenter);

        arrayOfIntParam.set_int(paramInt);
        getConfigurationInfo.setConfigurationInfoType(arrayOfIntParam);

        microsGetConfigurationInfoResponse = microsSimphonyPosAPIWeb.getConfigurationInfo(getConfigurationInfo);

        return microsGetConfigurationInfoResponse;

    }


    //public MicrosAddToExistingCheckExResponse addToExistingCheckEx(String vendorCode, int employeeObjectNumber){
    public MicrosAddToExistingCheckExResponse addToExistingCheckEx(
            int employeeObjectNumber,
            int guestCount,
            int num,
            int orderType,
            int revenueCenterID,
            int sequence,
            int statusBits,
            int tableObjectNumber,
            int eventObjectNum,
            int tmedObjectNumber,
            String tmedPartialPayment,
            String tmedReference,
            String tipAmount,
            MicrosSimphonyPosApi_Discount subTotalDiscountParam,
            MicrosSimphonyPosApi_SvcCharge serviceChargeParam,
            MicrosEAccountDataSource microsEAccountDataSource,
            MicrosEAccountType microsEAccountType,
            MicrosEPaymentDirective microsEPaymentDirective,
            Calendar dateToFireParam,
            Calendar cardExpirationDate,
            Calendar startDate)
            throws java.rmi.RemoteException {

        MicrosAddToExistingCheckEx addToexistingCheck = new MicrosAddToExistingCheckEx(namespaceUriServer, namespaceUri, targetEndPoint);

        MicrosSimphonyPosApi_GuestCheck guestCheckParam = new MicrosSimphonyPosApi_GuestCheck(namespaceUri);
        MicrosArrayOfString checkPrintLinesParam = new MicrosArrayOfString(namespaceUri);
        MicrosArrayOfString voucheOutputParam = new MicrosArrayOfString(namespaceUri);
        MicrosArrayOfSimphonyPosApi_MenuItem menuItemParam = new MicrosArrayOfSimphonyPosApi_MenuItem(namespaceUri);
        MicrosArrayOfSimphonyPosApi_ComboMeal comboMealParam = new MicrosArrayOfSimphonyPosApi_ComboMeal(namespaceUri);

        MicrosSimphonyPosApi_TmedDetailItemEx tmedDetailItemParam = new MicrosSimphonyPosApi_TmedDetailItemEx(namespaceUri);
        MicrosSimphonyPosApi_EPayment ePayment = new MicrosSimphonyPosApi_EPayment(namespaceUri);

        MicrosAddToExistingCheckExResponse addToExistingCheckExResponse = null;

        guestCheckParam.setCheckDateToFire(dateToFireParam);
        guestCheckParam.setCheckEmployeeObjectNum(employeeObjectNumber);
        guestCheckParam.setCheckGuestCount(guestCount);
        guestCheckParam.setCheckNum(num);
        guestCheckParam.setCheckOrderType(orderType);
        guestCheckParam.setCheckRevenueCenterID(revenueCenterID);
        guestCheckParam.setCheckSeq(sequence);
        guestCheckParam.setCheckStatusBits(statusBits);
        guestCheckParam.setCheckTableObjectNum(tableObjectNumber);
        guestCheckParam.setEventObjectNum(eventObjectNum);

        MicrosEAccountDataSource accountDataSourceParam = (MicrosEAccountDataSource) microsEAccountDataSource;
        MicrosEAccountType accountTypeParam = microsEAccountType;
        ePayment.setPaymentCommand(microsEPaymentDirective);

        ePayment.setAccountDataSource(accountDataSourceParam);
        ePayment.setAccountType(accountTypeParam);
        ePayment.setExpirationDate(cardExpirationDate);
        ePayment.setStartDate(startDate);
        ePayment.setTipAmount(tipAmount);

        tmedDetailItemParam.setTmedObjectNum(tmedObjectNumber);
        tmedDetailItemParam.setTmedPartialPayment(tmedPartialPayment);
        tmedDetailItemParam.setTmedReference(tmedReference);
        tmedDetailItemParam.setTmedEPayment(ePayment);

        /*Building main object*/
        addToexistingCheck.setPGuestCheck(guestCheckParam);
        addToexistingCheck.setPpCheckPrintLines(checkPrintLinesParam);
        addToexistingCheck.setPpComboMeals(comboMealParam);
        addToexistingCheck.setPpMenuItems(menuItemParam);
        addToexistingCheck.setPpVoucherOutput(voucheOutputParam);
        addToexistingCheck.setPServiceChg(serviceChargeParam);
        addToexistingCheck.setPSubTotalDiscount(subTotalDiscountParam);
        addToexistingCheck.setPTmedDetail(tmedDetailItemParam);

        MicrosSimphonyPosApi_TotalsResponse totalsResponseParam = new MicrosSimphonyPosApi_TotalsResponse(namespaceUri);
        addToexistingCheck.setPTotalsResponse(totalsResponseParam);

        addToExistingCheckExResponse = microsSimphonyPosAPIWeb.addToExistingCheckEx(addToexistingCheck);

        return addToExistingCheckExResponse;

    }

    public MicrosPostTransactionExResponse postTransactionEx(
            int employeeObjectNumber,
            int revenueCenterID,
            int orderType,
            int tmedObjectNumber,
            String tmedPartialPayment,
            String tmedReference,
            MicrosEPaymentDirective microsEPaymentDirective,
            MicrosEAccountDataSource microsEAccountDataSource,
            Calendar dateToFireParam,
            Calendar cardExpirationDate,
            Calendar startDate) throws java.rmi.RemoteException {

        MicrosPostTransactionEx postTransactionEx = new MicrosPostTransactionEx(namespaceUriServer, namespaceUri, targetEndPoint);
        MicrosPostTransactionExResponse postTransactionExResponse = null;

        /*Setting the guest Check*/
        MicrosSimphonyPosApi_GuestCheck guestCheckParam = new MicrosSimphonyPosApi_GuestCheck(namespaceUri);
        guestCheckParam.setCheckEmployeeObjectNum(employeeObjectNumber);
        guestCheckParam.setCheckRevenueCenterID(revenueCenterID);
        guestCheckParam.setCheckOrderType(orderType);


        guestCheckParam.setCheckDateToFire(dateToFireParam);

        ArrayOfString checkPrintLinesParam = new ArrayOfString();
        ArrayOfString voucheOutputParam = new ArrayOfString();
        ArrayOfSimphonyPosApi_MenuItem menuItemParam = new ArrayOfSimphonyPosApi_MenuItem();
        ArrayOfSimphonyPosApi_ComboMeal comboMealParam = new ArrayOfSimphonyPosApi_ComboMeal();
        SimphonyPosApi_SvcCharge svcChargeParam = new SimphonyPosApi_SvcCharge();
        SimphonyPosApi_Discount subTotalDiscountParam = new SimphonyPosApi_Discount();
        SimphonyPosApi_TmedDetailItemEx tmedDetailItemParam = new SimphonyPosApi_TmedDetailItemEx();
        EAccountDataSource accountDataSourceParam = EAccountDataSource.SOURCE_UNDEFINED;
        EAccountType accountTypeParam = EAccountType.ACCOUNT_TYPE_UNDEFINED;

        SimphonyPosApi_EPayment ePayment = new SimphonyPosApi_EPayment();

        ePayment.setPaymentCommand(microsEPaymentDirective);
        ePayment.setAccountDataSource(accountDataSourceParam);
        ePayment.setAccountType(accountTypeParam);
        ePayment.setExpirationDate(cardExpirationDate);
        ePayment.setStartDate(startDate);

        tmedDetailItemParam.setTmedObjectNum(tmedObjectNumber);
        tmedDetailItemParam.setTmedPartialPayment(tmedPartialPayment);
        tmedDetailItemParam.setTmedReference(tmedReference);
        tmedDetailItemParam.setTmedEPayment(ePayment);

        postTransactionEx.setPGuestCheck(guestCheckParam);
        postTransactionEx.setPpCheckPrintLines(checkPrintLinesParam);
        postTransactionEx.setPpComboMeals(comboMealParam);
        postTransactionEx.setPpMenuItems(menuItemParam);
        postTransactionEx.setPpVoucherOutput(voucheOutputParam);
        postTransactionEx.setPServiceChg(svcChargeParam);
        postTransactionEx.setPSubTotalDiscount(subTotalDiscountParam);
        //postTransactionEx.setPTmedDetail(tmedDetailItemParam);
        SimphonyPosApi_TotalsResponse totalsResponseParam = new SimphonyPosApi_TotalsResponse();
        postTransactionEx.setPTotalsResponse(totalsResponseParam);

        postTransactionExResponse = microsSimphonyPosAPIWeb.postTransactionEx(postTransactionEx);

        return postTransactionExResponse;
    }


    public MicrosVoidTransactionResponse voidTransaction(int employeeObjectNumber, int num, int sequence, Calendar dateToFireParam) {
        MicrosVoidTransaction voidTransaction = new MicrosVoidTransaction(namespaceUriServer, namespaceUri, targetEndPoint);

        MicrosSimphonyPosApi_GuestCheck guestCheckParam = new MicrosSimphonyPosApi_GuestCheck(namespaceUri);
        guestCheckParam.setCheckNum(num);
        guestCheckParam.setCheckSeq(sequence);
        guestCheckParam.setCheckDateToFire(dateToFireParam);
        voidTransaction.setPGuestCheck(guestCheckParam);


        MicrosVoidTransactionResponse microsVoidTransactionResponse = null;
        try {
            microsVoidTransactionResponse = microsSimphonyPosAPIWeb.voidTransaction(voidTransaction);
        } catch (RemoteException e) {
            e.printStackTrace();
        }

        return microsVoidTransactionResponse;
    }


    /***
     *
     * @param employeeObjectNumber
     * @return
     * @throws java.rmi.RemoteException
     */
    public MicrosGetChecksResponse getChecks(int employeeObjectNumber, boolean includeClosedChecks, Calendar lookUpStartDate)
            throws java.rmi.RemoteException {

        MicrosGetChecks getChecks = new MicrosGetChecks(namespaceUriServer, namespaceUri, targetEndPoint);
        MicrosGetChecksResponse getChecksResponse;

        SimphonyPosApi_CheckRequest ppFilters = new SimphonyPosApi_CheckRequest();
        ppFilters.setIncludeClosedCheck(includeClosedChecks);
        ppFilters.setEmployeeObjectNum(employeeObjectNumber);
        ppFilters.setLookUpStartDate(lookUpStartDate);


        /***
         * We set the parameters to the request.
         */
        getChecks.setPpCheckFilter(ppFilters);
        SimphonyPosApi_CheckResponse checksReference = new SimphonyPosApi_CheckResponse();
        getChecks.setPpChecksResponse(checksReference);
        SimphonyPosApi_OpenChecks openChecksReference = new SimphonyPosApi_OpenChecks();
        ;
        /***
         * We perform the request.
         */
        getChecksResponse = microsSimphonyPosAPIWeb.getChecks(getChecks);

        return getChecksResponse;
    }

}
