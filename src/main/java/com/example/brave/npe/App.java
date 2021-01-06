package com.example.brave.npe;

import brave.propagation.Propagation;
import brave.propagation.aws.AWSPropagation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App {
    @Bean
    Propagation.Factory awsPropagation() {
        return AWSPropagation.FACTORY;
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
