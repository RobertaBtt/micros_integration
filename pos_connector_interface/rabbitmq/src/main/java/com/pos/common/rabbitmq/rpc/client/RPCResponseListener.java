package com.pos.common.rabbitmq.rpc.client;

import com.pos.common.rabbitmq.ChannelFactory;
import com.pos.common.rabbitmq.consumer.ConsumerFactory;
import com.pos.common.rabbitmq.message.Message;
import com.pos.common.rabbitmq.rpc.RPCTopologyNaming;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

public class RPCResponseListener {

    private final static Logger logger = LoggerFactory.getLogger(RPCResponseListener.class);

    private static final ConcurrentHashMap<String, String> agents = new ConcurrentHashMap();
    private static final ConcurrentHashMap<String, Disposable> listeners = new ConcurrentHashMap();

    public static void startListening(Connection connection, String replyQueueName) {

        String previous = agents.putIfAbsent(replyQueueName, replyQueueName);

        /**
         * For applications that use multiple threads/processes for processing, it is very common to open a new channel per thread/process
         * and not share channels between them.
         */
        if (previous == null) {

            final Channel channel = ChannelFactory.newOne(connection).create();

            Disposable disposable = ConsumerFactory.newOne(channel, replyQueueName)
                    .toObservable()
                    .doOnNext(RPCResponses::queue)
                    .onErrorResumeNext(logAndSilent(replyQueueName))
                    .subscribeOn(Schedulers.computation())
                    .subscribe();

            listeners.put(replyQueueName, disposable);
        }
    }

    public static void stopListening() {
        String previous = agents.putIfAbsent("stopping_listeners", "stopping_listeners");

        if (previous == null) {

            List<Disposable> replyQueueName = Collections.list(listeners.elements());
            replyQueueName.forEach(Disposable::dispose);
            listeners.clear();
            agents.clear();
        }

    }

    public static void stopUnusedListeners(List<String> activeReplies, String applicationName) {

        List<String> replyQueueName = Collections.list(agents.elements());

        replyQueueName.stream()
                .filter(it -> activeReplies.stream()
                        .noneMatch(queueName -> it.equals(RPCTopologyNaming.responseQueueName(applicationName, queueName))))
                .forEach(it -> {
                    listeners.get(it).dispose();
                    listeners.remove(it);
                    agents.remove(it);
                });
    }

    private static io.reactivex.functions.Function<Throwable, Observable<Message>> logAndSilent(String replyQueueName) {
        return error -> {
            logger.error("Error queueing Rabbit RPC result message received from {}", replyQueueName, error);
            return Observable.empty();
        };
    }
}
