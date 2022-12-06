package com.example.demo.consumer;

import com.example.demo.models.User;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Consumer {


    @RabbitHandler
    @RabbitListener(queuesToDeclare = @Queue("rabbitmq_queue"))
    public void process(String message) {
        System.out.println("消费者消费消息111=====" + message);
    }

    @RabbitHandler
    @RabbitListener(queuesToDeclare = @Queue("hello"))
    public void process_old(String message) {
        System.out.println("消费者消费消息222=====" + message);
    }

    @RabbitHandler
    @RabbitListener(queuesToDeclare = @Queue("object"))
    public void process_object(User user) {
        System.out.println("User Object ~~~~~ " + user.name + ":" +user.password);
    }


}