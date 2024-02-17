package com.example.services.impl;

import com.example.domain.PaymentRequest;
import com.example.domain.PaymentType;
import com.example.mapper.PaymentRequestMapper;
import com.example.messaging.PaymentRequestsEmitter;
import com.example.repository.PaymentRequestRepository;
import com.example.services.PaymentProcessor;
import jakarta.inject.Singleton;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Singleton
@RequiredArgsConstructor
public class CreditPaymentProcessor implements PaymentProcessor {
    private final PaymentRequestRepository repository;
    private final PaymentRequestMapper paymentRequestMapper;
    private final PaymentRequestsEmitter paymentRequestsEmitter;

    @Override
    @Transactional
    public void process(PaymentRequest paymentRequest) {
        var entity = paymentRequestMapper.toEntity(paymentRequest);

        repository.save(entity);
        paymentRequestsEmitter.emitPaymentRequest(null, paymentRequest);
    }

    @Override
    public boolean mustProcess(PaymentType paymentType) {
        return PaymentType.CREDIT_CARD.equals(paymentType);
    }
}
