package org.example.factory.impl;

import org.example.factory.Calculator;
import org.example.factory.ProgrammerCalculator;
import org.example.factory.ScientificCalculator;

public class CalculatorFactory {

    public static Calculator createCalculator(String type) throws IllegalAccessException{
        switch (type) {
            case "BASIC" -> {
                return new CalculatorImpl();
            }
            case "SCIENTIFIC" -> {
                return new ScientificCalculatorImpl();
            }
            case "PROGRAMMER" -> {
                return new ProgrammerCalculatorImpl();
            }
            default -> throw new IllegalAccessException("Not a valid type.");
        }
    }

    //specific scientific calculator
    public static ScientificCalculator createScientificCalculator() {
        return (ScientificCalculator) new ScientificCalculatorImpl();
    }

    //specific programmer calculator
    public static ProgrammerCalculator createProgrammerCalculator() {
        return (ProgrammerCalculator) new ProgrammerCalculatorImpl();
    }

}
