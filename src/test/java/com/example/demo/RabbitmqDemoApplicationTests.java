package com.example.demo;

import com.example.demo.producer.Producer;
import com.example.demo.producer.ProdurcerwithExchange;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RabbitmqDemoApplicationTests {

	@Autowired
	Producer producer;

	@Autowired
	ProdurcerwithExchange produrcerwithExchange;

	@Test
	void contextLoads() {
		producer.produce();
		producer.produce_old();
	}

	@Test
	void objectconsumer(){
		producer.produce_user();
	}

	@Test
	void withExchange(){
		produrcerwithExchange.produrce();
	}



}
