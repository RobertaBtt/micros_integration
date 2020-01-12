package com.pos.connector.dto;

public enum AgentServiceChargeTypesEnum {
    PERCENTAGE, // I can specify the percentage, the Service Charge is open for percentage
    AMOUNT, // I can specify the amount, the Service Charge is open for amount
    CLOSE;    //The Service Charge is Closed and I can't specify anything, nor the amount nor the percentage
}
