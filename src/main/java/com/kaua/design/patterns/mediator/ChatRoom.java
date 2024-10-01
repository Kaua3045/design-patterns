package com.kaua.design.patterns.mediator;

import java.util.ArrayList;
import java.util.List;

class ChatRoom implements ChatMediator {

    private final List<User> users;

    public ChatRoom() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String msg, User user) {
        for (User u : this.users) {
            if (u != user) {
                u.receive(msg);
            }
        }
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }
}
