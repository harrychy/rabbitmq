package com.example.demo.consumer;

import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerwithExchange {

    @RabbitHandler
    @RabbitListener(queuesToDeclare = @Queue("topic.queue1"))
    public void process_old1(String message) {
        System.out.println("消费者消费消息333=====" + message);
    }

    @RabbitHandler
    @RabbitListener(queuesToDeclare = @Queue("topic.queue2"))
    public void process_old2(String message) {
        System.out.println("消费者消费消息444=====" + message);
    }
}
