package com.myjavacourse.day6_arrays.initializingAndDeclaring;

public class MainInitializingAndDeclaring {
    public static void main(String[] args) {

        //datatype[] + variable name []  = {value}
        String[] employeeName = {"Judens", "John", "Este"};

        System.out.println("Employee Information");
        for (String names: employeeName){
            System.out.println("- " + names);
        }

        for (int y= 0; y < employeeName.length; y++){
            String names = employeeName[y];
            System.out.println("Name " + names);
        }
    }


}
