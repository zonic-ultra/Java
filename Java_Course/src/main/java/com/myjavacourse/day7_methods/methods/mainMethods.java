package com.myjavacourse.day7_methods.methods;

public class mainMethods {
    public static void main(String[] args) {
//        displayEmployeeInfo("Judens", 22);

        double salary = calculateSalary(9, 550.5);
        System.out.println("Salary: " + salary);

        double bonus = calculateSalary(50000.5, 3);
        System.out.println("Salary: " + bonus);

        System.out.println(calculateSalary(50000.5, "Good"));
    }

    private static double calculateSalary(int workingHours, double hourlyRate) {
        return hourlyRate * workingHours;
    }
    private static double calculateSalary(double salary , int yearsOfService) {
        return salary * yearsOfService;
    }
    private static String calculateSalary(double salary , String performanceRating) {

        double percentageBonus;
        switch (performanceRating.toLowerCase()){
            case "excellent":
                percentageBonus = 0.1;
                break;
            case "good":
                percentageBonus = 0.05;
                break;
            default:
                percentageBonus = 0.03;
                performanceRating = "average";
        }

        double bonusAmount = salary + percentageBonus;
        return String.format("Judens got a bonus of Php %.2f , Performance is: ",
                                  bonusAmount,        performanceRating);
    }

    private static void displayEmployeeInfo(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

    }
}
