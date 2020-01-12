package com.connector.micros.task;

import com.connector.micros.config.reader.ConfigReader;
import com.connector.micros.config.LocalConnectionExcludeTest;
import com.connector.micros.config.reader.ConfigReaderInterface;
import com.connector.micros.config.reader.ConfigReader;
import com.connector.micros.task.callable.GetOpenOrdersTask;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@Category(LocalConnectionExcludeTest.class)
public class GetOpenOrdersTaskTest extends TestCase {

    @Test
    public void testgetOpenOrdersTaskRunning() {


        ConfigReader configReader = ConfigReader.getInstance(null);

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        GetOpenOrdersTask callable = new GetOpenOrdersTask(configReader);

        Setup:
        configReader = ConfigReader.getInstance(null);

        Future<List<com.pos.connector.dto.AgentOrder>> futurePosOrder = executorService.submit(callable);

        while (!futurePosOrder.isDone()) {
            System.out.println("Task is still not done...");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        try {
            List<com.pos.connector.dto.AgentOrder> posOrderList = futurePosOrder.get();

            assertEquals(4, posOrderList.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        // Future<PosOrder> posOrdersList = executor.submit(callable);
        try {
            //callable.call();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
