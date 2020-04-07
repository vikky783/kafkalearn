package com.example.kafkalearn.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.kafkalearn.kafka.tuturial.KafkaConsumer;

@SpringBootApplication
public class KafkaApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(KafkaApplication.class, args);
		KafkaConsumer kc = context.getBean(KafkaConsumer.class);
		kc.name();
	}

}
