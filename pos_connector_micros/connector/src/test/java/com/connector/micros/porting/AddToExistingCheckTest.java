package com.connector.micros.porting;

import com.connector.micros.config.ApplicationProperty;
import com.connector.micros.config.reader.ConfigReader;
import com.connector.micros.config.LocalConnectionExcludeTest;
import com.connector.micros.porting.element.MicrosSimphonyPosApi_Discount;
import com.connector.micros.porting.element.MicrosSimphonyPosApi_SvcCharge;
import com.connector.micros.porting.structure.MicrosEAccountDataSource;
import com.connector.micros.porting.structure.MicrosEAccountType;
import com.connector.micros.porting.structure.MicrosEPaymentDirective;
import com.micros_hosting.egateway.AddToExistingCheckExResponse;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.util.Calendar;

@Category(LocalConnectionExcludeTest.class)
public class AddToExistingCheckTest extends junit.framework.TestCase {

    private ConfigReader configReader = ConfigReader.getInstance(null);

    private String NAMESPACE_URI_SERVER = configReader.getProperty(ApplicationProperty.NAMESPACE_URI_SERVER);
    private String NAMESPACE_URI = configReader.getProperty(ApplicationProperty.NAMESPACE_URI);
    private String TARGET_END_POINT = NAMESPACE_URI_SERVER + configReader.getProperty(ApplicationProperty.END_POINT_ASMX);
    private Integer employeeObjectNumber = Integer.valueOf(configReader.getProperty(ApplicationProperty.EMPLOYEE_OBJ_NUM));
    private Integer revenueCenter = Integer.valueOf(configReader.getProperty(ApplicationProperty.ENUM_REVENUECENTERS));


    @Test
    public void testAddATipDuringThePayment() {

        MicrosSimphonyAPI microsService = MicrosSimphonyAPI.getInstance(
                null,
                NAMESPACE_URI_SERVER,
                NAMESPACE_URI,
                TARGET_END_POINT,
                false);

        int guestCount = 0;
        int num = 1379;
        int orderType = 1;
        int sequence = 739988884;
        int statusBits = 0; //TODO: check if this tag is important
        int tableObjectNumber = 0;
        int eventObjectNum = 0;
        int tmedObjectNumber = 1003;
        String tmedPartialPayment = "3.00"; //is the total due
        String tmedReference = "";
        String tipAmount = "0.00";
        MicrosEAccountDataSource microsEAccountDataSource = (MicrosEAccountDataSource) MicrosEAccountDataSource.SOURCE_UNDEFINED;
        MicrosEAccountType microsEAccountType = MicrosEAccountType.ACCOUNT_TYPE_UNDEFINED;
        MicrosEPaymentDirective microsEPaymentDirective = MicrosEPaymentDirective.NO_E_PAYMENT;

        Calendar dateToFireParam = Calendar.getInstance();
        dateToFireParam.add(Calendar.MONTH, 3);

        Calendar cardExpirationDate = Calendar.getInstance();
        cardExpirationDate.add(Calendar.MONTH, 23);

        Calendar startDate = Calendar.getInstance();
        startDate.add(Calendar.DAY_OF_MONTH, -5);

        MicrosSimphonyPosApi_Discount subTotalDiscountParam = new MicrosSimphonyPosApi_Discount(NAMESPACE_URI);
        AddToExistingCheckExResponse response = null;
        try {
            response = microsService.addToExistingCheckEx(
                    employeeObjectNumber,
                    guestCount,
                    num,
                    orderType,
                    revenueCenter,
                    sequence,
                    statusBits,
                    tableObjectNumber,
                    eventObjectNum,
                    tmedObjectNumber,
                    tmedPartialPayment,
                    tmedReference,
                    tipAmount,
                    subTotalDiscountParam,
                    null,
                    microsEAccountDataSource,
                    microsEAccountType,
                    microsEPaymentDirective,
                    dateToFireParam, cardExpirationDate, startDate);
        } catch (java.rmi.RemoteException p) {

        }
        boolean success = response.getPTotalsResponse().getOperationalResult().getSuccess();
        String errorCode = response.getPTotalsResponse().getOperationalResult().getErrorCode().getValue();
        String errorMessage = response.getPTotalsResponse().getOperationalResult().getErrorMessage();

        assertEquals(true, success);
        assertEquals("Success", errorCode);
        assertEquals("Success", errorMessage);

        assertEquals(1379, response.getPGuestCheck().getCheckNum());

    }


