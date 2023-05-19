package org.example.factory;

public interface ProgrammerCalculator extends Calculator {

    int and(int num1, int num2);
    int or(int num1, int num2);
    int xor(int num1, int num2);
    int not(int num);
    int leftShift(int num, int shift);
    int rightShift(int num, int shift);
}
