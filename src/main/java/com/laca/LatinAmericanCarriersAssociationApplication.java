package com.laca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"domain"} )
public class LatinAmericanCarriersAssociationApplication {
    public static void main(String[] args) {
        SpringApplication.run(LatinAmericanCarriersAssociationApplication.class, args);
    }
}

