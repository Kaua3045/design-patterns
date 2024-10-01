package com.kaua.design.patterns.chainofresponsibility;

class PackingHandler extends AbstractHandler {

    @Override
    public void handleRequest(Order order) {
        if (order.isPaid() && !order.isPacked()) {
            System.out.println("Empacotando o pedido...");
            order.setPacked(true);
        }
        super.handleRequest(order);
    }
}