    @Test
    public void testAddPercentageDiscount() {

        MicrosSimphonyAPI microsService = MicrosSimphonyAPI.getInstance(
                null,
                NAMESPACE_URI_SERVER,
                NAMESPACE_URI,
                TARGET_END_POINT,
                false);

        int guestCount = 0;
        int num = 1022;
        int orderType = 41;
        int sequence = 832324830;
        int statusBits = 0; //TODO: check if this tag is important
        int tableObjectNumber = 0;
        int eventObjectNum = 0;
        int tmedObjectNumber = 101; //101 = Cash
        String tmedPartialPayment = ""; //is the total due
        String tmedReference = "1% of discount";
        String tipAmount = "0";
        MicrosEAccountDataSource microsEAccountDataSource = (MicrosEAccountDataSource) MicrosEAccountDataSource.SOURCE_UNDEFINED;
        MicrosEAccountType microsEAccountType = MicrosEAccountType.ACCOUNT_TYPE_UNDEFINED;
        MicrosEPaymentDirective microsEPaymentDirective = MicrosEPaymentDirective.NO_E_PAYMENT;

        Calendar dateToFireParam = Calendar.getInstance();
        dateToFireParam.add(Calendar.MONTH, 3);

        Calendar cardExpirationDate = Calendar.getInstance();
        cardExpirationDate.add(Calendar.MONTH, 23);

        Calendar startDate = Calendar.getInstance();
        startDate.add(Calendar.DAY_OF_MONTH, -5);

        MicrosSimphonyPosApi_Discount subTotalDiscountParam = new MicrosSimphonyPosApi_Discount(NAMESPACE_URI);
        subTotalDiscountParam.setDiscAmountOrPercent("0.01"); //Test 1 %
        subTotalDiscountParam.setDiscObjectNum(10001); //Open food %
        subTotalDiscountParam.setDiscReference("Discount roby 1%");

        AddToExistingCheckExResponse response = null;
        try {
            response = microsService.addToExistingCheckEx(
                    employeeObjectNumber,
                    guestCount,
                    num,
                    orderType,
                    revenueCenter,
                    sequence,
                    statusBits,
                    tableObjectNumber,
                    eventObjectNum,
                    tmedObjectNumber,
                    tmedPartialPayment,
                    tmedReference,
                    tipAmount,
                    subTotalDiscountParam,
                    null, /*no service charge*/
                    microsEAccountDataSource,
                    microsEAccountType,
                    microsEPaymentDirective,
                    dateToFireParam,
                    cardExpirationDate,
                    startDate);
        } catch (java.rmi.RemoteException p) {

        }

        boolean success = response.getPTotalsResponse().getOperationalResult().getSuccess();
        String errorCode = response.getPTotalsResponse().getOperationalResult().getErrorCode().getValue();
        String errorMessage = response.getPTotalsResponse().getOperationalResult().getErrorMessage();

        assertEquals(true, success);
//        assertEquals("NoSalesForDiscount", errorCode);
//        assertEquals("Discount No Sales", errorMessage);
//

        assertEquals(1021, response.getPGuestCheck().getCheckNum());

    }
//    @Test
//    public void testAddToExistingCheckWithCouponDiscount(){
//
//        MicrosSimphonyAPI microsService = MicrosSimphonyAPI.getInstance(
//                null,
//                NAMESPACE_URI_SERVER,
//                NAMESPACE_URI,
//                TARGET_END_POINT,
//                false);
//
//        int guestCount = 0;
//        int num = 1010;
//        int orderType = 41;
//        int sequence = 6555443;
//        int statusBits = 0; //TODO: check if this tag is important
//        int tableObjectNumber = 0;
//        int eventObjectNum = 0;
//        int tmedObjectNumber = 101; //101 = Cash
//        String tmedPartialPayment = "9.55"; //is the total due
//        String tmedReference = "This is the payment comment";
//        String tipAmount = "0";
//        MicrosEAccountDataSource microsEAccountDataSource = (MicrosEAccountDataSource) MicrosEAccountDataSource.SOURCE_UNDEFINED;
//        MicrosEAccountType microsEAccountType = MicrosEAccountType.ACCOUNT_TYPE_UNDEFINED;
//        MicrosEPaymentDirective microsEPaymentDirective = MicrosEPaymentDirective.NO_E_PAYMENT;
//
//        Calendar dateToFireParam =  Calendar.getInstance();
//        dateToFireParam.add(Calendar.MONTH, 3);
//
//        Calendar cardExpirationDate = Calendar.getInstance();
//        cardExpirationDate.add(Calendar.MONTH, 23);
//
//        Calendar startDate = Calendar.getInstance();
//        startDate.add(Calendar.DAY_OF_MONTH, -5);
//
//        MicrosSimphonyPosApi_Discount subTotalDiscountParam = new MicrosSimphonyPosApi_Discount(NAMESPACE_URI);
//        subTotalDiscountParam.setDiscAmountOrPercent("0.5"); //
//        subTotalDiscountParam.setDiscObjectNum(502); //Is the iCoupon Precentage Discount
//        subTotalDiscountParam.setDiscReference(" Percentage discount");
//
//
//        AddToExistingCheckExResponse response = microsService.addToExistingCheckEx(employeeObjectNumber,
//                guestCount,num,orderType,revenueCenter,sequence,statusBits,tableObjectNumber,eventObjectNum,tmedObjectNumber,
//                tmedPartialPayment,tmedReference,tipAmount,subTotalDiscountParam, microsEAccountDataSource,microsEAccountType,microsEPaymentDirective,
//                dateToFireParam,cardExpirationDate,startDate);
//
//        boolean success = response.getPTotalsResponse().getOperationalResult().getSuccess();
//        String errorCode = response.getPTotalsResponse().getOperationalResult().getErrorCode().getValue();
//        String errorMessage = response.getPTotalsResponse().getOperationalResult().getErrorMessage();
//
//        assertEquals(true, success);
//        assertEquals("Success", errorCode);
//        assertEquals("Success", errorMessage);
//
//        assertEquals(1010, response.getPGuestCheck().getCheckNum());
//
//    }

