package com.myjavacourse.day4_operators.comparison;

public class MainComparison {
    public static void main(String[] args){

        double salary = 90000.50;
        double bonus = 5000.50;
        double tax = 1000.50;
        double hourlyRate = 1500;
        int workingHours = 9;
        int yearsOfExperiences = 5;

        // =
        if (yearsOfExperiences == 5){
            System.out.println("Judens has been with the company for 5 years");
        }else {
            System.out.println("Judens has not with the company for 5 years");
        }


        //>=
        if (yearsOfExperiences >= 5){
            System.out.println("Judens is a Senior Backend Developer");
        }else {
            System.out.println("Judens is an average Backend Developer");
        }

        //<=
        if (hourlyRate <= 1500){
            System.out.println("//<=");
            System.out.println("Judens daily income is not 3k per hour");
        }else {
            System.out.println("Judens daily income more than 3k per hour");
        }


        //>
        if (yearsOfExperiences > 5){
            System.out.println("Judens is a Senior Backend Developer");
        }else {
            System.out.println("Judens is an average Backend Developer");
        }

        //<
        if (hourlyRate < 1500){
            System.out.println("<");
            System.out.println("Judens daily income is not 3k per hour");
        }else {
            System.out.println("Judens daily income iis 3k per hour");
        }

        // !=
        if (salary != 90000.40){
            System.out.println("Judens is not earning 90000k");
        }else {
            System.out.println("Judens is earning 90000k");
        }

    }
}
