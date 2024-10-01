package com.kaua.design.patterns.strategy;

class CalculadoraFrete {

    private FreteStrategy strategy;

    public CalculadoraFrete(FreteStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(FreteStrategy strategy) {
        this.strategy = strategy;
    }

    public double calcularFrete(double peso) {
        return strategy.calcular(peso);
    }
}
