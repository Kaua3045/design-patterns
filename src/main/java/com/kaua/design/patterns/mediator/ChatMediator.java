package com.kaua.design.patterns.mediator;

interface ChatMediator {

    void sendMessage(String msg, User user);
    void addUser(User user);
}
