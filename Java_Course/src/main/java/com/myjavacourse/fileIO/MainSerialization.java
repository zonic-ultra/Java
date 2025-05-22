package com.myjavacourse.fileIO;
import javax.imageio.stream.FileImageOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Logger;
import java.io.FileInputStream;

public class MainSerialization {
    public static void main(String[] args) {
        Logger LOGGER = Logger.getLogger(MainSerialization.class.getName());
        EmployeeIO employeeIO = new EmployeeIO();
        employeeIO.name = "Judens";
        employeeIO.address = "Visayas";
        employeeIO.age = 22;
        employeeIO.salary = 50000.70;

        try{
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\JUDENS BANDAL\\OneDrive\\Desktop\\Java\\Judens Bandal.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employeeIO);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Creating Judens Bandal.txt is created successfully....");
            LOGGER.info("File Judens Bandal.txt is created successfully......");

        }catch(IOException e){
            e.printStackTrace();
            System.out.println("Error in writing a");
        }
    }
}
