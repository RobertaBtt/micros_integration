package com.pos.connector.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


/***
 * @doc: The Version of the POS
 */
@Getter
@Setter
public class AgentVersion {

    private String content;

    @Builder
    public AgentVersion(String content) {
        this.content = content;
    }
}
