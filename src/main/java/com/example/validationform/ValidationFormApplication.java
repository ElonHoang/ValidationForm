package com.example.validationform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ValidationFormApplication {

    public static void main(String[] args) {
        SpringApplication.run(ValidationFormApplication.class, args);
    }

}
