package com.connector.data_fetcher;

import com.pos.connector.dto.AgentConfiguration;
import com.connector.micros.config.ApplicationProperty;
import com.connector.micros.config.reader.ConfigReader;
import com.connector.micros.config.LocalConnectionExcludeTest;
import com.connector.micros.data_fetcher.MicrosConfigurationFetcher;
import com.connector.micros.data_fetcher.request.GetConfigurationInfoRequestMicros;
import com.connector.micros.dto.MicrosAgentConfiguration;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.util.HashMap;
import java.util.Map;

@Category(LocalConnectionExcludeTest.class)
public class GetConfigurationTest extends TestCase {


    @Test
    public void testGetPOSServerConfiguration() {

        ConfigReader configReader;
        GetConfigurationInfoRequestMicros getConfigurationInfoRequestMicros;
        Map<String, String> parametersMap = new HashMap<String, String>();

        MicrosConfigurationFetcher microsConfigurationFetcher;

        Setup:
        configReader = ConfigReader.getInstance(null);

        String namespaceUriServer = configReader.getProperty(ApplicationProperty.NAMESPACE_URI_SERVER);
        String namespaceUri = configReader.getProperty(ApplicationProperty.NAMESPACE_URI);
        String targetEndPoint = namespaceUriServer + configReader.getProperty(ApplicationProperty.END_POINT_ASMX);
        String employeeObjectNumber = configReader.getProperty(ApplicationProperty.EMPLOYEE_OBJ_NUM);
        String revenueCenter = configReader.getProperty(ApplicationProperty.ENUM_REVENUECENTERS);

        parametersMap.put("namespaceUriServer", namespaceUriServer);
        parametersMap.put("namespaceUri", namespaceUri);
        parametersMap.put("targetEndPoint", targetEndPoint);
        parametersMap.put("employeeObjectNumber", employeeObjectNumber);
        parametersMap.put("revenueCenter", revenueCenter);

        getConfigurationInfoRequestMicros = new GetConfigurationInfoRequestMicros(parametersMap);
        microsConfigurationFetcher = MicrosConfigurationFetcher.getInstance();

        AgentConfiguration configuration = microsConfigurationFetcher.getConfigurationFromPos(getConfigurationInfoRequestMicros);

        MicrosAgentConfiguration microsConfiguration = (MicrosAgentConfiguration) configuration;

        assertEquals("This is the config map of the label: DISCOUNTDEFINITIONS: ", 5, microsConfiguration.getConfigInfoNumber("DISCOUNTDEFINITIONS"));
        assertEquals("This is the config map of the label: ORDERTYPE: ", 7, microsConfiguration.getConfigInfoNumber("ORDERTYPE"));
        assertEquals("This is the config map of the label: EMPLOYEES: ", 17, microsConfiguration.getConfigInfoNumber("EMPLOYEES"));
        assertEquals("This is the config map of the label: UNDEFINED: ", 0, microsConfiguration.getConfigInfoNumber("UNDEFINED"));

    }


}