    @Test
    public void testAddToExistingCheckWithAmountDiscount() {

        MicrosSimphonyAPI microsService = MicrosSimphonyAPI.getInstance(
                null,
                NAMESPACE_URI_SERVER,
                NAMESPACE_URI,
                TARGET_END_POINT,
                false);

        int guestCount = 0;
        int num = 1022;
        int orderType = 41;
        int sequence = 832324830;
        int statusBits = 0;
        int tableObjectNumber = 0;
        int eventObjectNum = 0;
        int tmedObjectNumber = 101; //101 = Cash
        String tmedPartialPayment = "0"; //is the total due
        String tmedReference = "I am adding a fixed discount amount";
        String tipAmount = "0";
        MicrosEAccountDataSource microsEAccountDataSource = (MicrosEAccountDataSource) MicrosEAccountDataSource.SOURCE_UNDEFINED;
        MicrosEAccountType microsEAccountType = MicrosEAccountType.ACCOUNT_TYPE_UNDEFINED;
        MicrosEPaymentDirective microsEPaymentDirective = MicrosEPaymentDirective.NO_E_PAYMENT;

        Calendar dateToFireParam = Calendar.getInstance();
        dateToFireParam.add(Calendar.MONTH, 3);

        Calendar cardExpirationDate = Calendar.getInstance();
        cardExpirationDate.add(Calendar.MONTH, 23);

        Calendar startDate = Calendar.getInstance();
        startDate.add(Calendar.DAY_OF_MONTH, -5);

        MicrosSimphonyPosApi_Discount subTotalDiscountParam = new MicrosSimphonyPosApi_Discount(NAMESPACE_URI);
        subTotalDiscountParam.setDiscAmountOrPercent("0.01"); //
        subTotalDiscountParam.setDiscObjectNum(810); //iCoupon Amnt (810)
        subTotalDiscountParam.setDiscReference("Roberta Amount discount");

        MicrosSimphonyPosApi_SvcCharge serviceCharge = new MicrosSimphonyPosApi_SvcCharge(NAMESPACE_URI);
        serviceCharge.setSvcChgAmountOrPercent("0.20");
        serviceCharge.setSvcChgObjectNum(4);
        serviceCharge.setSvcChgReference("Service Charge !");

        AddToExistingCheckExResponse response = null;
        try {
            response = microsService.addToExistingCheckEx(
                    employeeObjectNumber,
                    guestCount,
                    num,
                    orderType,
                    revenueCenter,
                    sequence,
                    statusBits,
                    tableObjectNumber,
                    eventObjectNum,
                    tmedObjectNumber,
                    tmedPartialPayment,
                    tmedReference,
                    tipAmount,
                    subTotalDiscountParam,
                    serviceCharge,
                    microsEAccountDataSource,
                    microsEAccountType,
                    microsEPaymentDirective,
                    dateToFireParam,
                    cardExpirationDate,
                    startDate);
        } catch (java.rmi.RemoteException p) {

        }

        boolean success = response.getPTotalsResponse().getOperationalResult().getSuccess();
        String errorCode = response.getPTotalsResponse().getOperationalResult().getErrorCode().getValue();
        String errorMessage = response.getPTotalsResponse().getOperationalResult().getErrorMessage();

        assertEquals(true, success);
        assertEquals("Success", errorCode);
        assertEquals("Success", errorMessage);

        assertEquals(1021, response.getPGuestCheck().getCheckNum());

    }


