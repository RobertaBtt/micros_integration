package com.pos.connector.dto;

public enum AgentDiscountTypesEnum {
    PERCENTAGE, // I can specify the percentage, the discount is open for percentage
    AMOUNT, // I can specify the amount, the discount is open for amount
    CLOSE;    //The Discount is Closed and I can't specify anything, nor the amount nor the percentage
}
