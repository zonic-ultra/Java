package com.myjavacourse.final_assessment.service;

import com.myjavacourse.final_assessment.exception.DuplicateEmployeeException;
import com.myjavacourse.final_assessment.exception.EmployeeNotFoundException;
import com.myjavacourse.final_assessment.exception.IOException;
import com.myjavacourse.final_assessment.model.Developer;
import com.myjavacourse.final_assessment.model.Employee;
import com.myjavacourse.final_assessment.model.Manager;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.*;

public class EmployeeManagementSystem {
    private HashMap<Integer, Employee> employeeMap = new HashMap<>();
    private ArrayList<Employee> employeeList = new ArrayList<>();
    private HashSet<Employee> employeeSet = new HashSet<>();

    public void addEmployee(Employee addEmployee)throws DuplicateEmployeeException {
        if (employeeMap.containsKey(addEmployee.getId())){
            throw new DuplicateEmployeeException("Employee ID: " + addEmployee.getId() + " already exists.");
        }
        employeeMap.put(addEmployee.getId(),addEmployee);
        employeeList.add(addEmployee);
        employeeSet.add(addEmployee);
    }
    public void removeEmployee(int Id) throws EmployeeNotFoundException {
        if(!employeeMap.containsKey(Id)){
            throw new EmployeeNotFoundException("No employee found with Id: " + Id);
        }
        Employee remove = employeeMap.remove(Id);
        employeeMap.remove(remove);
    }
    public Employee getEmployee(int empId)throws EmployeeNotFoundException{
        if (!employeeMap.containsKey(empId)){
            throw new EmployeeNotFoundException("No employee found with Id: "+empId);
        }

        return employeeMap.get(empId);

    }

    public void displayAllEmployees(){

        for (Map.Entry<Integer, Employee> entry: employeeMap.entrySet()){
            System.out.println("Id: " + entry.getKey()+", Value: " + entry.getValue());
        }
//        for (Employee emp: employeeList){
//            System.out.println("ID: " + emp.getId());
//            System.out.println("First Name: " + emp.getFirstName());
//            System.out.println("Last Name: " + emp.getLastName());
//            System.out.println("Department: " + emp.getDepartment());
//            System.out.println("Years Of Service: " + emp.getYearsOfService());
//            System.out.println("Salary: " + emp.getSalary());
//            System.out.println("Bonus: " + emp.getBonus());
//            System.out.println("Benefits: " + emp.getBenefits());
//            System.out.println("Total Compensation: " +emp.calculateTotalCompensation());
//            System.out.println("...........................");
//        }

    }

    public void updateEmployee(int Id, String  firstname, String  lastname, String department, int yearsOfService, double salary, Set<String> benefits, double bonus)throws EmployeeNotFoundException{
        if (!employeeMap.containsKey(Id)){
            throw new EmployeeNotFoundException("No employee found with Id: " + Id );
        }
//        employeeMap.put();
        Employee existing = employeeMap.get(Id);
        Employee updated;
        if (existing instanceof Manager){
            updated = new Manager(Id, firstname, lastname, department, yearsOfService, salary, benefits, bonus);
        }else {
            updated = new Developer(Id, firstname, lastname, department, yearsOfService, salary, benefits, bonus);
        }
        employeeMap.put(Id,updated);

        System.out.println("Employee with Id " + Id + " has been updated.");
    }

