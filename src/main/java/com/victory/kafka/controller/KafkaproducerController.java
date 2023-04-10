package com.victory.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.victory.kafka.model.ProducerVo;
import com.victory.kafka.service.KafkaProducerService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class KafkaproducerController {

	@Autowired
	KafkaProducerService kafkaProducerService;

	@PostMapping("/messageSend")
	public String sendMessage(@RequestBody ProducerVo producerVo) {

		log.info("ProducerVo : " + producerVo);
		kafkaProducerService.sendMessage(producerVo.getTopic(), producerVo.getMessage());

		return "Send message";
	}

}
