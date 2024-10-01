package com.kaua.design.patterns.mediator;

class ChatClient {

    public static void main(String[] args) {
        ChatMediator mediator = new ChatRoom();

        User user1 = new ConcreteUser(mediator, "Kaua");
        User user2 = new ConcreteUser(mediator, "Larissa");
        User user3 = new ConcreteUser(mediator, "Luna");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        user1.send("Hi All");
        user2.send("Hello Kaua");
    }
}
