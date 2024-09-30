package com.kaua.design.patterns.factory;

import java.time.Instant;

abstract class User {

    protected String username;
    protected String role;
    protected Instant createdAt;
    // other fields

    public User(final String username, final String role) {
        this.username = username;
        this.role = role;
        this.createdAt = Instant.now();
    }

    public String getUsername() {
        return username;
    }

    public String getRole() {
        return role;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public abstract void showRole(); // Each subclass will implement this method to show the role of the user

    public abstract boolean authorized(); // Each subclass will implement this method to show the user is authorized or not
}
