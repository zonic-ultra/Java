package com.odentJava.SpringBootWithService.IntegrationTesting;


import com.odentJava.SpringBootWithService.SpringBootWithServiceApplication;
import com.odentJava.SpringBootWithService.model.Assets;
import com.odentJava.SpringBootWithService.model.Employee;
import com.odentJava.SpringBootWithService.service.InventoryService;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = SpringBootWithServiceApplication.class)
@Transactional
@TestPropertySource(locations = "classpath:application-test.properties")
public class DatabaseIntegrationTest {

    @Autowired
    private InventoryService inventoryService;

    private Employee testEmployee;
    private Assets testAsset;

    @BeforeEach
    void setUp(){
        testEmployee = new Employee(null, "Odent","IT");
        testAsset = new Assets(null,"Acer","IT Laptop","ACER4356");
    }

    @Test
    void shouldSaveEmployeeAndRetrieve(){
        //saved
        Employee saveEmployee = inventoryService.addEmployee(testEmployee);
        assertNotNull(saveEmployee.getId());

        //retrieved
        Optional<Employee> retrievedEmployee = inventoryService.getEmpById(saveEmployee.getId());
        assertTrue(retrievedEmployee.isPresent());
        assertEquals("Odent", retrievedEmployee.get().getName());
        assertEquals("IT", retrievedEmployee.get().getDepartment());

    }
    @Test
    void shouldSaveAssetAndRetrieved(){
        //save
        Assets saveAsset = inventoryService.addAssets(testAsset);
        assertNotNull(saveAsset.getId());

        //retrieved
        Optional<Assets> retrievedAsset = inventoryService.getAssetsById(saveAsset.getId());
        assertTrue(retrievedAsset.isPresent());
        assertEquals("Acer",saveAsset.getName());
        assertEquals("IT Laptop",saveAsset.getType());
        assertEquals("ACER4356",saveAsset.getSerialNumber());
    }

    @Test
    void shouldGetAllEmployees(){
        //saved
        inventoryService.addEmployee(testEmployee);
        inventoryService.addEmployee(new Employee(null,"test","Test"));

        //retrieved
        List<Employee> employeeList = inventoryService.getAllEmployees();
        assertFalse(employeeList.isEmpty());
        assertTrue(employeeList.size() >= 2);
    }
    @Test
    void shouldGetAllAssets(){
        //save
        inventoryService.addAssets(testAsset);
        inventoryService.addAssets(new Assets(null,"RiZen","Dev laptop","RI234"));

        //retrieved
        List<Assets> assetsList = inventoryService.getAllAssets();
        assertFalse(assetsList.isEmpty());
        assertTrue(assetsList.size() >=2);
    }

    @Test
    void shouldUpdateEmployee(){
        //save
        Employee saveEmp = inventoryService.addEmployee(testEmployee);

        //update
        saveEmp.setName("Udent");
        Employee updatedEmployee = inventoryService.updateEmployee(saveEmp.getId(), saveEmp);

        //verify
        assertEquals("Udent", updatedEmployee.getName());
        Optional<Employee> retrievedEmployee = inventoryService.getEmpById(saveEmp.getId());
        assertTrue(retrievedEmployee.isPresent());
        assertEquals("Udent",retrievedEmployee.get().getName());
    }

    @Test
    void shouldUpdateAsset(){
        //save
        Assets saveAsset = inventoryService.addAssets(testAsset);

        //update
        saveAsset.setSerialNumber("RI0000");
        Assets updateAsset = inventoryService.updateAsset(saveAsset.getId(), saveAsset);

        //verify
        assertEquals("RI0000",saveAsset.getSerialNumber());
        Optional<Assets> retrievedAsset = inventoryService.getAssetsById(saveAsset.getId());
        assertTrue(retrievedAsset.isPresent());
        assertEquals("RI0000",saveAsset.getSerialNumber());
    }


    @Test
    void shouldDeleteEmployee(){
        //save
        Employee saveEmp = inventoryService.addEmployee(testEmployee);
        assertNotNull(saveEmp.getId(),"Employees should have benn save with in Id");

        //delete
        inventoryService.deleteEmp(saveEmp.getId());

        //verify
        Optional<Employee> retrievedEmp = inventoryService.getEmpById(saveEmp.getId());
        assertFalse(retrievedEmp.isPresent(),"Employees should exist after deletion");
    }

    @Test
    void shouldDeleteAsset(){
        //save
        Assets saveAsset = inventoryService.addAssets(testAsset);
        assertNotNull(saveAsset.getId(),"Employees should have benn save with in Id");

        //delete
        inventoryService.deleteAssets(testAsset.getId());

        //verify
        Optional<Assets> retrieveAsset = inventoryService.getAssetsById(saveAsset.getId());
        assertFalse(retrieveAsset.isPresent(),"Employees should exist after deletion");
    }




}