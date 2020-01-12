package com.connector.data_fetcher;

import com.pos.connector.dto.AgentVersion;
import com.connector.micros.config.ApplicationProperty;
import com.connector.micros.config.reader.ConfigReader;
import com.connector.micros.config.LocalConnectionExcludeTest;
import com.connector.micros.data_fetcher.MicrosVersionFetcher;
import com.connector.micros.data_fetcher.request.GetPosInformationRequestMicros;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.util.HashMap;
import java.util.Map;

@Category(LocalConnectionExcludeTest.class)
public class GetVersionTest extends TestCase {


    @Test
    public void testGetVersion() {

        ConfigReader configReader;

        GetPosInformationRequestMicros getPOSInformationRequestMicros;
        Map<String, String> parametersMap = new HashMap<String, String>();

        MicrosVersionFetcher microsVersionFetcher;

        Setup:
        configReader = ConfigReader.getInstance(null);

        String namespaceUriServer = configReader.getProperty(ApplicationProperty.NAMESPACE_URI_SERVER);
        String namespaceUri = configReader.getProperty(ApplicationProperty.NAMESPACE_URI);
        String targetEndPoint = namespaceUriServer + configReader.getProperty(ApplicationProperty.END_POINT_ASMX);
        String employeeObjectNumber = configReader.getProperty(ApplicationProperty.EMPLOYEE_OBJ_NUM);
        String revenueCenter = configReader.getProperty(ApplicationProperty.ENUM_REVENUECENTERS);
        String ENUM_VERSION = configReader.getProperty(ApplicationProperty.ENUM_VERSION);

        parametersMap.put("namespaceUriServer", namespaceUriServer);
        parametersMap.put("namespaceUri", namespaceUri);
        parametersMap.put("targetEndPoint", targetEndPoint);

        parametersMap.put("employeeObjectNumber", employeeObjectNumber);
        parametersMap.put("revenueCenter", revenueCenter);
        parametersMap.put("enumVersion", ENUM_VERSION);

        getPOSInformationRequestMicros = new GetPosInformationRequestMicros(parametersMap);
        microsVersionFetcher = MicrosVersionFetcher.getInstance();

        AgentVersion agentVersion = microsVersionFetcher.getPosVersion(getPOSInformationRequestMicros);

        //assertEquals("Version 2.900.0.553", "<?xml version=\"1.0\" encoding=\"utf-8\"?><?micros-type System.String, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089?><string>2.900.0.553</string>", agentVersion.getContent());
        assertEquals("18.1.0.0", agentVersion.getContent());
    }
}
