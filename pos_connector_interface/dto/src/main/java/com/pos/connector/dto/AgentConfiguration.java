package com.pos.connector.dto;


import lombok.Getter;
import lombok.Setter;

import java.util.Map;


@Getter
@Setter
public class AgentConfiguration {

    public AgentConfiguration() {
    }

    private Map<String, String> listOfValues;

    public AgentConfiguration(Map<String, String> listOfValues) {
        this.listOfValues = listOfValues;
    }


}
