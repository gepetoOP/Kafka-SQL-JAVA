package com.example.controller;

import com.example.services.ProcessPaymentService;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import jakarta.inject.Singleton;
import lombok.RequiredArgsConstructor;


@Controller("/card")
@Singleton
@RequiredArgsConstructor
public class CardController {
    private final ProcessPaymentService processPaymentService;

    @Get
    @Produces(MediaType.TEXT_PLAIN)
    String index() {
        processPaymentService.process(null);

        return "Hello World";
    }
}
