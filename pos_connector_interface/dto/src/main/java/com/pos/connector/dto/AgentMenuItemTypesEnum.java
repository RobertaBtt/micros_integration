package com.pos.connector.dto;

public enum AgentMenuItemTypesEnum {
    MAIN_ITEM,          //The Item of this type is the parent Item. Could have child or not, but it's not a child itself.
    SUB_ITEM,           // This type is a son of another item. Could have child itself.
    CONDIMENT,          // This type is a particular son of an Item.
    PREFIX_CONDIMENT    // This type is a particular son of an Item, its description will be joined before the name of another condiment (like a Prefix)

}