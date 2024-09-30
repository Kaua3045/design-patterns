package com.kaua.design.patterns.factory;

class GuestUser extends User {

    public static final String ROLE = "GUEST";

    public GuestUser(final String username) {
        super(username, ROLE);
    }

    @Override
    public void showRole() {
        System.out.println("The role of the user " + username + " is " + role);
    }

    @Override
    public boolean authorized() {
        return false;
    }
}
