package com.example.mapper;

import com.example.domain.Origin;
import com.example.domain.PaymentRequest;
import com.example.entity.OriginEntity;
import com.example.entity.PaymentRequestEntity;
import jakarta.inject.Named;
import jakarta.inject.Singleton;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-07T21:13:05-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Singleton
@Named
public class PaymentRequestMapperImpl implements PaymentRequestMapper {

    @Override
    public PaymentRequestEntity toEntity(PaymentRequest paymentRequest) {
        if ( paymentRequest == null ) {
            return null;
        }

        PaymentRequestEntity.PaymentRequestEntityBuilder paymentRequestEntity = PaymentRequestEntity.builder();

        paymentRequestEntity.amount( paymentRequest.getAmount() );
        if ( paymentRequest.getPaymentType() != null ) {
            paymentRequestEntity.paymentType( paymentRequest.getPaymentType().name() );
        }
        paymentRequestEntity.requestDate( paymentRequest.getRequestDate() );
        paymentRequestEntity.origin( originToOriginEntity( paymentRequest.getOrigin() ) );

        return paymentRequestEntity.build();
    }

    protected OriginEntity originToOriginEntity(Origin origin) {
        if ( origin == null ) {
            return null;
        }

        OriginEntity.OriginEntityBuilder originEntity = OriginEntity.builder();

        originEntity.name( origin.getName() );
        originEntity.cpf( origin.getCpf() );

        return originEntity.build();
    }
}
