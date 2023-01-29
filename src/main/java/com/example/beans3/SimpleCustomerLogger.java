package com.example.beans3;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

@Component
public class SimpleCustomerLogger implements CustomerLogger {

    @Override
    public void log() {
        System.out.println(LocalDateTime.now() + ": Customer Operation");
    }
}
