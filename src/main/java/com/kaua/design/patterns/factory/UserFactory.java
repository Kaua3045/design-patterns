package com.kaua.design.patterns.factory;

final class UserFactory {

    private UserFactory() {}

    public static User createUser(final String username, final String role) {
        return switch (role.toUpperCase()) {
            case AdminUser.ROLE -> new AdminUser(username);
            case GuestUser.ROLE -> new GuestUser(username);
            default -> throw new IllegalArgumentException("Invalid role " + role);
        };
    }
}
