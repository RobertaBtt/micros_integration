package com.connector.micros.data_fetcher.response_converter;

import com.pos.connector.dto.AgentDiscount;
import com.pos.connector.dto.AgentDiscountTypesEnum;
import com.connector.micros.dto.MicrosAgentDiscount;
import pos.common.type.Money;
import com.connector.micros.porting.element.ArrayOfDbDiscount;
import com.connector.micros.porting.element.DbDiscount;
import com.connector.micros.porting.response.MicrosGetConfigurationInfoResponse;

import java.util.ArrayList;
import java.util.List;

public class GetDiscountsConverter {

    /***
     *
     * @param response MicrosGetConfigurationInfoResponse
     * @return The List of object of type Discount inside the configuration of Agent specific of Micros
     */
    public static List<AgentDiscount> convertResponse(MicrosGetConfigurationInfoResponse response, String currency) {

        ArrayOfDbDiscount arrayOfDbDiscount = null;
        List<DbDiscount> dbDiscounts;
        AgentDiscount discountToRetrieve;
        AgentDiscountTypesEnum discountTypesEnum;

        String optionsBitDiscount;
        List<AgentDiscount> discounts = new ArrayList<AgentDiscount>();

        if (response.getConfigInfoResponse().getOperationalResult().getSuccess()) {

            String discountsXml = response.getConfigInfoResponse().getDiscounts();

            if (!discountsXml.isEmpty()) {

                try {
                    arrayOfDbDiscount = ArrayOfDbDiscount.Factory.parse(discountsXml);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                if (arrayOfDbDiscount != null) {

                    dbDiscounts = arrayOfDbDiscount.getDbDiscounts();
                    if (dbDiscounts.size() > 0) {
                        for (DbDiscount discount : dbDiscounts) {
                            optionsBitDiscount = discount.getOptionBits();
                            /***
                             * If first Bit is 0, the discount is of type "Closed"
                             */
                            if (optionsBitDiscount.charAt(0) == 0)
                                discountTypesEnum = AgentDiscountTypesEnum.CLOSE;
                            else {
                                /**
                                 * If second bit is 0, means that is not Amout type, so is of type Percentage
                                 */
                                if (optionsBitDiscount.charAt(1) == 0)
                                    discountTypesEnum = AgentDiscountTypesEnum.PERCENTAGE;
                                else
                                    discountTypesEnum = AgentDiscountTypesEnum.AMOUNT;

                            }
                            discountToRetrieve = MicrosAgentDiscount.builder()
                                    .objectNumber(discount.getObjectNumber())
                                    .discountID(discount.getDscntID())
                                    .name(discount.getName().getStringText())
                                    .percentageAmount(Money.of(discount.getPercentage(), currency))
                                    .fixedAmount(Money.of(discount.getPercentage(), currency))
                                    .discountType(discountTypesEnum)
                                    .build();
                            discounts.add(discountToRetrieve);
                        }
                    }

                }

            }

        } else {
            //throw new Exception of type GetOpenChecks or generic Get data with
            //message = response.getOpenChecks().getOperationalResult().getErrorMessage()
            //and errorCode = response.getOpenChecks().getOperationalResult().getErrorCode().getValue()
        }

        return discounts;

    }
}
