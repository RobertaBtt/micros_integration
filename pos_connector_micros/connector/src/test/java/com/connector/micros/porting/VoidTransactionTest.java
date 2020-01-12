package com.connector.micros.porting;

import com.connector.micros.config.ApplicationProperty;
import com.connector.micros.config.reader.ConfigReader;
import com.connector.micros.config.LocalConnectionExcludeTest;
import com.connector.micros.porting.response.MicrosVoidTransactionResponse;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.util.Calendar;

@Category(LocalConnectionExcludeTest.class)
public class VoidTransactionTest extends junit.framework.TestCase {

    private ConfigReader configReader = ConfigReader.getInstance(null);

    private String NAMESPACE_URI_SERVER = configReader.getProperty(ApplicationProperty.NAMESPACE_URI_SERVER);
    private String NAMESPACE_URI = configReader.getProperty(ApplicationProperty.NAMESPACE_URI);
    private String TARGET_END_POINT = NAMESPACE_URI_SERVER + configReader.getProperty(ApplicationProperty.END_POINT_ASMX);
    private Integer employeeObjectNumber = Integer.valueOf(configReader.getProperty(ApplicationProperty.EMPLOYEE_OBJ_NUM));

    @Test
    public void testVoidTransactionExToStillOpenCheck() {
        MicrosSimphonyAPI microsService = MicrosSimphonyAPI.getInstance(
                null,
                NAMESPACE_URI_SERVER,
                NAMESPACE_URI,
                TARGET_END_POINT,
                false);

        int num = 1021;
        int sequence = 152194085;

        Calendar dateToFireParam = Calendar.getInstance();
        dateToFireParam.add(Calendar.MONTH, 3);

        MicrosVoidTransactionResponse response = microsService.voidTransaction(employeeObjectNumber, num, sequence, dateToFireParam);


    }
}

