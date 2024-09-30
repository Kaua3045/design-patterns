package com.kaua.design.patterns.abstractfactory;

class GuestUser extends User {

    public GuestUser(String username, Role role) {
        super(username, UserType.GUEST, role);
    }

    @Override
    public void displayInfo() {
        System.out.println("Guest User: " + this.username + " - " + this.role + " - " + this.createdAt);
    }
}
