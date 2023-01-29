package com.example.app3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.beans3.SimpleCustomerLogger;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        SimpleCustomerLogger simpleCustomerLogger = ctx.getBean(SimpleCustomerLogger.class);
        simpleCustomerLogger.log();
        ctx.close();
    }
}
