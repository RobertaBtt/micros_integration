package com.connector.micros.config;


public enum ApplicationProperty {

    ENUM_COMPLETED("enum_completed"),
    PREFIX_CONDIMENTS_SETTED("prefix_condiments_setted"),

    ENUM_UNDEFINED("UNDEFINED"),
    ENUM_MENUITEMDEFINITIONS("MENUITEMDEFINITIONS"),
    ENUM_MENUITEMPRICE("MENUITEMPRICE"),
    ENUM_MENUITEMCLASS("MENUITEMCLASS"),
    ENUM_SERVICECHARGE("SERVICECHARGE"),
    ENUM_DISCOUNTDEFINITIONS("DISCOUNTDEFINITIONS"),
    ENUM_TENDERMEDIA("TENDERMEDIA"),
    ENUM_ORDERTYPE("ORDERTYPE"),
    ENUM_FAMILYGROUP("FAMILYGROUP"),
    ENUM_MAJORGROUP("MAJORGROUP"),
    ENUM_REVENUECENTERPARAMETER("REVENUECENTERPARAMETER"),
    ENUM_REVENUECENTERS("REVENUECENTERS"),
    ENUM_INTERFACES("INTERFACES"),
    ENUM_MENUITEMMASTERS("MENUITEMMASTERS"),
    ENUM_SERVINGPERIODS("SERVINGPERIODS"),
    ENUM_CURRENCY("CURRENCY"),
    ENUM_VERSION("VERSION"),
    ENUM_EMPLOYEES("EMPLOYEES"),
    ENUM_TABLES("TABLES"),
    ENUM_LANGUAGEINFORMATION("LANGUAGEINFORMATION"),
    ENUM_MENULEVEL("MENULEVEL"),
    ENUM_MENUITEMSLU("MENUITEMSLU"),
    ENUM_MAINMENULEVEL("MAINMENULEVEL"),
    ENUM_SUBMENULEVEL("SUBMENULEVEL"),
    ENUM_EVENTTYPES("EVENTTYPES"),
    ENUM_EVENTSUBTYPES("EVENTSUBTYPES"),
    ENUM_EVENTDEFINITIONS("EVENTDEFINITIONS"),
    ENUM_TAX("TAX"),

    NAMESPACE_URI_SERVER("namespace_uri_server"),
    MICROSERVICE_NAME("microservice_name"),
    NAMESPACE_URI("namespace_uri"),
    END_POINT_ASMX("end_point_asmx"),
    VENDOR_CODE("vendor_code"),

    EMPLOYEE_OBJ_NUM("EMPLOYEE_OBJ_NUM"),


    /* Discount*/
    DISCOUNT_STRING("discount_string"),
    DISCOUNT_ID("discount_id"),

    /* Payment*/
    PAYMENT_ID("payment_id"),
    PAYMENT_STRING("payment_string"),
    PAYMENT_REFERENCE("payment_reference"),

    AGENT_ID("agent_id"),
    AGENT_INSTALLATION_UUID("agent_installation_uuid"),
    GLOBAL_POS_CURRENCY("global_pos_currency"),
    GLOBAL_POS_LOCALE("global_pos_locale"),
    DEFAULT_DATE_FORMAT("default_date_format"),
    RABBITMQ_SENDER_HOST("rabbitmq_sender_host"),
    RABBITMQ_SENDER_PORT("rabbitmq_sender_port"),
    RABBITMQ_SENDER_USERNAME("rabbitmq_sender_username"),
    RABBITMQ_SENDER_PASSWORD("rabbitmq_sender_password"),
    RABBITMQ_QUEUE_NAME_ORDERS("rabbitmq_queue_name_orders"),
    RABBITMQ_QUEUE_NAME_REMOVED_ORDERS("rabbitmq_queue_name_removed_orders");

    private String propertyKey;

    ApplicationProperty(String propertyKey) {
        this.propertyKey = propertyKey;
    }

    public String getPropertyKey() {
        return propertyKey;
    }

    public static ApplicationProperty getEnumFromString(String enumStringKey) {

        if (enumStringKey == "UNDEFINED")
            return ApplicationProperty.ENUM_UNDEFINED;

        else if (enumStringKey == "MENUITEMDEFINITIONS")
            return ApplicationProperty.ENUM_MENUITEMDEFINITIONS;

        else if (enumStringKey == "MENUITEMPRICE")
            return ApplicationProperty.ENUM_MENUITEMPRICE;

        else if (enumStringKey == "MENUITEMCLASS")
            return ApplicationProperty.ENUM_MENUITEMCLASS;

        else if (enumStringKey == "SERVICECHARGE")
            return ApplicationProperty.ENUM_SERVICECHARGE;

        else if (enumStringKey == "DISCOUNTDEFINITIONS")
            return ApplicationProperty.ENUM_DISCOUNTDEFINITIONS;

        else if (enumStringKey == "TENDERMEDIA")
            return ApplicationProperty.ENUM_TENDERMEDIA;

        else if (enumStringKey == "ORDERTYPE")
            return ApplicationProperty.ENUM_ORDERTYPE;

        else if (enumStringKey == "FAMILYGROUP")
            return ApplicationProperty.ENUM_FAMILYGROUP;

        else if (enumStringKey == "MAJORGROUP")
            return ApplicationProperty.ENUM_MAJORGROUP;

        else if (enumStringKey == "REVENUECENTERPARAMETER")
            return ApplicationProperty.ENUM_REVENUECENTERPARAMETER;

        else if (enumStringKey == "REVENUECENTERS")
            return ApplicationProperty.ENUM_REVENUECENTERS;

        else if (enumStringKey == "INTERFACES")
            return ApplicationProperty.ENUM_INTERFACES;

        else if (enumStringKey == "MENUITEMMASTERS")
            return ApplicationProperty.ENUM_MENUITEMMASTERS;

        else if (enumStringKey == "SERVINGPERIODS")
            return ApplicationProperty.ENUM_SERVINGPERIODS;

        else if (enumStringKey == "CURRENCY")
            return ApplicationProperty.ENUM_CURRENCY;

        else if (enumStringKey == "VERSION")
            return ApplicationProperty.ENUM_VERSION;

        else if (enumStringKey == "EMPLOYEES")
            return ApplicationProperty.ENUM_EMPLOYEES;

        else if (enumStringKey == "TABLES")
            return ApplicationProperty.ENUM_TABLES;

        else if (enumStringKey == "LANGUAGEINFORMATION")
            return ApplicationProperty.ENUM_LANGUAGEINFORMATION;

        else if (enumStringKey == "MENULEVEL")
            return ApplicationProperty.ENUM_MENULEVEL;

        else if (enumStringKey == "MENUITEMSLU")
            return ApplicationProperty.ENUM_MENUITEMSLU;

        else if (enumStringKey == "MAINMENULEVEL")
            return ApplicationProperty.ENUM_MAINMENULEVEL;

        else if (enumStringKey == "SUBMENULEVEL")
            return ApplicationProperty.ENUM_SUBMENULEVEL;

        else if (enumStringKey == "EVENTTYPES")
            return ApplicationProperty.ENUM_EVENTTYPES;

        else if (enumStringKey == "EVENTSUBTYPES")
            return ApplicationProperty.ENUM_EVENTSUBTYPES;

        else if (enumStringKey == "EVENTDEFINITIONS")
            return ApplicationProperty.ENUM_EVENTDEFINITIONS;

        else if (enumStringKey == "TAX")
            return ApplicationProperty.ENUM_TAX;

        else return null;
    }
}

