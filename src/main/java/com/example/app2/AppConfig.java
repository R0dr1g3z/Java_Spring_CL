package com.example.app2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.beans2.HelloWorld;

@Configuration
public class AppConfig {
    @Bean
    public HelloWorld helloWorld() {
        return new HelloWorld();
    }
}
