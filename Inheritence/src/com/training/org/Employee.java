package com.training.org;

public class Employee {
    private int empId;
    private String empName;
    private double salary;

    public Employee() {
        System.out.println("Default constructor of Employee is called");
        empId = 0;
        empName = "";
        salary = 0;
    }

    public Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
