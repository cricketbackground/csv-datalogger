package com.vp.messaging.consumers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vp.messaging.config.KafkaConsumerConfig;
import com.vp.messaging.models.Employee;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Slf4j
@Component
@RequiredArgsConstructor
public class EmployeeLoggingConsumer {

    public static final String TOPIC = "test";

    private final ObjectMapper objectMapper;

    @KafkaListener(topics = TOPIC, groupId = KafkaConsumerConfig.CONSUMER_GROUP_ID)
    public void listen(String message) {
        try {
            Employee lineMessage = objectMapper.readValue(message, Employee.class);
            log.info(lineMessage.toString());
        } catch (IOException e) {
            log.error("Error while deserializing message: " + message, e);
        }
    }

}
