package com.example.beans3;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemoryCustomerRepository implements CustomerRepository {
    private List<Customer> customers = new ArrayList<>();
    @Autowired
    private CustomerLogger customerLogger;

    @Override
    public void createCustomer(Customer customer) {
        customers.add(customer);
        customerLogger.log();
    }

    @Override
    public void delCustomer(Customer customer) {
        customers.remove(customer);
        customerLogger.log();
    }

    @Override
    public void findCustomers() {
        customers.forEach(c -> System.out.println(c));
        customerLogger.log();
    }
}
