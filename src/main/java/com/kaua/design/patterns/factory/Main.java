package com.kaua.design.patterns.factory;

class Main {

    public static void main(String[] args) {
        User admin = UserFactory.createUser("KauaAdmin", "admin");
        User guest = UserFactory.createUser("KauaGuest", "guest");

        admin.showRole();
        System.out.println("Is authorized? " + admin.authorized());

        System.out.println("===================================");

        guest.showRole();
        System.out.println("Is authorized? " + guest.authorized());

        System.out.println("===================================");

        try {
            User unknown = UserFactory.createUser("Unknown", "unknown");
            unknown.showRole();
            System.out.println("Is authorized? " + unknown.authorized());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
