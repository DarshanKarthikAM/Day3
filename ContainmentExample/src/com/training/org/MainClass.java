package com.training.org;

import java.util.Date;

public class MainClass {
    public static void main(String[] args) {
        Customer cust1 = new Customer();
        System.out.println(cust1);


        Customer cust2 = new Customer("regular101", "Manish", "Bangalore", 93454545, new Product("Iphone", 98000, new Date()));
        System.out.println(cust2);
//        ArrayList<Customer> custRecords=new ArrayList<Customer>();
//
//        custRecords.add(new Customer("cust101","Amrinder","Mumbai",934546565));
//        custRecords.add(new Customer("cust102","Kranti","Chennai",964556765));
//        custRecords.add(new Customer("cust103","Suha","Bangalore",944546565));
//        custRecords.add(new Customer("cust104","Amit","Hyd",564746565));
//        custRecords.add(new Customer("cust105","Pappu","Pune",984546588));

//
//        for (Customer c1:custRecords){
//            System.out.println(c1.getCustName());
//        }

//        Iterator<Customer> iter=custRecords.iterator();
//        while (iter.hasNext()){
//            System.out.println(iter.next());
//        }


//        ArrayList<String> list=new ArrayList<String>();
//        list.add("Pappu");
//        list.add("chintu");
//        list.add("Amit");
//        list.add("Chinki");
//
//        Iterator<String> iter2= list.iterator();
//        while(iter2.hasNext()){
//            String name=iter2.next();
//            if(name.equals("Amit"))
//                iter2.remove();
//        }
//        while (iter2)
//
//        for (String str:list)
//            System.out.println(str);


    }
}

