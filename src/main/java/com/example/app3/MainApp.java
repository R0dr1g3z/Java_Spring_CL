package com.example.app3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.beans3.Customer;
import com.example.beans3.MemoryCustomerRepository;
import com.example.beans3.SimpleCustomerLogger;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        SimpleCustomerLogger simpleCustomerLogger = ctx.getBean(SimpleCustomerLogger.class);
        simpleCustomerLogger.log();
        MemoryCustomerRepository memoryCustomerRepository = ctx.getBean(MemoryCustomerRepository.class);
        memoryCustomerRepository.createCustomer(new Customer(0, "John", "Smith"));
        Customer customer = new Customer(1, "Cassy", "Uzi");
        memoryCustomerRepository.createCustomer(customer);
        memoryCustomerRepository.delCustomer(customer);
        memoryCustomerRepository.findCustomers();
        ctx.close();
    }
}
