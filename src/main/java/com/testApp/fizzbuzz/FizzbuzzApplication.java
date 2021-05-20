package com.testApp.fizzbuzz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})

public class FizzbuzzApplication {

    public static void main(String[] args) {
        SpringApplication.run(FizzbuzzApplication.class, args);

    }
}
