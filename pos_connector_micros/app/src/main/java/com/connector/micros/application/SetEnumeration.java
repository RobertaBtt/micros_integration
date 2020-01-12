package com.connector.micros.application;

import com.connector.micros.config.ApplicationProperty;
import com.connector.micros.config.reader.ConfigReader;
import com.connector.micros.config.reader.ConfigReaderInterface;
import com.connector.micros.config.writer.ConfigWriter;
import com.connector.micros.config.writer.EnumerationConfigWriter;
import com.connector.micros.config.writer.ConfigWriter;
import com.connector.micros.data_fetcher.MicrosConfigurationFetcher;
import com.connector.micros.data_fetcher.request.GetConfigurationInfoRequestMicros;
import com.connector.micros.dto.MicrosAgentConfiguration;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SetEnumeration {

    public static void setEnumeration(ConfigReaderInterface ConfigReader, String enumExternalPropertiesFile, String ExternalPropertiesFile) {

        GetConfigurationInfoRequestMicros getConfigurationInfoRequestMicros;
        Map<String, String> parametersMap = new HashMap<String, String>();

        String namespaceUriServer = ConfigReader.getProperty(ApplicationProperty.NAMESPACE_URI_SERVER);
        String namespaceUri = ConfigReader.getProperty(ApplicationProperty.NAMESPACE_URI);
        String targetEndPoint = namespaceUriServer + ConfigReader.getProperty(ApplicationProperty.END_POINT_ASMX);

        parametersMap.put("namespaceUriServer", namespaceUriServer);
        parametersMap.put("namespaceUri", namespaceUri);
        parametersMap.put("targetEndPoint", targetEndPoint);
        parametersMap.put("employeeObjectNumber", ConfigReader.getProperty(ApplicationProperty.EMPLOYEE_OBJ_NUM));

        parametersMap.put("revenueCenter", ConfigReader.getProperty(ApplicationProperty.ENUM_REVENUECENTERS));

        getConfigurationInfoRequestMicros = new GetConfigurationInfoRequestMicros(parametersMap);
        MicrosConfigurationFetcher microsConfigurationFetcher = MicrosConfigurationFetcher.getInstance();
        MicrosAgentConfiguration microsConfiguration = (MicrosAgentConfiguration) microsConfigurationFetcher.getConfigurationFromPos(getConfigurationInfoRequestMicros);

        Map<String, Integer> microsEnumValues = microsConfiguration.getMicrosEnumValues();

        for (Map.Entry<String, Integer> entry : microsEnumValues.entrySet()) {

            EnumerationConfigWriter.setProperty(ApplicationProperty.getEnumFromString(entry.getKey()), String.valueOf(entry.getValue()));
            try {
                EnumerationConfigWriter.writePropertiesToFile(enumExternalPropertiesFile);
            } catch (IOException ex) {
                System.out.println("Error writing property " + entry.getKey() + " in the file " + enumExternalPropertiesFile);
            }
        }

        /*Only at the end of the config process, we set up the enum_config = on*/
        ConfigWriter.setProperty(ApplicationProperty.ENUM_COMPLETED, "on");

        try {
            ConfigWriter.writePropertiesToFile(ExternalPropertiesFile);
        } catch (IOException ex) {
            System.out.println("Error writing property ENUM_COMPLETED in the file " + ExternalPropertiesFile);
        }


    }

}
