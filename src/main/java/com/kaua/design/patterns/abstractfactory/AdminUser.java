package com.kaua.design.patterns.abstractfactory;

class AdminUser extends User {

    public AdminUser(String username, Role role) {
        super(username, UserType.ADMIN, role);
    }

    @Override
    public void displayInfo() {
        System.out.println("Admin User: " + this.username + " - " + this.role + " - " + this.createdAt);
    }
}
