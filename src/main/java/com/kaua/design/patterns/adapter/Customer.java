package com.kaua.design.patterns.adapter;

class Customer {

    private String name;
    private String lastName;
    private String email;
    private String document;

    public Customer(String name, String lastName, String email, String document) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getDocument() {
        return document;
    }
}
