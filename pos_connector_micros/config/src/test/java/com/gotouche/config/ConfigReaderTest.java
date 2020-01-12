package com.connector.config;

import com.connector.micros.config.ApplicationProperty;
import com.connector.micros.config.reader.ConfigReader;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;


public class ConfigReaderTest {

    @Test
    public void canReadDefaultPropertiesFileFromResource() throws IOException {

        ConfigReader configReader;
        String testNamespaceUri;

        String namespaceUri;
        File destinationFile;


        //Given:
        {
            destinationFile = File.createTempFile("/application", ".properties");
            testNamespaceUri = "http://micros-hosting.com/EGatewayTest/";
            configReader = ConfigReader.getInstance(destinationFile.getAbsolutePath());
        }

        //When
        {
            namespaceUri = configReader.getProperty(ApplicationProperty.NAMESPACE_URI);
        }

        //Then
        {
            assertThat(testNamespaceUri).isEqualTo(namespaceUri);
        }
    }

    @Test
    public void checkEnum() throws IOException {

        ConfigReader configReader;

        configReader = ConfigReader.getInstance(null);

        String enumCompleted = configReader.getProperty(ApplicationProperty.ENUM_COMPLETED);
        assertThat(enumCompleted).isEqualTo("off");

    }
}
