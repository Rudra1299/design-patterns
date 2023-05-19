package org.example.factory.impl;

import org.example.factory.ProgrammerCalculator;

public class ProgrammerCalculatorImpl extends CalculatorImpl implements ProgrammerCalculator {

    @Override
    public void start() {
        System.out.println("starting programmer calculator...");
    }
    @Override
    public int and(int num1, int num2) {
        return num1 & num2;
    }

    @Override
    public int or(int num1, int num2) {
        return num1 | num2;
    }

    @Override
    public int xor(int num1, int num2) {
        return num1 ^ num2;
    }

    @Override
    public int not(int num) {
        return ~num;
    }

    @Override
    public int leftShift(int num, int shift) {
        return num << shift;
    }

    @Override
    public int rightShift(int num, int shift) {
        return num >> shift;
    }
}
