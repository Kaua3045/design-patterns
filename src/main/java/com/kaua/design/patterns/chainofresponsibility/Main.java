package com.kaua.design.patterns.chainofresponsibility;

class Main {

    public static void main(String[] args) {
        Handler paymentHandler = new PaymentHandler();
        Handler packingHandler = new PackingHandler();
        Handler shippingHandler = new ShippingHandler();

        paymentHandler.setNextHandler(packingHandler);
        packingHandler.setNextHandler(shippingHandler);

        Order order = new Order();

        paymentHandler.handleRequest(order);

        System.out.println("Pedido pago " + order.isPaid());
        System.out.println("Pedido embalado " + order.isPacked());
        System.out.println("Pedido enviado " + order.isShipped());
    }
}
