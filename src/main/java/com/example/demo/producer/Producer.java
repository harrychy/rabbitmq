package com.example.demo.producer;

import com.example.demo.models.Address;
import com.example.demo.models.User;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Component
public class Producer {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void produce() {
        String message = new Date() + "Beijing";
        System.out.println("生产者产生消息=====" + message);
        rabbitTemplate.convertAndSend("rabbitmq_queue", message);
    }

    public void produce_old() {
        String message = new Date() + "Beijing";
        System.out.println("生产者产生消息old=====" + message);
        rabbitTemplate.convertAndSend("hello", message);
    }

    public void produce_user() {
        User user = new User();
        Address address = new Address();
        address.setCity("xian");
        address.setCountry("China");
        user.setName("Harry");
        user.setPassword("123");
        List<Address> addressList = new ArrayList<>();
        addressList.add(address);
        user.setAddressList(addressList);

        String message = new Date() + "Beijing";
        System.out.println("User info producer=====" + user);
        rabbitTemplate.convertAndSend("object", user);

    }

}
