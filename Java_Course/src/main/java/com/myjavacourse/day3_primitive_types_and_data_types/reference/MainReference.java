package com.myjavacourse.day3_primitive_types_and_data_types.reference;

public class MainReference {
    public static void main(String[] args){
        Employee manager = new Manager();
        Employee developer = new Developer();
        Employee designer = new Designer();

        Employee[] employees = {manager, developer, designer};

        for (Employee employee: employees){
            employee.work();
            employee.lunch();
            employee.meeting();
            System.out.println();
        }
    }
}
