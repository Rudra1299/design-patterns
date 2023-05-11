package org.example.factory;

import org.example.factory.impl.CalculatorFactory;

import java.util.concurrent.Callable;

public class App {
    public static void main(String[] args){
        try {
            Calculator calculator = CalculatorFactory.createCalculator("BASIC");
            calculator.start();
            double sum = calculator.add(1, 2);
            System.out.println("sum = " + sum);

            //can use the default methods even if we pass the type "SCIENTIFIC" ot "PROGRAMMER" and then coerce
            ScientificCalculator calculator2 = (ScientificCalculator) CalculatorFactory.
                    createCalculator("SCIENTIFIC");
            calculator2.start();

            //to avoid coercing we can use the specific methods
            ScientificCalculator scientificCalculator = CalculatorFactory.createScientificCalculator();
            double cosVal = scientificCalculator.cos(90);
            System.out.println("cos(90) = " + cosVal);

            ProgrammerCalculator programmerCalculator = CalculatorFactory.createProgrammerCalculator();
            programmerCalculator.start();
            int orNum = programmerCalculator.or(10, 20);
            System.out.println("or(10, 20) = " + orNum);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
