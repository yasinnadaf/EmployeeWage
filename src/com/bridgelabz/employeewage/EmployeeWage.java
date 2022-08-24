package com.bridgelabz.employeewage;

public class EmployeeWage {
    public static void main(String[] args) {
        EmpWageBuilder amazon = new EmpWageBuilder("amazon",10,20,100);
        EmpWageBuilder flipkart = new EmpWageBuilder("FlipKart",12,22,90);
        amazon.calculateWage();
        System.out.println(amazon);
        flipkart.calculateWage();
        System.out.println(flipkart);
    }
}
