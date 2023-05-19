package org.example.factory.impl;

import org.example.factory.ScientificCalculator;

public class ScientificCalculatorImpl extends CalculatorImpl implements ScientificCalculator {

    @Override
    public void start() {
        System.out.println("starting scientific calculator...");
    }

    @Override
    public double sqrt(double num) {
        return Math.sqrt(num);
    }

    @Override
    public double sin(double num) {
        return Math.sin(num);
    }

    @Override
    public double cos(double num) {
        return Math.cos(num);
    }

    @Override
    public double pow(double num, double exponent) {
        return Math.pow(num, exponent);
    }

    public static class CalculatorFactory {
    }
}
