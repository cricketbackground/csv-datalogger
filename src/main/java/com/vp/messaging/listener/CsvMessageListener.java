package com.vp.messaging.listener;

import com.vp.messaging.config.CsvStreams;
import com.vp.messaging.models.SubscriptionOrderMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class CsvMessageListener {

    @StreamListener(CsvStreams.CSV_MESSAGE_RECEIVER_CHANNEL)
    public void handleCsvMessage(@Payload SubscriptionOrderMessage subscriptionOrderMessage) {
        log.info("Listener ->>>>>> received message {}", subscriptionOrderMessage);
    }

}
