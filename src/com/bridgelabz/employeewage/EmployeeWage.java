package com.bridgelabz.employeewage;

public class EmployeeWage {

    static final int IS_PRESENT=1;
    static final int IS_PART_TIME=2;
    static final int WAGE_PER_HOUR=20;
    static final int FULL_DAY_HOUR=8;
    static final int PART_TIME_HOUR=4;
    static final int WORKING_DAY_PER_MONTH=20;


    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");

        int dailyWage=0;
        int monthlyWage=0;

        for(int day=1; day<=WORKING_DAY_PER_MONTH; day++) {
            int attendence = (int) (Math.floor(Math.random() * 10)) % 3;


            switch (attendence) {

                case IS_PRESENT:
                    // System.out.println("Employee is Working Full Time");
                    dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                    System.out.println("Employee daily wage is :" + dailyWage);
                    //int monthlyWage = dailyWage * WORKING_DAY_PER_MONTH;
                    //System.out.println("Employee monthly wage is : "+ monthlyWage);
                    break;

                case IS_PART_TIME:
                    // System.out.println("Employee is working part time");
                    dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                    System.out.println("Employee daily wage is: " + dailyWage);
                    //monthlyWage = dailyWage * WORKING_DAY_PER_MONTH;
                    //System.out.println("Employee monthly wage is : "+ monthlyWage);
                    break;

                default:
                    System.out.println("Employee is absent");
                    break;
            }
            monthlyWage += dailyWage;
        }
        System.out.println("monthlyWage :"+monthlyWage);

    }
}
