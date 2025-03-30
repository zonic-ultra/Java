package com.myjavacourse.day5_control_flow.decisionmaking;

public class MainIfElseStatement {
    public static void main(String[] args) {

        double salary = 90000.50;
        double bonus = 5000.50;
        double tax = 1000.50;
        double hourlyRate = 1500;
        int workingHours = 9;
        int yearsOfExperiences = 5;

        // &&
        if (yearsOfExperiences == 5 && salary == 90000.50){
            System.out.println("Judens has been with the company for 5 years and have a salary of 90k per month");
        }else {
            System.out.println("Judens has not with the company for 5 years and don't have a salary of 90k per month");
        }


        //or
        if (yearsOfExperiences == 9 || salary == 90000.50){
            System.out.println("Judens has been with the company for 5 years and have a salary of 90k per month");
        }else {
            System.out.println("Judens has been with the company for 5 years and don't have a salary of 90k per month");
        }
    }
}
