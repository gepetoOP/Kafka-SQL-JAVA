package com.example.repository;

import com.example.entity.PaymentRequestEntity;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface PaymentRequestRepository extends CrudRepository<PaymentRequestEntity, Long> {
}
