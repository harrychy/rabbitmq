package com.example.demo.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdurcerwithExchange {
    public RabbitTemplate rabbitTemplate;

    @Autowired
    public ProdurcerwithExchange(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void produrce(){
        rabbitTemplate.convertAndSend("topic.exchange1","topic.1111","hello world");
    }


}
