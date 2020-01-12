package com.connector.micros.porting;

import com.connector.micros.config.ApplicationProperty;
import com.connector.micros.config.reader.ConfigReader;
import com.connector.micros.config.LocalConnectionExcludeTest;
import com.connector.micros.porting.response.MicrosGetChecksResponse;
import com.micros_hosting.egateway.ArrayOfSimphonyPosApi_CheckSummaryEx;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.util.Calendar;

@Category(LocalConnectionExcludeTest.class)
public class GetChecksTest extends junit.framework.TestCase {

    private ConfigReader configReader = ConfigReader.getInstance(null);

    private String NAMESPACE_URI_SERVER = configReader.getProperty(ApplicationProperty.NAMESPACE_URI_SERVER);
    private String NAMESPACE_URI = configReader.getProperty(ApplicationProperty.NAMESPACE_URI);
    private String TARGET_END_POINT = NAMESPACE_URI_SERVER + configReader.getProperty(ApplicationProperty.END_POINT_ASMX);
    private Integer employeeObjectNumber = Integer.valueOf(configReader.getProperty(ApplicationProperty.EMPLOYEE_OBJ_NUM));
    private Integer revenueCenter = Integer.valueOf(configReader.getProperty(ApplicationProperty.ENUM_REVENUECENTERS));
    private Integer discountEnumDefiniton = Integer.valueOf(configReader.getProperty(ApplicationProperty.ENUM_DISCOUNTDEFINITIONS));

    @Test
    public void testGetChecks() {

        MicrosSimphonyAPI microsService = MicrosSimphonyAPI.getInstance(
                null,
                NAMESPACE_URI_SERVER,
                NAMESPACE_URI,
                TARGET_END_POINT,
                false);

        MicrosGetChecksResponse response = null;


        Calendar lookUpStartDate = Calendar.getInstance();
        lookUpStartDate.set(2018, 05, 01, 00, 00);


        try {
            response = microsService.getChecks(employeeObjectNumber, true, lookUpStartDate);
        } catch (java.rmi.RemoteException ex) {

        }

        /*
         * Here check the response, before getting elements from it !
         * */
        ArrayOfSimphonyPosApi_CheckSummaryEx PosApi_CheckSummary = response.getPpChecksResponse().getChecks();

        boolean success = response.getPpChecksResponse().getOperationalResult().getSuccess();
        String errorCode = response.getPpChecksResponse().getOperationalResult().getErrorCode().getValue();
        String errorMessage = response.getPpChecksResponse().getOperationalResult().getErrorMessage();

        assertEquals(true, success);
        assertEquals("Success", errorCode);
        assertEquals("Success", errorMessage);
        //assertNotNull(PosApi_CheckSummary);
        // assertEquals (0, PosApi_CheckSummary.length);
    }

}
