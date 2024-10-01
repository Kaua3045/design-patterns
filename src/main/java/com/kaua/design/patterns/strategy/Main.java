package com.kaua.design.patterns.strategy;

class Main {

    public static void main(String[] args) {
        CalculadoraFrete calculadoraFrete = new CalculadoraFrete(new FreteNormal());
        System.out.println("Frete normal: " + calculadoraFrete.calcularFrete(10));

        calculadoraFrete.setStrategy(new FreteExpresso());
        System.out.println("Frete expresso: " + calculadoraFrete.calcularFrete(10));
    }
}
