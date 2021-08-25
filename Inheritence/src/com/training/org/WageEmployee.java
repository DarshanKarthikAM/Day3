//package com.training.org;
//
//public class WageEmployee extends Employee {
//    private double wages;
//    private int year;
//    private int month;
//    private int noOfWorkingHrs;
//
//    public WageEmployee() {
//
//    }
//
//    public WageEmployee(int empId, String empName, double salary, int year,
//                        int month, int noOfWorkingHrs) {
//        super(empId, empName, salary);
//        this.wages = 0;
//        this.year = year;
//        this.month = month;
//        this.noOfWorkingHrs = noOfWorkingHrs;
//    }
//
//    public int calculateDay() {
//        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
//            return 31;
//        else if (month == 2)
//            return 28;
//        else
//            return 30;
//    }
//
//    public void calculateSalary() {
//        System.out.println("Calculating of salary of WageEmployee is called");
//        int noOfDays = calculateDay();
//        double perDaySalary = getSalary() / noOfDays;
//        double perHourSalary = perDaySalary / 8;
//        wages = perHourSalary * noOfWorkingHrs;
//        System.out.println("Total Wages is " + wages);
//
//    }
//}
