package org.example.builderPattern;

public class App {
    public static void main(String[] args) {
        Payslip payslip = new Payslip.Builder("EMP001", "John Doe")
                .withBasicSalary(500000.0)
                .withHra(150000.0)
                .withDa(10000.0)
                .withTax(1000.0)
                .build();

        System.out.println(payslip.toString());
    }
}
