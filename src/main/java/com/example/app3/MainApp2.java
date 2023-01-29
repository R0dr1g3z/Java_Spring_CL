package com.example.app3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.beans3.Customer;
import com.example.beans3.DbCustomerRepository;

public class MainApp2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig2.class);
        DbCustomerRepository dbCustomerRepository = ctx.getBean(DbCustomerRepository.class);
        dbCustomerRepository.createCustomer(new Customer("Mike", "Lingo"));
        dbCustomerRepository.findCustomers();
        ctx.close();
    }
}
