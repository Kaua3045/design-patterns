package com.kaua.design.patterns.chainofresponsibility;

abstract class AbstractHandler implements Handler {

    protected Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Order order) {
        if (nextHandler != null) {
            nextHandler.handleRequest(order);
        }
    }
}
