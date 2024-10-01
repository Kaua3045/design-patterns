package com.kaua.design.patterns.observer;

class Main {

    public static void main(String[] args) {
        Product product = new Product("Laptop", 1000.10f);

        Customer customer1 = new Customer("Alice", product);
        Customer customer2 = new Customer("Bob", product);

        product.attach(customer1);
        product.attach(customer2);

        product.setPrice(900.00f);
    }
}
