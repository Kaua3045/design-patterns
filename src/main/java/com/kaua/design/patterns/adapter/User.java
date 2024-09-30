package com.kaua.design.patterns.adapter;

class User {

    private String name;
    private String lastName;
    private String email;
    private String cpfCnpj;

    public User(String name, String lastName, String email, String cpfCnpj) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.cpfCnpj = cpfCnpj;
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

    public String getCpfCnpj() {
        return cpfCnpj;
    }
}
