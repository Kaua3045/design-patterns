package com.kaua.design.patterns.factory;

class AdminUser extends User {

    public static final String ROLE = "ADMIN";

    public AdminUser(final String username) {
        super(username, ROLE);
    }

    @Override
    public void showRole() {
        System.out.println("The role of the user " + username + " is " + role);
    }

    @Override
    public boolean authorized() {
        return true;
    }
}