    @Test
    public void testAddToExistingCheckWithServiceCharge() {

        MicrosSimphonyAPI microsService = MicrosSimphonyAPI.getInstance(
                null,
                NAMESPACE_URI_SERVER,
                NAMESPACE_URI,
                TARGET_END_POINT,
                false);

        int guestCount = 0;
        int num = 1022;
        int orderType = 41;
        int sequence = 832324830;
        int statusBits = 0;
        int tableObjectNumber = 0;
        int eventObjectNum = 0;
        int tmedObjectNumber = 101; //101 = Cash
        String tmedPartialPayment = "0"; //is the total due
        String tmedReference = "I am adding a fixed discount amount";
        String tipAmount = "0";
        MicrosEAccountDataSource microsEAccountDataSource = (MicrosEAccountDataSource) MicrosEAccountDataSource.SOURCE_UNDEFINED;
        MicrosEAccountType microsEAccountType = MicrosEAccountType.ACCOUNT_TYPE_UNDEFINED;
        MicrosEPaymentDirective microsEPaymentDirective = MicrosEPaymentDirective.NO_E_PAYMENT;

        Calendar dateToFireParam = Calendar.getInstance();
        dateToFireParam.add(Calendar.MONTH, 3);

        Calendar cardExpirationDate = Calendar.getInstance();
        cardExpirationDate.add(Calendar.MONTH, 23);

        Calendar startDate = Calendar.getInstance();
        startDate.add(Calendar.DAY_OF_MONTH, -5);

        MicrosSimphonyPosApi_Discount subTotalDiscountParam = new MicrosSimphonyPosApi_Discount(NAMESPACE_URI);

        MicrosSimphonyPosApi_SvcCharge serviceCharge = new MicrosSimphonyPosApi_SvcCharge(NAMESPACE_URI);
        serviceCharge.setSvcChgAmountOrPercent("0.20");
        serviceCharge.setSvcChgObjectNum(4);
        serviceCharge.setSvcChgReference("Service Charge !");

        AddToExistingCheckExResponse response = null;
        try {
            response = microsService.addToExistingCheckEx(
                    employeeObjectNumber,
                    guestCount,
                    num,
                    orderType,
                    revenueCenter,
                    sequence,
                    statusBits,
                    tableObjectNumber,
                    eventObjectNum,
                    tmedObjectNumber,
                    tmedPartialPayment,
                    tmedReference,
                    tipAmount,
                    subTotalDiscountParam,
                    serviceCharge,
                    microsEAccountDataSource,
                    microsEAccountType,
                    microsEPaymentDirective,
                    dateToFireParam,
                    cardExpirationDate,
                    startDate);
        } catch (java.rmi.RemoteException p) {

        }

        boolean success = response.getPTotalsResponse().getOperationalResult().getSuccess();
        String errorCode = response.getPTotalsResponse().getOperationalResult().getErrorCode().getValue();
        String errorMessage = response.getPTotalsResponse().getOperationalResult().getErrorMessage();

        assertEquals(true, success);
        assertEquals("Success", errorCode);
        assertEquals("Success", errorMessage);

        assertEquals(1021, response.getPGuestCheck().getCheckNum());

    }

}
