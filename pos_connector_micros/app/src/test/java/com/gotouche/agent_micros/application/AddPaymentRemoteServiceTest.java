package com.connector.micros.application;

import com.connector.micros.config.reader.ConfigReader;
import com.connector.micros.config.LocalConnectionExcludeTest;
import pos.common.type.Money;
import com.pos.connector.dto.*;
import com.pos.connector.dto.request.AddPaymentRequest;
import io.reactivex.Single;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Category(LocalConnectionExcludeTest.class)
public class AddPaymentRemoteServiceTest extends TestCase {

    private MockAddPaymentService service;
    private AddPaymentRequest paymentToAdd;
    private UUID installationUuid = UUID.fromString("00000000-0000-0000-0000-000000000001");
    private String orderId = "1341.284270088";
    private AgentId agentId = AgentId.of(orderId, installationUuid);
    private UUID orderPaymentUuid = UUID.fromString("00000000-0000-0000-0000-000000000077");

    final Money amount = Money.of(new BigDecimal("0.50"), "SGD");
    final Money tip = Money.of(new BigDecimal("0.0"), "SGD");
    private AgentPayment agentPayment = AgentPayment.of(orderPaymentUuid, amount, tip, 1551709163313L);

    List<AgentOrderDiscount> discounts = new ArrayList<AgentOrderDiscount>();


    @Test
    public void testAddPaymentDiscountList(){

        ConfigReader configReader;
        configReader = ConfigReader.getInstance(null);

        String userDir = System.getProperty("user.dir");

//        ConfigModule.setApplicationPropertiesFile(externalPropertiesFile);
//        /app/static/application.staging.properties
        /*AgentOrderItem.builderUserDiscount(agentId, amountDiscount).description(description).build());*/

        AgentOrderDiscount discount1 = AgentOrderDiscount.builder()
                .description("Benvigut Discount #1")
                .discount(Money.of(new BigDecimal("0.01"), "SGD"))
                .build();

        AgentOrderDiscount discount2 = AgentOrderDiscount.builder()
                .description("Happy Birthday")
                .discount(Money.of(new BigDecimal("0.01"), "SGD"))
                .build();


        AgentOrderDiscount discount3 = AgentOrderDiscount.builder()
                .description("Arrivederci")
                .discount(Money.of(new BigDecimal("0.01"), "SGD"))
                .build();


        service = new MockAddPaymentService();
        paymentToAdd = new AddPaymentRequest(agentId, agentPayment, discounts);
        Single<AgentOrder> result = service.execute(paymentToAdd);

        assertTrue(result != null);


    }
}
