package com.example.beans3;

public class Customer {
    private int id;
    private String firstnName, lastName;

    public Customer(int id, String firstnName, String lastName) {
        this.id = id;
        this.firstnName = firstnName;
        this.lastName = lastName;
    }

    public Customer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstnName() {
        return firstnName;
    }

    public void setFirstnName(String firstnName) {
        this.firstnName = firstnName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
