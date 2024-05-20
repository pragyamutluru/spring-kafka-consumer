package com.example.springkafkaconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {
    @Autowired
    private KafkaProducer kafkaProducer;

    @GetMapping("/produce")
    public void produce() {
        kafkaProducer.sendMessage("Hello world");
    }
}
