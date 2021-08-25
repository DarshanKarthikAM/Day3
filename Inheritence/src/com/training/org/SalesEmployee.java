//package com.training.org;
//
//public class SalesEmployee extends Employee {
//    private int sales;
//    private double commission;
//    private double netSalary;
//
//    public SalesEmployee(int empId, String empName, double salary, int sales) {
//        super(empId, empName, salary);
//        System.out.println("Parameterised constructor of Employee is called");
//        this.sales = sales;
//        this.commission = 0;
//        this.netSalary = 0;
//    }
//
//    @Override
//    public String toString() {
//        return super.toString() + "\nSalesEmployee{" +
//                "sales=" + sales +
//                ", commission=" + commission +
//                ", netSalary=" + netSalary +
//                '}';
//    }
//
//    public double calaculateSalary() {
//        if (sales <= 5000) {
//            commission = 0.05 * getSalary();
//        } else if (sales > 5000 && sales <= 7000)
//            commission = 0.1 * getSalary();
//        else if (sales > 7000)
//            commission = 0.15 * getSalary();
//        netSalary = commission + getSalary();
//        return netSalary;
//    }
//}
