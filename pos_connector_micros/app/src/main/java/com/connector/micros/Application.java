package com.connector.micros;


import com.pos.connector.local.data_management.AgentLocalOpenOrdersManagementInterface;
import com.pos.connector.data_converter.AgentDataConverterInterface;
import com.connector.micros.application.AddPaymentRemoteService;
import com.connector.micros.application.SendPositiveDeltaTask;
import com.connector.micros.application.SetEnumeration;
import com.connector.micros.application.SetPrefixCondiments;
import com.connector.micros.config.ApplicationProperty;
import com.connector.micros.config.ConfigurationTypesEnum;
import com.connector.micros.config.reader.ConfigReaderEnumeration;
import com.connector.micros.config.reader.ConfigReaderInterface;
import com.connector.micros.config.reader.ConfigReader;
import com.connector.micros.config.writer.ConfigWriter;
import com.connector.micros.data_converter.MicrosDataConverter;
import com.connector.micros.dto.MicrosAgentDiscount;
import com.connector.micros.dto.MicrosAgentOrder;
import com.connector.micros.dto.MicrosAgentPayment;
import com.connector.micros.infrastructure.client.DaggerClientComponent;
import com.connector.micros.infrastructure.client.Client;
import com.connector.micros.infrastructure.dagger.ConfigModule;
import com.connector.micros.infrastructure.dagger.ConfigModule;
import com.connector.micros.local.data_management.MicrosLocalDiscountsManagement;
import com.connector.micros.local.data_management.MicrosLocalOpenOrdersManagement;
import com.connector.micros.local.data_management.MicrosLocalPaymentTypeManagement;
import com.connector.micros.task.callable.GetOpenOrdersTask;
import com.connector.micros.task.callable.GetRemovedOrdersTask;
import com.connector.micros.task.callable.StoreDiscountsFromPosTask;
import com.connector.micros.task.callable.StorePaymentTypesFromPosTask;
import com.pos.common.rabbitmq.ChannelFactory;
import com.pos.common.rabbitmq.ConnectionFactory;
import com.pos.common.rabbitmq.infrastructure.agent.RPCAgentServer;
import com.pos.common.rabbitmq.infrastructure.microservice.RPCAgentTopology;
import com.pos.common.rabbitmq.producer.RemoteException;
import com.rabbitmq.client.Connection;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Application {

    private static Connection connection;
    private static final Object object = new Object();

    private Application() {
    }


    public static void main(String[] args) throws Exception {

        //initialize arguments
        String externalPropertiesFile = args.length > 0 ? args[0] : null;
        String externalEnumerationPropertiesFile = args.length > 0 ? args[1] : null;

        if (externalPropertiesFile != null && externalEnumerationPropertiesFile != null) {
            runMicrosAgent(externalPropertiesFile, externalEnumerationPropertiesFile);

        }

    }

    private static void runMicrosAgent(String externalPropertiesFile, String externalEnumerationPropertiesFile) {

        ConfigModule.setApplicationPropertiesFile(externalPropertiesFile);

        ConfigReader Properties = (ConfigReader) ConfigModule.provideConfigReaderByType(
                externalPropertiesFile, externalEnumerationPropertiesFile,
                ConfigurationTypesEnum.
        );

        ConfigReaderEnumeration enumProperties = (ConfigReaderEnumeration) ConfigModule.provideConfigReaderByType(
                externalEnumerationPropertiesFile, externalEnumerationPropertiesFile,
                ConfigurationTypesEnum.ENUMERATION
        );


        //Check Enum Configuration
        checkEnumConfiguration(Properties, externalPropertiesFile, externalEnumerationPropertiesFile);

        //Check Discount  Micros Configuration
        checkDiscountConfiguration(Properties, enumProperties, externalPropertiesFile);

        //Check Payment  Micros Configuration
        checkPaymentConfiguration(Properties, enumProperties, externalPropertiesFile);

        //Check Prefix Condiments IDs Micros Configuration
        checkPrefixCondimentsConfiguration(Properties, enumProperties, externalPropertiesFile);


        //Start RPC server
        startRPCServer(Properties);

        //send order deltas example
        Client Client = DaggerClientComponent.create().Client();

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        GetOpenOrdersTask getOpenOrdersTask = new GetOpenOrdersTask(Properties);
        GetRemovedOrdersTask getRemovedOrdersTask = new GetRemovedOrdersTask(Properties);

        Application application = new Application();
        application.executeTasksForever(getOpenOrdersTask, getRemovedOrdersTask, executorService, Client);

    }

    private static void checkEnumConfiguration(ConfigReader Properties,
                                               String externalPropertiesFile, String externalEnumPropertiesFile) {

        boolean enumIsSetted = Properties.isEnumerationCompleted();

        if (!enumIsSetted) {
            SetEnumeration.setEnumeration(Properties, externalEnumPropertiesFile, externalPropertiesFile);
        }
    }

    private static void checkDiscountConfiguration(ConfigReaderInterface Properties,
                                                         ConfigReaderInterface enumProperties,
                                                         String externalPropertiesFile) {

        boolean DiscountIsSetted = ((ConfigReader) Properties).checkDiscountConfig();

        if (!DiscountIsSetted) {
            setDiscountConfiguration(Properties, enumProperties, externalPropertiesFile);
        }

    }


    private static void checkPaymentConfiguration(ConfigReaderInterface Properties,
                                                         ConfigReaderInterface enumProperties,
                                                         String externalPropertiesFile) {

        boolean PaymentIsSetted = ((ConfigReader) Properties).checkPaymentConfig();

        if (!PaymentIsSetted) {
            setPaymentConfiguration(Properties, enumProperties, externalPropertiesFile);
        }

    }
    private static void checkPrefixCondimentsConfiguration(ConfigReaderInterface Properties,
                                                           ConfigReaderInterface enumProperties,
                                                           String externalPropertiesFile) {

        boolean prefixCondimentsAreSetted = ((ConfigReader) Properties).checkPrefixCondiments();

        if (!prefixCondimentsAreSetted) {
            SetPrefixCondiments.setPrefixCondiments(Properties, enumProperties, externalPropertiesFile);
        }

    }

    private static void setDiscountConfiguration(ConfigReaderInterface ConfigReader, ConfigReaderInterface enumConfigReader, String externalPropertiesFile) {

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        StoreDiscountsFromPosTask storeDiscountsFromPosTask = new StoreDiscountsFromPosTask(ConfigReader, enumConfigReader);
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Boolean> discountStored = executorService.submit(storeDiscountsFromPosTask);


        while (!discountStored.isDone()) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        /*Getting the string description, searching in the local database, saving the object number*/

        /* Discount, setted up during the Agent installation, in the POS Console*/
        String DiscountString = ConfigReader.getProperty(ApplicationProperty.DISCOUNT_STRING);
        MicrosAgentDiscount Discount = (MicrosAgentDiscount) MicrosLocalDiscountsManagement.getInstance().getDiscountByPosName(DiscountString);

        ConfigWriter.setProperty(ApplicationProperty.DISCOUNT_ID, String.valueOf(Discount.getObjectNumber()));

        try {
            ConfigWriter.writePropertiesToFile(externalPropertiesFile);
        } catch (IOException ex) {
        }

    }


    private static void setPaymentConfiguration(ConfigReaderInterface ConfigReader, ConfigReaderInterface enumConfigReader, String externalPropertiesFile) {

        StorePaymentTypesFromPosTask storePaymentTypesTask = new StorePaymentTypesFromPosTask(ConfigReader, enumConfigReader);
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Boolean> paymentsStored = executorService.submit(storePaymentTypesTask);

        while (!paymentsStored.isDone()) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        /*Getting the string description, searching in the local database, saving the object number*/

        /* Payment, setted up during the Agent installation, in the POS Console*/
        String PaymentString = ConfigReader.getProperty(ApplicationProperty.PAYMENT_STRING);
        MicrosAgentPayment Payment = (MicrosAgentPayment) MicrosLocalPaymentTypeManagement.getInstance().getPaymentTypeByPosName(PaymentString);
        ConfigWriter.setProperty(ApplicationProperty.PAYMENT_ID, String.valueOf(Payment.getObjectNumber()));

        try {
            ConfigWriter.writePropertiesToFile(externalPropertiesFile);
        } catch (IOException ex) {
        }

    }

    private synchronized void executeTasksForever(
            GetOpenOrdersTask getOpenOrdersTask,
            GetRemovedOrdersTask getRemovedOrdersTask,
            ExecutorService executorService,
            Client Client) {

        Future<HashMap<String, Object>> posOrders;
        Future<HashMap<String, Object>> deletedPosOrders;


        while (true) {


            /*Execute the Callable*/
            posOrders = executorService.submit(getOpenOrdersTask);
            deletedPosOrders = executorService.submit(getRemovedOrdersTask);

            while (!posOrders.isDone()) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

            SendPositiveDeltaTask.sendPositiveDelta(posOrders, Client);
            sendNegativeDelta(deletedPosOrders, Client);

        }

    }


    private void sendNegativeDelta(Future<HashMap<String, Object>> deletedPosOrders, Client Client) {

        HashMap<String, Object> deletedPosOrderHashMap = null;
        com.pos.connector.dto.AgentOrder tempPosOrder = null;
        AgentDataConverterInterface dataPortingMicros = new MicrosDataConverter();
        AgentLocalOpenOrdersManagementInterface dataManagementMicros = MicrosLocalOpenOrdersManagement.getInstance();

        try {
            deletedPosOrderHashMap = deletedPosOrders.get();

            if (deletedPosOrderHashMap != null) {
                for (Map.Entry<String, Object> entry : deletedPosOrderHashMap.entrySet()) {
                    tempPosOrder = dataPortingMicros.convert((MicrosAgentOrder) entry.getValue());

                    try {
                        Client.sendNegativeDeltaOrders(tempPosOrder.agentId());
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }


                    System.out.println("\n Sending negative delta Entry:  --> " + entry.getKey());
                    dataManagementMicros.removeSingleOrderLocal(entry.getValue());

                }

            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }


    private static void startRPCServer(ConfigReaderInterface properties) {
        //rabbitmq connection
        properties = (ConfigReader) properties;

        connection = ConnectionFactory.newOne(new com.rabbitmq.client.ConnectionFactory())
                .withHost(getHost(properties))
                .withUsername(getUsername(properties))
                .withPassword(getPassword(properties))
                .withPort(getPort(properties))
                .create();

        //create topology
        RPCAgentTopology.newOne(ChannelFactory.newOne(connection).create())
                .withApplicationName(getApplicationName(properties))
                .declare(getAgentId(properties));

        //start listening rpc
        RPCAgentServer.newOne(connection)
                .withApplicationName(getApplicationName(properties))
                .withServices(Arrays.asList(
                        new AddPaymentRemoteService()
                ))
                .start(getAgentId(properties));
    }

    private static String getAgentId(ConfigReaderInterface properties) {
        return ((ConfigReader) properties).getProperty(ApplicationProperty.AGENT_ID);
    }

    private static String getApplicationName(ConfigReaderInterface properties) {
        return ((ConfigReader) properties).getProperty(ApplicationProperty.MICROSERVICE_NAME);
    }


    private static Integer getPort(ConfigReaderInterface properties) {
        return Integer.valueOf(((ConfigReader) properties).getProperty(ApplicationProperty.RABBITMQ_SENDER_PORT));
    }

    private static String getPassword(ConfigReaderInterface properties) {
        return ((ConfigReader) properties).getProperty(ApplicationProperty.RABBITMQ_SENDER_PASSWORD);
    }

    private static String getUsername(ConfigReaderInterface properties) {
        return ((ConfigReader) properties).getProperty(ApplicationProperty.RABBITMQ_SENDER_USERNAME);
    }

    private static String getHost(ConfigReaderInterface properties) {
        return ((ConfigReader) properties).getProperty(ApplicationProperty.RABBITMQ_SENDER_HOST);
    }

    private static void runForever() throws InterruptedException {
        synchronized (object) {
            object.wait();
            return;
        }
    }

    public static void shutdown() {
        RPCAgentTopology.freeResources();
        RPCAgentServer.stop();
        ConnectionFactory.close(connection);
        object.notify();
    }

}

