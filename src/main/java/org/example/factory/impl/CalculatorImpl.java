package org.example.factory.impl;

import org.example.factory.Calculator;

public class CalculatorImpl implements Calculator {
    @Override
    public void start() {
        System.out.println("Starting basic Calculator");
    }

    @Override
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    @Override
    public double divide(double num1, double num2) throws ArithmeticException {
        if(num2 == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return num1 / num2;
    }
}
