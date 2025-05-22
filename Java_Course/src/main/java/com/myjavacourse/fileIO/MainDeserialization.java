package com.myjavacourse.fileIO;
import java.io.*;
import java.util.logging.Logger;

public class MainDeserialization {
    public static void main(String[] args) {
        Logger LOGGER = Logger.getLogger(MainDeserialization.class.getName());
        EmployeeIO employeeIO = null;


        try{

            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\JUDENS BANDAL\\OneDrive\\Desktop\\Java\\Judens Bandal.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            employeeIO = (EmployeeIO) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            System.out.println("Reading Judens Bandal.txt ....");
            LOGGER.info("File Judens Bandal.txt reading successfully......");
            System.out.println("Name: " + employeeIO.name);
            System.out.println("Address: " + employeeIO.address);
            System.out.println("Age: " + employeeIO.age);
            System.out.printf("Salary: %.2f ", employeeIO.salary);
        }catch(ClassNotFoundException | IOException e){
            e.printStackTrace();
            System.out.println("Error in reading ......");
//            System.out.println(LOGGER);

        }
    }
}
