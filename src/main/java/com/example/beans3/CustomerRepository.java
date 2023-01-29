package com.example.beans3;

public interface CustomerRepository {
        void createCustomer(Customer customer);
        void delCustomer(Customer customer);
        void findCustomers();
}
