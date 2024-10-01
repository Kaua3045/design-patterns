package com.kaua.design.patterns.observer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product {

    private List<Observer> observers;
    private String name;
    private float price;

    public Product(String name, float price) {
        this.name = name;
        this.price = price;
        this.observers = new ArrayList<>();
    }

    public List<Observer> getObservers() {
        return Collections.unmodifiableList(observers);
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
        notifyObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
