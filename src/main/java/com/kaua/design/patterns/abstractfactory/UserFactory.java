package com.kaua.design.patterns.abstractfactory;

interface UserFactory {

    User createUser(String username);
    Role createRole();
}
