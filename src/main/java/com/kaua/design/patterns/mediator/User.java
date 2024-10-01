package com.kaua.design.patterns.mediator;

abstract class User {

    protected ChatMediator mediator;
    protected String name;

    public User(ChatMediator mediator, String name){
        this.mediator = mediator;
        this.name = name;
    }

    public ChatMediator getMediator() {
        return mediator;
    }

    public String getName() {
        return name;
    }

    public abstract void send(String msg);
    public abstract void receive(String msg);
}
