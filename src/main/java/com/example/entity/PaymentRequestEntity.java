package com.example.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

import static jakarta.persistence.GenerationType.IDENTITY;

@Data
@Entity
@Builder
@Serdeable
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "payment_request")
public class PaymentRequestEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(name = "amount", nullable = false)
    private BigDecimal amount;

    @Column(name = "payment_type", nullable = false)
    private String paymentType;

    @Column(name = "last_updated_time", nullable = false)
    @CreationTimestamp
    private Timestamp lastUpdatedTime;

    @Column(name = "request_date", nullable = false)
    private LocalDateTime requestDate;

    @Embedded
    private OriginEntity origin;
}