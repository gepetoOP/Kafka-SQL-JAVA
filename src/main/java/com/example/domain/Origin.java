package com.example.domain;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;
import lombok.Data;

@Data
@Serdeable
@Introspected
public class Origin {
    private String name;
    private String cpf;
}
