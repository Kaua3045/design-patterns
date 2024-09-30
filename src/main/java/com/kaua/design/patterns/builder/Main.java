package com.kaua.design.patterns.builder;

public class Main {

    public static void main(String[] args) {
        User user = new User.UserBuilder(
                "John",
                "Doe",
                "john.doe@test.com",
                "1234565"
        ).build();

        System.out.println(user);

        User user2 = new User.UserBuilder(
                "Jane",
                "Doe",
                "john.doe@test.com",
                "1234565"
        )
                .phone("123456778")
                .address("123 Main St")
                .age(30)
                .build();

        System.out.println(user2);
    }
}
