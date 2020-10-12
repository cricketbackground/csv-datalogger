package com.vp.messaging.config;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface CsvStreams {

    String CSV_MESSAGE_RECEIVER_CHANNEL = "susbcriptionorders";

    @Input(CSV_MESSAGE_RECEIVER_CHANNEL)
    SubscribableChannel inboundCsvMessage();

}
