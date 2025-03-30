package com.myjavacourse.day5_control_flow.loopStatement;

public class MainForEach {
    public static void main(String[] args) {
        String[] employeeName = {"Judens", "John", "Este"};


        System.out.println("Employee Information");
        for (String names: employeeName){
            System.out.println("- " + names);
        }


    }
}
