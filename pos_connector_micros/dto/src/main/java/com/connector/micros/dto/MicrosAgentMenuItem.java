package com.connector.micros_micros.dto;

import com.connector.micros.dto.AgentMenuItem;
import com.connector.micros.dto.AgentMenuItemTypesEnum;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


/***
 * @doc: A Micros Menu Item has a string name, a string that identifies it, and a type
 */
@Getter
@Setter
public class MicrosAgentMenuItem extends AgentMenuItem {


    private String name;
    private String identifier;

    private String miMasterObjNum;

    private AgentMenuItemTypesEnum menuType;


    @Builder
    public MicrosAgentMenuItem(String name, String identifier, AgentMenuItemTypesEnum menuType) {
        this.name = name;
        this.identifier = identifier;
        this.menuType = menuType;
    }


}
