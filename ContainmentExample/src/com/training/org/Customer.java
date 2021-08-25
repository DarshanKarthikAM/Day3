package com.training.org;

public class Customer {
    private String custId;
    private String custName;
    private String custAddress;
    private long mobileNo;
    private Product product;

    public Customer() {
        System.out.println("Default constructor of Customer is called");
        custId = "";
        custName = "";
        custAddress = "";
        mobileNo = 0;
        product = new Product();
    }

    public Customer(String custId, String custName, String custAddress, long mobileNo, Product product) {
        System.out.println("Parametrised constructor of Customer is called");
        this.custId = custId;
        this.custName = custName;
        this.custAddress = custAddress;
        this.mobileNo = mobileNo;
        this.product = product;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId='" + custId + '\'' +
                ", custName='" + custName + '\'' +
                ", custAddress='" + custAddress + '\'' +
                ", mobileNo=" + mobileNo +
                ", product=" + product +
                '}';
    }
}
