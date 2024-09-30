package com.kaua.design.patterns.abstractfactory;

class AdminUserFactory implements UserFactory {

    @Override
    public User createUser(String username) {
        return new AdminUser(username, createRole());
    }

    @Override
    public Role createRole() {
        return new AdminRole();
    }
}
