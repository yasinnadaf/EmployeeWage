package com.bridgelabz.employeewage;

public class EmployeeWage {

    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;


    static void calculateWage(String company, int wagePerHr, int daysPerMonth,int workHrPerMonth){
        System.out.println("Welcome to Employee Wage Computation");
         int empHrs;
         int totalHours = 0;
         int day = 0;
         int totalWage = 0;
         int dailyWage=0;



        while((totalHours< workHrPerMonth) && (day<daysPerMonth )){
            int attendance = (int)(Math.floor(Math.random()*10))%3;

            switch (attendance) {

                case IS_FULL_TIME:
                    empHrs = 8;
                    break;

                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
                    break;
            }
            totalHours+=empHrs;
            dailyWage = wagePerHr*empHrs;
            totalWage+=dailyWage;
            day++;
            System.out.println("Day "+day+" Emp work hour "+empHrs+ " wage is "+dailyWage);

        }
        System.out.println("Total work hour is: "+totalHours);
        System.out.println("Total work days are: "+day);
        System.out.println(" wage is: "+totalWage);
        System.out.println("Total Wage of company "+company+ " is "+ totalWage);


    }

    public static void main(String[] args) {
        calculateWage("Flipkart",10,20,100);
        calculateWage("Amazon",12,22,90);
    }
}
