package org.example.factory;

public interface ScientificCalculator extends Calculator {

    double sqrt(double num);
    double sin(double num);

    double cos(double num);

    double pow(double num, double exponent);
}
