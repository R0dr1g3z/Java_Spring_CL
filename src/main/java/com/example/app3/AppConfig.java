package com.example.app3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.beans3.DbCustomerLogger;
import com.example.beans3.FileCustomerLogger;
import com.example.beans3.MemoryCustomerRepository;
import com.example.beans3.SimpleCustomerLogger;

@Configuration
public class AppConfig {
    @Bean
    public SimpleCustomerLogger simpleCustomerLogger() {
        return new SimpleCustomerLogger();
    }

    @Bean
    public MemoryCustomerRepository memoryCustomerRepository() {
        return new MemoryCustomerRepository();
    }

    @Bean
    public FileCustomerLogger fileCustomerLogger() {
        return new FileCustomerLogger();
    }
    @Bean
    @Primary
    public DbCustomerLogger dbCustomerLogger(){
        return new DbCustomerLogger();
    }
}
