package com.connector.micros.data_fetcher.response_converter;

import com.pos.connector.dto.*;
import com.connector.micros.config.reader.ConfigReader;

import com.connector.micros.dto.*;
import pos.common.type.Money;
import com.connector.micros.porting.element.*;
import com.connector.micros.porting.response.MicrosGetCheckDetailResponse;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import static java.math.BigInteger.ZERO;

public class GetOrderByIdentifierConverter {

    /***
     *
     * @param response MicrosGetOpenChecksResponse
     * @return The AgentOrder of Micros specific type
     */
    public static AgentOrder convertResponse(MicrosGetCheckDetailResponse response,
                                             int checkNum,
                                             int checkSequence,
                                             int tableNumber,
                                             String currency,
                                             Long lastServiceTime,
                                             UUID agentInstallationUUID) {

        ConfigReader configReader = ConfigReader.getInstance(null);

        String checkDetailXmlString = response.getPpCheckDetailResponse().getCheckDetail();
        MicrosAgentOrder microsAgentOrder = null;
        MicrosAgentOrderType typeOfTheOrder;
        MicrosAgentCurrency currencyOfTheOrder;
        MicrosAgentProduct tempProduct = null;
        MicrosAgentTax tempTax;
        MicrosAgentDiscount tempDiscount;
        MicrosAgentServiceCharge tempServiceCharge;

        List<AgentProduct> products = new ArrayList<AgentProduct>();
        List<AgentTax> taxes = new ArrayList<AgentTax>();
        List<AgentDiscount> discounts = new ArrayList<AgentDiscount>();
        List<AgentServiceCharge> servicesCharge = new ArrayList<AgentServiceCharge>();

        HashMap<String, MicrosAgentProduct> childProducts = new HashMap<String, MicrosAgentProduct>();
        boolean isSingleTax = false;

        BigDecimal tipSum = new BigDecimal(ZERO);
        BigDecimal itemProductsTotal = new BigDecimal(ZERO);

        Check check = null;
        String itemName = "";

        if (response.getPpCheckDetailResponse().getOperationalResult().getSuccess()) {

            if (!checkDetailXmlString.isEmpty()) {

                try {
                    check = Check.Factory.parse(checkDetailXmlString);

                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (check != null) {

                    typeOfTheOrder = MicrosAgentOrderType.builder()
                            .orderTypeID(check.getSummary().getOrderTypeID())
                            .orderTypeObjectNumber(check.getSummary().getOrderTypeObjNum())
                            .build();

                    try {
                        List<DetailLine> detailLineList = check.getDetailLines().getDetailLine();

                        for (int index = 0; index < detailLineList.size(); index++) {

                            String detailLink = detailLineList.get(index).getDetailLink();
                            String parentId = detailLineList.get(index).getParentDetailLink();

                            if (isItemPayment(detailLineList.get(index))) {
                                tipSum = incrementTipAmount(detailLineList.get(index).getTenderMedia(), tipSum);
                            }

                            else if (isItemProduct(detailLineList.get(index)) && notRemovedItem(detailLineList.get(index))) {



                                CGwTaxTotals taxTotals = null;
                                Money taxAmount;
                                String taxName;

                                String tempObjectNumber = String.valueOf(detailLineList.get(index).getMenuItem().getObj());
                                BigDecimal amount = detailLineList.get(index).getTotal();

                                if (detailLineList.get(index).getTaxTotals() != null) {
                                    taxTotals = detailLineList.get(index).getTaxTotals().getCGwTaxTotals();
                                }

                                if (taxTotals != null) {
                                    taxAmount = Money.of(taxTotals.getmTaxCollectedTotal(), currency);
                                    taxName = taxTotals.getName();

                                    tempTax = MicrosAgentTax.builder()
                                            .name(taxName)
                                            .subType(tempObjectNumber)
                                            .amount(taxAmount)
                                            .build();

                                    tempTax.setId(detailLink);
                                    tempTax.setDisplayOrder(index);
                                    taxes.add(tempTax);

                                } else {
                                    isSingleTax = true;

                                }




//                                if (amount.doubleValue() != 0) {

                                    if (!isAChild(detailLineList.get(index))) {

                                        parentId = null;

                                        itemName = detailLineList.get(index).getMenuItem().getName();

                                        tempProduct = MicrosAgentProduct.builder()
                                                .name(itemName)
                                                .subType(tempObjectNumber)
                                                .objectNumber(Long.valueOf(index + "" + tempObjectNumber))
                                                .quantity(detailLineList.get(index).getSalesCount())
                                                .amount(Money.of(detailLineList.get(index).getTotal(), currency))
                                                .displayOrder(index)
                                                .build();

                                        tempProduct.setId(detailLineList.get(index).getDetailLink());
                                        tempProduct.setParentId(parentId);

                                        products.add(tempProduct);


                                    } else {


                                        String prefixCondimentString = getPrefixCondimentString(detailLineList.get(index), configReader);

                                        /*Normal Child, no prefix condiment*/
                                        if (prefixCondimentString == null){

                                            itemName = detailLineList.get(index).getMenuItem().getName() + " *" ;
                                            tempProduct = MicrosAgentProduct.builder()
                                                    .name(itemName)
                                                    .subType(tempObjectNumber)
                                                    .objectNumber(Long.valueOf(index + "" + tempObjectNumber))
                                                    .quantity(detailLineList.get(index).getSalesCount())
                                                    .amount(Money.of(detailLineList.get(index).getTotal(), currency))
                                                    .displayOrder(index)
                                                    .build();

                                            tempProduct.setId(detailLineList.get(index).getDetailLink());
                                            tempProduct.setParentId(parentId);

                                            childProducts.put(detailLink, tempProduct);
                                        }

                                       else{
                                            System.out.println("Condimento trovato");
                                            try{
                                                String nameToAppend = childProducts.get(parentId).getName();
                                                childProducts.get(parentId).setName(prefixCondimentString + " " + nameToAppend);

                                            }
                                            catch (Exception ex){}
                                        }

                                        //products.add(tempProduct);
                                    }


//                                }

                                itemProductsTotal = itemProductsTotal.add(detailLineList.get(index).getTotal());

                            } else if (isItemDiscount(detailLineList.get(index))) {

                                String tempObjectNumber = String.valueOf(detailLineList.get(index).getDiscount().getObj());
                                parentId = detailLineList.get(index).getParentDetailLink();

                                Money discountFixedAmount;
                                Money discountPercentageAmount;

                                CGwTaxTotals discountTaxTotal = null;
                                taxTotals taxTotals = detailLineList.get(index).getTaxTotals();

                                if (taxTotals != null) {
                                    discountTaxTotal = taxTotals.getCGwTaxTotals();
                                }

                                if (discountTaxTotal != null) {
                                    discountFixedAmount = Money.of(discountTaxTotal.getmTaxableTotal().subtract(discountTaxTotal.getmTaxCollectedTotal()), currency);
                                    discountPercentageAmount = Money.of(discountTaxTotal.getmTaxableTotal().subtract(discountTaxTotal.getmTaxCollectedTotal()), currency);

                                } else {
                                    discountFixedAmount = Money.of(new BigDecimal(String.valueOf(detailLineList.get(index).getTotal())), currency);
                                    discountPercentageAmount = Money.of(BigDecimal.ZERO, currency);
                                }

                                tempDiscount = MicrosAgentDiscount.builder()
                                        .name(detailLineList.get(index).getDiscount().getName())
                                        .subType(tempObjectNumber)
                                        .objectNumber(tempObjectNumber)
                                        .discountID(detailLineList.get(index).getDiscount().getDscDbId())
                                        .fixedAmount(discountFixedAmount)
                                        .percentageAmount(discountPercentageAmount)
                                        .displayOrder(index)
                                        .build();

                                tempDiscount.setId(detailLineList.get(index).getDetailLink());
                                tempDiscount.setParentId(parentId);
                                discounts.add(tempDiscount);

                            } else if (isServiceCharge(detailLineList.get(index))) {

                                String tempObjectNumber = String.valueOf(detailLineList.get(index).getServiceCharge().getObj());

                                Money serviceChargeFixedAmount = Money.of(detailLineList.get(index).getTotal(), currency);
                                Money serviceChargePercentageAmount = Money.of(detailLineList.get(index).getTotal(), currency);

                                tempServiceCharge = MicrosAgentServiceCharge.builder()
                                        .objectNumber(tempObjectNumber)
                                        .name(detailLineList.get(index).getServiceCharge().getName())
                                        .fixedAmount(serviceChargeFixedAmount)
                                        .percentageAmount(serviceChargePercentageAmount)
                                        .displayOrder(index)
                                        .build();

                                tempServiceCharge.setId(detailLineList.get(index).getDetailLink());
                                tempServiceCharge.setParentId(parentId);

                                servicesCharge.add(tempServiceCharge);

                            }

                        }

                        for ( MicrosAgentProduct childProduct : childProducts.values()){
                            if (childProduct.getAmount().getAmount().doubleValue() != 0){
                                products.add(childProduct);
                            }

                        }

                        if (isSingleTax) {

                            Money taxAmount;
                            String taxName;

                            taxAmount = Money.of(check.getSummary().getTax(), currency);
                            taxName = "Tax";
                            tempTax = MicrosAgentTax.builder()
                                    .name(taxName)
                                    .subType(String.valueOf(checkNum))
                                    .amount(taxAmount)
                                    .build();

                            tempTax.setId(String.valueOf(checkNum));
                            tempTax.setDisplayOrder(detailLineList.size());
                            taxes.add(tempTax);

                        }

                    } catch (NullPointerException e) {
                        System.out.println("This order is in progress, still doesn't have product lines or is not available" + checkNum + " " + checkSequence);
                    }

                    Long formattedOpenTimeCheck = 0L;

                    try {
                        //TODO: Add the information about the local time !
                        //TODO: this format must come from the application.properties file !
                        formattedOpenTimeCheck = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS").parse(check.getSummary().getCheckOpenTime()).getTime();

                    } catch (ParseException e) {
                        e.printStackTrace();
                    }

                    microsAgentOrder = MicrosAgentOrder.builder()
                            .number(check.getSummary().getCheckNumber())
                            .sequence(checkSequence)
                            .orderType(typeOfTheOrder)
                            .tableNumber(tableNumber)
                            .totalDue(Money.of(check.getSummary().getDue(), currency))
                            .openTime(formattedOpenTimeCheck)
                            .lastServiceTime(lastServiceTime)
                            .build();


                    microsAgentOrder.setTotal(Money.of(check.getSummary().getDue(), currency));

                    microsAgentOrder.setSubtotal(Money.of(itemProductsTotal, currency));
                    microsAgentOrder.setTipAmount(Money.of(tipSum, currency));
                    microsAgentOrder.setAgentInstallationUUID(agentInstallationUUID);
                    microsAgentOrder.setProducts(products);
                    microsAgentOrder.setTaxes(taxes);
                    microsAgentOrder.setDiscounts(discounts);
                    microsAgentOrder.setServiceCharges(servicesCharge);

                }

            }

        } else {
            //throw new Exception of type GetOpenChecks or generic Get data with
            //message = response.getOpenChecks().getOperationalResult().getErrorMessage()
            //and errorCode = response.getOpenChecks().getOperationalResult().getErrorCode().getValue()
        }

        return microsAgentOrder;

    }

    private static boolean isItemPayment(DetailLine detailLine) {

        String detailType = detailLine.getDetailType();
        if (detailType.equalsIgnoreCase("DtlTmedType"))
            return true;
        return false;
    }


    private static boolean isItemProduct(DetailLine detailLine) {

        String detailType = detailLine.getDetailType();
        if (detailType.equalsIgnoreCase("DtlMiType"))
            return true;
        return false;
    }

    private static boolean isItemDiscount(DetailLine detailLine) {

        String detailType = detailLine.getDetailType();
        if (detailType.equalsIgnoreCase("DtlDscType"))
            return true;
        return false;
    }


    private static boolean isServiceCharge(DetailLine detailLine) {

        String detailType = detailLine.getDetailType();
        if (detailType.equalsIgnoreCase("DtlSvcType"))
            return true;
        return false;
    }

    private static String getPrefixCondimentString(DetailLine detailLine, ConfigReader configReader) {

        String objectKey = detailLine.getMenuItem().getObj();
        String value = null;
        try{
            value = configReader.getPropertyByString(objectKey);
        }
        catch (Exception ex){
            System.out.println("Exception" + ex);
        }
        return value;

    }





    private static BigDecimal incrementTipAmount(TenderMedia tenderMedia, BigDecimal tipSum) {

        if (!tenderMedia.getChargeTipTotal().equalsIgnoreCase("0")) {
            tipSum = tipSum.add(new BigDecimal(String.valueOf(tenderMedia.getChargeTipTotal())));
        }
        return tipSum;
    }

    private static boolean notRemovedItem(DetailLine detailLine) {

        if (String.valueOf(detailLine.getVoidLink()).equals("0")) {
            return true;
        }
        return false;
    }

    private static boolean isAChild(DetailLine detailLine) {

        if (!detailLine.getParentDetailLink().equalsIgnoreCase("0")) {
            return true;
        }
        return false;
    }

}
