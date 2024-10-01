package com.kaua.design.patterns.chainofresponsibility;

class ShippingHandler extends AbstractHandler {

    @Override
    public void handleRequest(Order order) {
        if (order.isPacked() && !order.isShipped()) {
            System.out.println("Enviando o pedido...");
            order.setShipped(true);
        }
        super.handleRequest(order);
    }
}