    public void loadEmployeesFromExcel(String filename) throws IOException, java.io.IOException {
        File file = new File(filename);
        if (!file.exists()){
           throw new IOException("Custom Error: Excel file does not exist -");
        }
       try (FileInputStream fileInputStream = new FileInputStream(file);
            Workbook workbook = new XSSFWorkbook(fileInputStream)){
            Sheet sheet = workbook.getSheetAt(0);
            Iterator<Row>iterator = sheet.iterator();

            if(iterator.hasNext()){
                iterator.next();
            }

           while (iterator.hasNext()){
                Row row = iterator.next();
                int id = (int) row.getCell(0).getNumericCellValue();
                String  firstname = row.getCell(1).getStringCellValue();
                String lastname =  row.getCell(2).getStringCellValue();
                String department =  row.getCell(3).getStringCellValue();
                int yearsOfService = (int) row.getCell(4).getNumericCellValue();
                double salary = row.getCell(5).getNumericCellValue();
                Set<String> benefits = new HashSet<>(Arrays.asList(row.getCell(6).getStringCellValue().split(",")));
                double bonus = row.getCell(7).getNumericCellValue();
                String type = row.getCell(8).getStringCellValue();

                Employee emp;
                if ("Manager".equalsIgnoreCase(type)){
                    emp = new Manager(id,firstname,lastname,department,yearsOfService,salary,benefits,bonus);
                }else {
                    emp = new Developer(id,firstname,lastname,department,yearsOfService,salary,benefits,bonus);
                }
                addEmployee(emp);

            }

       } catch (DuplicateEmployeeException e) {
           System.out.println("Duplicate: "+e.getMessage());
       }
    }

    public void saveEmployeesToExcel(String filename) throws IOException, java.io.IOException {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Employees");

        Row header = sheet.createRow(0);
        String[] columns = {"Id","Firstname","Lastname","Department","YearsOfService","Salary","Benefits","Bonus","Total Compensation","Type"};
        for (int i = 0; i<columns.length; i++){
            header.createCell(i).setCellValue(columns[i]);
        }

        int rowNumber = 1;
        for (Employee emp: employeeList){
            Row row = sheet.createRow(rowNumber++);
            row.createCell(0).setCellValue(emp.getId());
            row.createCell(1).setCellValue(emp.getFirstName());
            row.createCell(2).setCellValue(emp.getLastName());
            row.createCell(3).setCellValue(emp.getDepartment());
            row.createCell(4).setCellValue(emp.getYearsOfService());
            row.createCell(5).setCellValue(String.format("%.2f",emp.getSalary()));
            row.createCell(6).setCellValue(
                    emp.getBenefits() != null && !emp.getBenefits().isEmpty()
                    ? String.join(",", emp.getBenefits())
                            :"None"
            );
            row.createCell(7).setCellValue(String.format("%.2f",emp.getBonus()));
            row.createCell(8).setCellValue(String.format("%.2f",emp.calculateTotalCompensation()));
            row.createCell(9).setCellValue(emp instanceof Manager? "Manager":"Developer");

            for(int i = 0 ; i<=9; i++){
                sheet.autoSizeColumn(i);
            }
        }
        try (FileOutputStream fileOutputStream = new FileOutputStream(filename)) {
            workbook.write(fileOutputStream);
            workbook.close();
        }
    }


    public void addSpecificEmployeesToExcel(String filename) throws DuplicateEmployeeException {

        Employee manager = new Manager(
                1,
                "Este",
                "Banag",
                "BSIT",
                7,
                100000,
                new HashSet<>(Collections.singletonList("Health Insurance")),
                40000.05);
        Employee manager1 = new Manager(
                4,
                "Eudora",
                "Zin",
                "DevOps",
                10,
                150000,
                new HashSet<>(Collections.singletonList("Travel")),
                50000.75);
        Employee developer = new Developer(2,
                "Judens",
                "Bandal",
                "BSIT",
                5,
                50000.75,
                new HashSet<>(Collections.singletonList("Health Insurance")),
                30000);
        Employee developer1 = new Developer(3,
                "John",
                "Durante",
                "BSIT",
                3,
                40000.50,
                new HashSet<>(Collections.singletonList("Gym")),
                20000);

        try {
            addEmployee(manager);
            addEmployee(manager1);
            addEmployee(developer);
            addEmployee(developer1);
            saveEmployeesToExcel(filename);
            System.out.println("Specific employees added and saved.");
        }catch (DuplicateEmployeeException | IOException | java.io.IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
