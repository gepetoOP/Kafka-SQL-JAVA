package com.example.mapper;

import com.example.domain.PaymentRequest;
import com.example.entity.PaymentRequestEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "jsr330")
public interface PaymentRequestMapper {
    PaymentRequestEntity toEntity(PaymentRequest paymentRequest);
}
