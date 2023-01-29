package com.example.app3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.beans3.DbCustomerLogger;
import com.example.beans3.DbCustomerRepository;

@Configuration
public class AppConfig2 {
    @Bean
    public DbCustomerRepository dbCustomerRepository() {
        return new DbCustomerRepository();
    }

    @Bean
    public DbCustomerLogger dbCustomerLogger() {
        return new DbCustomerLogger();
    }
}
