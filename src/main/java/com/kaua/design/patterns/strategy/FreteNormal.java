package com.kaua.design.patterns.strategy;

class FreteNormal implements FreteStrategy {

    @Override
    public double calcular(double peso) {
        return peso * 5;
    }
}
