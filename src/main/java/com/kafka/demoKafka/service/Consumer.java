package com.kafka.demoKafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "codeDecode_Topic", groupId = "codeDecode_Group")
    public void listenToTopic(String recievedMsg) {
        System.out.println("the msg recieved is " + recievedMsg);
    }
}
