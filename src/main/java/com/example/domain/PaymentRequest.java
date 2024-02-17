package com.example.domain;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Introspected
@Data
@Serdeable
public class PaymentRequest {
    private Origin origin;
    private PaymentType paymentType;
    private BigDecimal amount;
    private LocalDateTime requestDate = LocalDateTime.now();
}
