package com.connector.micros.porting;

import com.connector.micros.config.ApplicationProperty;
import com.connector.micros.config.reader.ConfigReader;
import com.connector.micros.config.LocalConnectionExcludeTest;
import com.connector.micros.porting.response.MicrosGetCheckDetailResponse;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(LocalConnectionExcludeTest.class)
public class GetCheckDetailTest extends junit.framework.TestCase {

    private ConfigReader configReader = ConfigReader.getInstance(null);

    private String NAMESPACE_URI_SERVER = configReader.getProperty(ApplicationProperty.NAMESPACE_URI_SERVER);
    private String NAMESPACE_URI = configReader.getProperty(ApplicationProperty.NAMESPACE_URI);
    private String TARGET_END_POINT = NAMESPACE_URI_SERVER + configReader.getProperty(ApplicationProperty.END_POINT_ASMX);

    @Test
    public void testGetCheckDetail() {

        MicrosSimphonyAPI microsService = MicrosSimphonyAPI.getInstance(
                null,
                NAMESPACE_URI_SERVER,
                NAMESPACE_URI,
                TARGET_END_POINT,
                false);

        MicrosGetCheckDetailResponse response = null;

        try {
            response = microsService.getCheckDetail(1023, 569248240);
        } catch (java.rmi.RemoteException ex) {

        }

        boolean success = response.getPpCheckDetailResponse().getOperationalResult().getSuccess();
        String errorCode = response.getPpCheckDetailResponse().getOperationalResult().getErrorCode().getValue();
        String errorMessage = response.getPpCheckDetailResponse().getOperationalResult().getErrorMessage();
        String checkDetail = response.getPpCheckDetailResponse().getCheckDetail();

        assertEquals(true, success);
        assertEquals("Success", errorCode);
        assertEquals("Success", errorMessage);

        assert (checkDetail.length() >= 0);
    }

    @Test
    public void testGetCheckNotExistingNumber() {

        MicrosSimphonyAPI microsService = MicrosSimphonyAPI.getInstance(
                null,
                NAMESPACE_URI_SERVER,
                NAMESPACE_URI,
                TARGET_END_POINT,
                false);

        MicrosGetCheckDetailResponse response = null;
        try {
            response = microsService.getCheckDetail(902, 106556046);
        } catch (java.rmi.RemoteException ex) {

        }

        boolean success = response.getPpCheckDetailResponse().getOperationalResult().getSuccess();
        String errorCode = response.getPpCheckDetailResponse().getOperationalResult().getErrorCode().getValue();
        String errorMessage = response.getPpCheckDetailResponse().getOperationalResult().getErrorMessage();
        String checkDetail = response.getPpCheckDetailResponse().getCheckDetail();

        assertEquals(false, success);
        assertEquals("CheckNotFound", errorCode);
        assertEquals("No checks found in the database for given filters.", errorMessage);

        assertNull(checkDetail);
    }

    @Test
    public void testGetCheckNotExistingSequence() {

        MicrosSimphonyAPI microsService = MicrosSimphonyAPI.getInstance(
                null,
                NAMESPACE_URI_SERVER,
                NAMESPACE_URI,
                TARGET_END_POINT,
                false);

        MicrosGetCheckDetailResponse response = null;

        try {
            response = microsService.getCheckDetail(1002, 106599996);
        } catch (java.rmi.RemoteException ex) {

        }

        boolean success = response.getPpCheckDetailResponse().getOperationalResult().getSuccess();
        String errorCode = response.getPpCheckDetailResponse().getOperationalResult().getErrorCode().getValue();
        String errorMessage = response.getPpCheckDetailResponse().getOperationalResult().getErrorMessage();
        String checkDetail = response.getPpCheckDetailResponse().getCheckDetail();

        assertEquals(false, success);
        assertEquals("CheckNotFound", errorCode);
        assertEquals("No checks found in the database for given filters.", errorMessage);

        assertNull(checkDetail);
    }

}
