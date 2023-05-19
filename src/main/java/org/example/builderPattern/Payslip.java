package org.example.builderPattern;

public class Payslip {
    private final String employeeName;
    private final String employeeId;

    private final double basicSalary;
    private final double hra;
    private final double da;

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double getHra() {
        return hra;
    }

    public double getDa() {
        return da;
    }

    @Override
    public String toString() {
        return "Payslip{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", basicSalary=" + basicSalary +
                ", hra=" + hra +
                ", da=" + da +
                ", tax=" + tax +
                '}';
    }

    public double getTax() {
        return tax;
    }

    private final double tax;

    private Payslip(Builder builder) {
        this.employeeName = builder.employeeName;
        this.employeeId = builder.employeeId;
        this.hra = builder.hra;
        this.basicSalary = builder.basicSalary;
        this.da = builder.da;
        this.tax = builder.tax;
    }

    public static class Builder {
        private String employeeName;
        private String employeeId;

        private double basicSalary;
        private double hra;
        private  double da;

        private double tax;

        public Builder(String employeeName, String employeeId) {
            this.employeeName = employeeName;
            this.employeeId = employeeId;
        }

        public Builder withBasicSalary(double basicSalary) {
            this.basicSalary = basicSalary;
            return this;
        }

        public Builder withDa(double da) {
            this.da = da;
            return this;
        }

        public Builder withHra(double hra) {
            this.hra = hra;
            return this;
        }

        public Builder withTax(double tax) {
            this.tax = tax;
            return this;
        }

        public Payslip build() {
            return new Payslip(this);
        }
    }

}
