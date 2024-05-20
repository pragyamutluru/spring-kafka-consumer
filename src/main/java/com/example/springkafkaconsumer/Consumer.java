package com.example.springkafkaconsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    @KafkaListener(topics = "${spring.kafka.consumer.topic}", groupId = "${spring.kafka.consumer.groupId}")
    public void listenWithHeaders(String message) {
        System.out.println("Received Message: " + message);
    }
}
