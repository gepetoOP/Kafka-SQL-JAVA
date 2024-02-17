package com.example;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.info.*;
import org.h2.tools.Server;

import java.sql.SQLException;

@OpenAPIDefinition(
    info = @Info(
            title = "demo",
            version = "0.0"
    )
)
public class Application {

    public static void main(String[] args) throws SQLException {
        Server.createWebServer().start();
        Micronaut.run(Application.class, args);
    }
}