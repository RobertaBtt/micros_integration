package com.go.config;

import com.connector.micros.config.ApplicationProperty;
import com.connector.micros.config.reader.ConfigReader;
import com.connector.micros.config.writer.ConfigWriter;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by jmvera on 5/7/17.
 */
public class ConfigWriterTest {

    @Test
    public void canWritePropertiesFileToDisk() throws IOException {

        File destinationFile;

        String newKey;

        //Setup
        {
            destinationFile = File.createTempFile("temp.application", ".properties");
            //configWriter = new ConfigWriter(destinationFile.getAbsolutePath());
        }

        //Given
        {
            newKey = "Value From Test";
        }

        //When
        {
            ConfigWriter.setProperty(ApplicationProperty.NAMESPACE_URI_SERVER, newKey);
            ConfigWriter.writePropertiesToFile(destinationFile.getAbsolutePath());
        }

        //Then
        {
            ConfigReader configReader = ConfigReader.getInstance(destinationFile.getAbsolutePath());
            assertThat(configReader.getProperty(ApplicationProperty.NAMESPACE_URI_SERVER)).isEqualTo(newKey);
        }

        //CleanUp
        destinationFile.delete();
    }

    @Test
    public void writeEnumTest() throws IOException {
        ConfigReader configReader = ConfigReader.getInstance(null);

        assertThat(configReader.getProperty(ApplicationProperty.ENUM_COMPLETED)).isEqualTo("off");

        ConfigWriter.setProperty(ApplicationProperty.ENUM_COMPLETED, "on");

        assertThat(configReader.getProperty(ApplicationProperty.ENUM_COMPLETED)).isEqualTo("on");
    }
}
