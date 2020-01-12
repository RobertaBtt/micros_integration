package com.connector.micros.porting;

import com.connector.micros.config.ApplicationProperty;
import com.connector.micros.config.reader.ConfigReader;
import com.connector.micros.config.LocalConnectionExcludeTest;
import com.connector.micros.porting.response.MicrosGetOpenChecksResponse;
import com.micros_hosting.egateway.ArrayOfSimphonyPosApi_CheckSummary;
import com.micros_hosting.egateway.SimphonyPosApi_CheckSummary;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(LocalConnectionExcludeTest.class)
public class GetOpenChecksTest extends junit.framework.TestCase {

    private ConfigReader configReader = ConfigReader.getInstance(null);

    private String NAMESPACE_URI_SERVER = configReader.getProperty(ApplicationProperty.NAMESPACE_URI_SERVER);
    private String NAMESPACE_URI = configReader.getProperty(ApplicationProperty.NAMESPACE_URI);
    private String TARGET_END_POINT = NAMESPACE_URI_SERVER + configReader.getProperty(ApplicationProperty.END_POINT_ASMX);
    private String EMPLOYEE_OBJ_NUMBER = configReader.getProperty(ApplicationProperty.EMPLOYEE_OBJ_NUM);
    private String EMPLOYEE_OBJ_NUMBER_NOT_FOUND = "90046452";

    @Test
    public void testGetChecksRegardlessTheEmployee() {

        MicrosSimphonyAPI microsService = MicrosSimphonyAPI.getInstance(null, NAMESPACE_URI_SERVER, NAMESPACE_URI, TARGET_END_POINT, false);

        MicrosGetOpenChecksResponse response = null;
        try {
            response = microsService.getOpenChecks(0);
        } catch (java.rmi.RemoteException ex) {

        }

        /*
         * Here check the response, before getting elements from it !
         * */
        SimphonyPosApi_CheckSummary[] PosApi_CheckSummary = response.getOpenChecks().getCheckSummary().getSimphonyPosApi_CheckSummary();

        boolean success = response.getOpenChecks().getOperationalResult().getSuccess();
        String errorCode = response.getOpenChecks().getOperationalResult().getErrorCode().getValue();
        String errorMessage = response.getOpenChecks().getOperationalResult().getErrorMessage();

        assertEquals(true, success);
        assertEquals("Success", errorCode);
        assertEquals("Success", errorMessage);
        assertNotNull(PosApi_CheckSummary);

    }


    @Test
    public void testGetChecksNotExistingEmployee() {

        MicrosSimphonyAPI microsService = MicrosSimphonyAPI.getInstance(null, NAMESPACE_URI_SERVER, NAMESPACE_URI, TARGET_END_POINT, false);
        MicrosGetOpenChecksResponse response = null;

        try {
            response = microsService.getOpenChecks(Integer.valueOf(EMPLOYEE_OBJ_NUMBER_NOT_FOUND));
        } catch (java.rmi.RemoteException ex) {

        }
        ArrayOfSimphonyPosApi_CheckSummary checkSummary = response.getOpenChecks().getCheckSummary();

        boolean success = response.getOpenChecks().getOperationalResult().getSuccess();
        String errorCode = response.getOpenChecks().getOperationalResult().getErrorCode().getValue();
        String errorMessage = response.getOpenChecks().getOperationalResult().getErrorMessage();

        assertEquals(null, checkSummary);
        assertEquals(false, success);
        assertEquals("EmployeeNotFound", errorCode);
        assert (errorMessage.contains("Employee Object number does not exist"));

        assertNull(checkSummary);

    }

}
