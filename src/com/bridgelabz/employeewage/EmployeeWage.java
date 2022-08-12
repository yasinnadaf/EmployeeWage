package com.bridgelabz.employeewage;

public class EmployeeWage {

    static final int IS_PRESENT = 1;
    static final int IS_PART_TIME = 2;
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 4;

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Program");
        int attendance = (int) (Math.floor(Math.random()*10))%3;

        switch(attendance){
            case IS_PRESENT:
               System.out.println("Employee is working full time");
               int dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
               System.out.println("Employee daily wage is: "+dailyWage);
               break;
            case IS_PART_TIME:
               System.out.println("Employee is working part time");
               dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
               System.out.println("Employee daily wage is: "+dailyWage);
               break;
            default:
              System.out.println("Employee is absent");
              break;
        }
    }
}
