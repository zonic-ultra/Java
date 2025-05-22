package com.myjavacourse.final_assessment;

import com.myjavacourse.final_assessment.exception.DuplicateEmployeeException;
import com.myjavacourse.final_assessment.exception.EmployeeNotFoundException;
import com.myjavacourse.final_assessment.exception.IOException;
import com.myjavacourse.final_assessment.service.EmployeeManagementSystem;

import java.io.File;
import java.util.Set;
import java.util.logging.Logger;



public class MainEmployee {
    public static void main(String[] args) {
        Logger LOGGER = Logger.getLogger(MainEmployee.class.getName());
        EmployeeManagementSystem ems = new EmployeeManagementSystem();
        String path = "C:\\Users\\JUDENS BANDAL\\OneDrive\\Desktop\\Final Assessment\\Employees.xlsx";
        try{
            File file = new File(path);
            if (!file.exists()){
                System.out.println("Excel file not found.");
            }

            try{
                System.out.println();
                System.out.println("...........Saving File...........");
                LOGGER.info("Saving success");
                ems.saveEmployeesToExcel(path);
            }catch (IOException e){
                LOGGER.info("Error Saving");
                System.out.println("Error: " + e.getMessage());
            }

            System.out.println();
            System.out.println("Loading employees from Excel file " + path);
            try{
                ems.loadEmployeesFromExcel(path);
                System.out.println("File Employees.xlsx is loaded successfully......");
            }catch (IOException e){
                System.out.println(e.getMessage());
            }

            System.out.println();
            System.out.println("...........Adding Specific Employee...........");
            try{
                ems.addSpecificEmployeesToExcel(path);
                LOGGER.info("Adding Success");
            }catch (DuplicateEmployeeException e){
                System.out.println(e.getMessage());
            }

            System.out.println();
            System.out.println("...........Initial Employee...........");
            ems.displayAllEmployees();

            System.out.println();
            try{
                int empId = 2;
                System.out.println("...........Get employee by ID...........");
                System.out.println("Get employee with Id: "+ empId + " , " + ems.getEmployee(empId));
            }catch (EmployeeNotFoundException e){
                System.out.println(e.getMessage());
            }

            System.out.println();
            System.out.println("...........Remove Employee By Id...........");
            try {
                int remove = 1;
                System.out.println("Remove Employee Id: " + remove);
                ems.removeEmployee(remove);
            }catch (EmployeeNotFoundException e){
                System.out.println(e.getMessage());
            }

            System.out.println();
            System.out.println("...........New Employee List after removing...........");
            ems.displayAllEmployees();

            System.out.println();
            try {
                System.out.println("...........Update Employee...........");
                ems.updateEmployee(
                        2,
                        "Odent",
                        "Bandal",
                        "BSIT",
                        5,
                        50000,Set.of("Health Insurance"),
                        30000);
            }catch (EmployeeNotFoundException e){
                System.out.println(e.getMessage());
            }
            System.out.println();
            System.out.println("...........Final Employee List...........");
            ems.displayAllEmployees();

           LOGGER.info("Success");
        } catch (Exception e) {
            LOGGER.info("Error");
        }

    }
}
