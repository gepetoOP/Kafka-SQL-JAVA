package com.example.messaging;

import com.example.domain.PaymentRequest;
import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;

@KafkaClient
public interface PaymentRequestsEmitter {
    @Topic("payment_requests")
    void emitPaymentRequest(@KafkaKey String brand, PaymentRequest paymentRequest);
}