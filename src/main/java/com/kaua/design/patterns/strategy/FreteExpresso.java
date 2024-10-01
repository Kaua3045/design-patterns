package com.kaua.design.patterns.strategy;

class FreteExpresso implements FreteStrategy {

    @Override
    public double calcular(double peso) {
        return peso * 10;
    }
}
