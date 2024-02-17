package com.example.services;

import com.example.domain.PaymentRequest;
import com.example.domain.PaymentType;

public interface PaymentProcessor {
    void process(PaymentRequest paymentRequest);

    boolean mustProcess(PaymentType paymentType);
}
