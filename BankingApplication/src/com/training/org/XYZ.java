package com.training.org;

public class XYZ {
    private String bankName;
    private String bankAddress;
    private int noOfEmployees;

    public XYZ() {
        System.out.println("Default constructor of XYZBank is called");
        bankName = "";
        bankAddress = "";
        noOfEmployees = 0;
    }

    public XYZ(String bankName, String bankAddress, int noOfEmployees) {
        this.bankName = bankName;
        this.bankAddress = bankAddress;
        this.noOfEmployees = noOfEmployees;
    }

    public String toString() {
        return "Bank Details are " + bankName + " Address " + bankAddress + " NoOfEmployees" + noOfEmployees;
    }
}
