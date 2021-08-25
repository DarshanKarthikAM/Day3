package com.training.org;

public class SalesEmployee extends Employee {
    private int sales;
    private double commission;
    private double netSalary;

    public SalesEmployee(int empId, String empName, double salary, int sales) {
        super(empId, empName, salary);
        System.out.println("Parameterised constructor of Employee is called");
        this.sales = sales;
        this.commission = 0;
        this.netSalary = 0;
    }
}
