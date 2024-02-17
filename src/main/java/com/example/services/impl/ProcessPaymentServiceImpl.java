package com.example.services.impl;

import com.example.domain.PaymentRequest;
import com.example.services.PaymentProcessor;
import com.example.services.ProcessPaymentService;
import jakarta.inject.Singleton;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Singleton
@RequiredArgsConstructor
public class ProcessPaymentServiceImpl implements ProcessPaymentService {
    private final List<PaymentProcessor> paymentProcessors;

    public void process(PaymentRequest paymentRequest) {
        paymentProcessors
                .stream()
                .filter(processor -> processor.mustProcess(paymentRequest.getPaymentType()))
                .findFirst()
                .ifPresent(processor -> processor.process(paymentRequest));
    }
}
