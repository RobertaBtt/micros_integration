package com.connector.micros.data_converter;

import com.connector.microsdata_converter.AgentDataConverterInterface;
import com.connector.microsdto.*;
import com.connector.micros.dto.MicrosAgentOrder;
import com.pos.connector.dto.AgentOrderItem;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class MicrosDataConverter implements AgentDataConverterInterface {
    /***
     * @param agentOrder is the interface of the Agent Order, is the generic one
     * @return the converted, through the specific implemented mapper, the PosOrder, understandable by Pos Collector
     */
    @Override
    public com.pos.connector.dto.AgentOrder convert(AgentOrder agentOrder) {

        MicrosAgentOrder microsAgentOrder = (MicrosAgentOrder) agentOrder;

        String microsOrderIdentifier = microsAgentOrder.getIdentifier();
        UUID microsOrderAgentInstallationUUID = microsAgentOrder.getAgentInstallationUUID();

        com.pos.connector.dto.AgentId microsPosId = com.pos.connector.dto.AgentId.of(microsOrderIdentifier, microsOrderAgentInstallationUUID);

        List<com.pos.connector.dto.AgentOrderItem> productLines = new ArrayList<AgentOrderItem>();
        List<com.pos.connector.dto.AgentOrderItem> taxes = new ArrayList<AgentOrderItem>();
        List<com.pos.connector.dto.AgentOrderItem> discounts = new ArrayList<AgentOrderItem>();
        List<com.pos.connector.dto.AgentOrderItem> serviceCharges = new ArrayList<AgentOrderItem>();

        List<AgentProduct> microsProducts = ((MicrosAgentOrder) agentOrder).getProducts();
        List<AgentTax> microsTaxes = ((MicrosAgentOrder) agentOrder).getTaxes();
        List<AgentDiscount> microsDiscounts = ((MicrosAgentOrder) agentOrder).getDiscounts();
        List<AgentServiceCharge> microsServiceCharges = ((MicrosAgentOrder) agentOrder).getServiceCharges();

        if (microsProducts != null) {
            for (AgentProduct microsProduct : microsProducts) {
                com.pos.connector.dto.AgentOrderItem productLine;

                productLine = com.pos.connector.dto.AgentOrderItem.builderProduct(
                        microsProduct.getIdentifier(),
                        microsProduct.getAmount())
                        .itemSubtype(microsProduct.getSubType())
                        .description(microsProduct.getName())
                        .quantity(microsProduct.getQuantity())
                        .parentId(microsProduct.getParentId())
                        .displayOrder(microsProduct.getDisplayOrder())
                        .build();
                productLines.add(productLine);
            }
        }


        if (microsTaxes != null) {
            for (AgentTax microsTax : microsTaxes) {
                com.pos.connector.dto.AgentOrderItem posTax;
                posTax = com.pos.connector.dto.AgentOrderItem.builderTax(
                        microsTax.getIdentifier(),
                        microsTax.getAmount())
                        .posId(microsTax.getIdentifier())
                        .itemSubtype(microsTax.getSubType())
                        .description(microsTax.getName())
                        .parentId(microsTax.getParentId())
                        .displayOrder(microsTax.getDisplayOrder())
                        .build();

                taxes.add(posTax);
            }

        }


        if (microsDiscounts != null) {
            for (AgentDiscount microsDiscount : microsDiscounts) {

                com.pos.connector.dto.AgentOrderItem posDiscount;
                posDiscount = com.pos.connector.dto.AgentOrderItem.builderDiscount(
                        microsDiscount.getIdentifier(),
                        microsDiscount.getFixedAmount())
                        .posId(microsDiscount.getIdentifier())
                        .itemSubtype(microsDiscount.getSubType())
                        .description(microsDiscount.getName())
                        .parentId(microsDiscount.getParentId())
                        .displayOrder(microsDiscount.getDisplayOrder())
                        .build();
                discounts.add(posDiscount);

            }
        }

        if (microsServiceCharges != null) {
            for (AgentServiceCharge microsServiceCharge : microsServiceCharges) {

                com.pos.connector.dto.AgentOrderItem posServiceCharge;

                posServiceCharge = com.pos.connector.dto.AgentOrderItem.builderServiceCharge(
                        microsServiceCharge.getIdentifier(),
                        microsServiceCharge.getFixedAmount())
                        .posId(microsServiceCharge.getIdentifier())
                        .itemSubtype(microsServiceCharge.getSubType())
                        .description(microsServiceCharge.getName())
                        .parentId(microsServiceCharge.getParentId())
                        .displayOrder(microsServiceCharge.getDisplayOrder())
                        .build();
                serviceCharges.add(posServiceCharge);

            }
        }



        List<com.pos.connector.dto.AgentOrderItem> allItems = new ArrayList<AgentOrderItem>();
        allItems.addAll(productLines);
        allItems.addAll(taxes);
        allItems.addAll(discounts);
        allItems.addAll(serviceCharges);


        com.pos.connector.dto.AgentOrder posOrder = com.pos.connector.dto.AgentOrder.builder()

                .agentId(microsPosId)
                .table(String.valueOf(microsAgentOrder.getTableNumber()))
                .totalAmount(microsAgentOrder.getTotal())
                .subtotal(microsAgentOrder.getSubtotal())
                .remainingDue(microsAgentOrder.getTotalDue())
                .openTime(microsAgentOrder.getOpenTime())
                .items(allItems)
                .build();

        return posOrder;

    }
}
