package com.myjavacourse.day4_operators.arithmetic;

public class MainArithmetic {
   public static void main(String[] args){

       double salary = 9000.50;
       double bonus = 5000.50;
       double tax = 1000.50;
       double hourlyRate = 1500.50;
       int workingHours = 9;
       int yearsOfExperiences = 5;


       //addition
       double grossPay = salary + bonus;
       System.out.println("Addition");
       System.out.println("Gross Pay: = " + grossPay);

//       subtraction
       double netPay = salary - tax;
       System.out.println("Subtraction");
       System.out.println("Net Pay: = " + netPay);
//

       //multiplication
       double dailyIncome = hourlyRate * workingHours;
       System.out.println("Multiplication");
       System.out.println("Daily Income Pay: = " + dailyIncome);

       //division
       double averageSalaryIncrease = salary / yearsOfExperiences;
       System.out.println("Division");
       System.out.println("Average Salary Increase: = " + averageSalaryIncrease);

       //modulus

       double averageIncrease = salary % yearsOfExperiences;
       System.out.println("Modulus");
       System.out.println("Average Increase: = " + averageIncrease);
    }
}
