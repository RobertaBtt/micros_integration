package com.connector.micros.porting;

import com.connector.micros.config.ApplicationProperty;
import com.connector.micros.config.reader.ConfigReader;
import com.connector.micros.config.LocalConnectionExcludeTest;
import com.micros_hosting.egateway.EConfigurationInfoType;
import com.micros_hosting.egateway.GetConfigurationInfoResponse;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(LocalConnectionExcludeTest.class)
public class GetDiscountsTest extends junit.framework.TestCase {

    private ConfigReader configReader = ConfigReader.getInstance(null);

    private String NAMESPACE_URI_SERVER = configReader.getProperty(ApplicationProperty.NAMESPACE_URI_SERVER);
    private String NAMESPACE_URI = configReader.getProperty(ApplicationProperty.NAMESPACE_URI);
    private String TARGET_END_POINT = NAMESPACE_URI_SERVER + configReader.getProperty(ApplicationProperty.END_POINT_ASMX);
    private Integer employeeObjectNumber = Integer.valueOf(configReader.getProperty(ApplicationProperty.EMPLOYEE_OBJ_NUM));
    private Integer revenueCenter = Integer.valueOf(configReader.getProperty(ApplicationProperty.ENUM_REVENUECENTERS));
    private Integer discountEnumDefiniton = Integer.valueOf(configReader.getProperty(ApplicationProperty.ENUM_DISCOUNTDEFINITIONS));


    @Test
    public void testGetDiscounts() {

        MicrosSimphonyAPI microsService = MicrosSimphonyAPI.getInstance(
                null,
                NAMESPACE_URI_SERVER,
                NAMESPACE_URI,
                TARGET_END_POINT,
                false);

        GetConfigurationInfoResponse response = null;

        try {
            response = microsService.getConfigurationInfo(employeeObjectNumber, discountEnumDefiniton, revenueCenter);
        } catch (java.rmi.RemoteException ex) {

        }
        boolean success = response.getConfigInfoResponse().getOperationalResult().getSuccess();
        String errorCode = response.getConfigInfoResponse().getOperationalResult().getErrorCode().getValue();
        String errorMessage = response.getConfigInfoResponse().getOperationalResult().getErrorMessage();
        EConfigurationInfoType[] configInfoType = response.getConfigInfoResponse().getConfigInfoType().getEConfigurationInfoType();

        String configInfoTypeValue = configInfoType[0].getValue();

        assertEquals(true, success);
        assertEquals("Success", errorCode);
        assertEquals("Success", errorMessage);
        assertEquals("DISCOUNTDEFINITIONS", configInfoTypeValue);


    }

}
