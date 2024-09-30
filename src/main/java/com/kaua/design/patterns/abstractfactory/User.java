package com.kaua.design.patterns.abstractfactory;

import java.time.Instant;

abstract class User {

    protected String username;
    protected UserType userType;
    protected Role role; // cada usuário tem um papel
    protected Instant createdAt;

    public User(final String username, final UserType userType, final Role role) {
        this.username = username;
        this.userType = userType;
        this.role = role;
        this.createdAt = Instant.now();
    }

    public String getUsername() {
        return username;
    }

    public UserType getUserType() {
        return userType;
    }

    public Role getRole() {
        return role;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public abstract void displayInfo();
}
