package com.kaua.design.patterns.chainofresponsibility;

class PaymentHandler extends AbstractHandler {

    @Override
    public void handleRequest(Order order) {
        if (!order.isPaid()) {
            System.out.println("Processando pagamento...");
            order.setPaid(true);
        }
        super.handleRequest(order);
    }
}
