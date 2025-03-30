package com.myjavacourse.day5_control_flow.decisionmaking;

public class MainSwitchStatement {
    public static void main(String[] args) {
        int yearsOfExperience = 3;

        switch (yearsOfExperience){
            case 0:
            case 1:
                System.out.println("Experience level: Junior");
                break;
            case 2:
            case 3:
                System.out.println("Experience level: Intermediate");
                break;
            case 4:
            case 5:
                System.out.println("Experience level: Senior");
                break;

            default:
                System.out.println("Experience level: Expert");
        }

        String dept = "chem";
        switch (dept.toLowerCase()){
            case "it":
                System.out.println("Department: IT");
                break;
            case "es":
                System.out.println("Department: ES");
                break;
            case "chem":
                System.out.println("Department: Chemistry");
                break;
            case "Bio":
                System.out.println("Department: Biology");
                break;
            default:
                System.out.println("Unknown");

        }
    }
}
