package com.example.demo;


import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class RabbitConfig {

    @Bean
    public Queue topicqueue1(){
        return new Queue("topic.queue1");
    }

    @Bean
    public Queue topicqueue2(){
        return new Queue("topic.queue2");
    }


    @Bean
    public Exchange topicexchange1(){
        return new TopicExchange("topic.exchange1");
    }

    @Bean
    public Binding topicbinding1(){
        return new Binding("topic.queue1",
                Binding.DestinationType.QUEUE,
                "topic.exchange1",
                "topic.*",
                null);
    }

    @Bean
    public Binding topicbinding2(){
        return new Binding("topic.queue2",
                Binding.DestinationType.QUEUE,
                "topic.exchange1",
                "topic.#",
                null);
    }


}
