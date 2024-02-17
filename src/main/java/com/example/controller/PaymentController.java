package com.example.controller;

import com.example.services.ProcessPaymentService;
import com.example.domain.PaymentRequest;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Produces;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller("/payments")
@RequiredArgsConstructor
public class PaymentController {
    private final ProcessPaymentService processPaymentService;

    @Post
    @Produces(MediaType.APPLICATION_JSON)
    String postPaymentRequest(@Body PaymentRequest paymentRequest) {
        log.info("Request recebida: {}", paymentRequest);

        processPaymentService.process(paymentRequest);

        return "Hello World";
    }
}
