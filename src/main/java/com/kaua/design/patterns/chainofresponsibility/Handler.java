package com.kaua.design.patterns.chainofresponsibility;

interface Handler {

    void setNextHandler(Handler nextHandler);
    void handleRequest(Order order);
}
