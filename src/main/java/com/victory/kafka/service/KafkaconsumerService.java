package com.victory.kafka.service;

import java.io.IOException;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class KafkaconsumerService {
	//Kafka consumer 설정 topics,consumer Group
    @KafkaListener(topics = "test", groupId ="group1")

    public void consume(String message) throws IOException {
        log.info(String.format("Consumed message : %s", message));
    }

}

