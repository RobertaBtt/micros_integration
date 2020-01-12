package com.connector.micros.porting;

import com.connector.micros.config.ApplicationProperty;
import com.connector.micros.config.reader.ConfigReader;
import com.connector.micros.config.LocalConnectionExcludeTest;
import com.connector.micros.porting.response.MicrosPostTransactionExResponse;
import com.connector.micros.porting.structure.MicrosEAccountDataSource;
import com.connector.micros.porting.structure.MicrosEAccountType;
import com.connector.micros.porting.structure.MicrosEPaymentDirective;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

@Category(LocalConnectionExcludeTest.class)
public class PostTransactionTest extends junit.framework.TestCase {

    private File applicationPropertiesFile;
    private ConfigReader configReader;

    {
        try {
            applicationPropertiesFile = File.createTempFile("/application", ".properties");
        } catch (IOException e) {
            e.printStackTrace();
        }

        configReader = ConfigReader.getInstance(applicationPropertiesFile.getAbsolutePath());
    }

    private String NAMESPACE_URI_SERVER = configReader.getProperty(ApplicationProperty.NAMESPACE_URI_SERVER);
    private String NAMESPACE_URI = configReader.getProperty(ApplicationProperty.NAMESPACE_URI);
    private String TARGET_END_POINT = NAMESPACE_URI_SERVER + configReader.getProperty(ApplicationProperty.END_POINT_ASMX);
    private Integer employeeObjectNumber = Integer.valueOf(configReader.getProperty(ApplicationProperty.EMPLOYEE_OBJ_NUM));
    private Integer revenueCenter = Integer.valueOf(configReader.getProperty(ApplicationProperty.ENUM_REVENUECENTERS));


    @Test
    public void testPostTransactionEx() {
        MicrosSimphonyAPI microsService = MicrosSimphonyAPI.getInstance(
                null,
                NAMESPACE_URI_SERVER,
                NAMESPACE_URI,
                TARGET_END_POINT,
                false);

        int orderType = 1;
        int tmedObjectNumber = 1; //101 = Cash
        String tmedPartialPayment = "0.05"; //is the total due
        String tmedReference = "Payment of 0.05 done";
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
        try {
            MicrosPostTransactionExResponse response = microsService.postTransactionEx(
                    employeeObjectNumber,
                    revenueCenter,
                    orderType,
                    tmedObjectNumber,
                    tmedPartialPayment,
                    tmedReference,
                    microsEPaymentDirective,
                    microsEAccountDataSource,
                    dateToFireParam,
                    cardExpirationDate,
                    startDate);
        } catch (java.rmi.RemoteException p) {
        }

    }
}

