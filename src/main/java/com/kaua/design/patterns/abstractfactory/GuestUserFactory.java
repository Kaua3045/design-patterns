package com.kaua.design.patterns.abstractfactory;

class GuestUserFactory implements UserFactory {

    @Override
    public User createUser(String username) {
        return new GuestUser(username, createRole());
    }

    @Override
    public Role createRole() {
        return new GuestRole();
    }
}
