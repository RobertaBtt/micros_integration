package com.connector.micros_micros.dto;

import com.connector.micros.dto.AgentConfiguration;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;


@Getter
@Setter
public class MicrosAgentConfiguration extends AgentConfiguration {

    private Map<String, Integer> microsEnumValues = new HashMap<String, Integer>();


    public MicrosAgentConfiguration(Map<String, String> listOfValues, Map<String, Integer> microsEnumValues) {
        super(listOfValues);
        this.microsEnumValues = microsEnumValues;
    }

    public MicrosAgentConfiguration(Map<String, Integer> microsEnumValues) {
        this.microsEnumValues = microsEnumValues;
    }

    public MicrosAgentConfiguration() {

    }

    public void addAKeyValueToMicrosEnum(String key, int value) {
        if (microsEnumValues == null)
            microsEnumValues = new HashMap<String, Integer>();

        /**
         * If the map previously contained a mapping for
         * the key, the old value is replaced by the specified value.
         */
        microsEnumValues.put(key, value);

    }

    public int getConfigInfoNumber(String configInfoLabel) {
        if (microsEnumValues != null) {
            return microsEnumValues.get(configInfoLabel);
        } else return -1;
    }

}
