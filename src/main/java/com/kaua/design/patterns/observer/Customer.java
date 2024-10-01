package com.kaua.design.patterns.observer;

class Customer implements Observer {

    private String name;
    private Product product;

    public Customer(String name, Product product) {
        this.name = name;
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public void update() {
        System.out.println("Notified " + name + " of " + product.getName() + "'s change to " + product.getPrice());
    }
}
