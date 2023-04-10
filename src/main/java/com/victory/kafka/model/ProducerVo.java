package com.victory.kafka.model;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.databind.jsonschema.JsonSerializableSchema;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class ProducerVo {

	@NotNull
	@Schema(name = "topic", description = "kafk topic")
	String topic;

	@Schema(name = "message", description = "kafk message")
	@NotNull
	String message;
}
