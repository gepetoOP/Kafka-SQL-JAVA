package com.example.services;

import com.example.domain.PaymentRequest;
public interface ProcessPaymentService {
    void process(PaymentRequest paymentRequest);
}
