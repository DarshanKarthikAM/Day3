package com.training.org;

public class MainClass {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        System.out.println(e1);

        Employee e2 = new Employee(101, "Aman", 10000);
        System.out.println(e2);

        SalesEmployee s1 = new SalesEmployee(101, "Eshan", 10000, 5000);
        System.out.println(s1);
    }
}
