package com.kaua.design.patterns.abstractfactory;

final class UserAbstractFactory {

    private UserAbstractFactory() {}

    public static User createUser(final String username, final UserType userType) {
        return switch (userType) {
            case ADMIN -> new AdminUserFactory().createUser(username);
            case GUEST -> new GuestUserFactory().createUser(username);
        };
    }
}
