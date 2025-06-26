package com.odentJava.SpringBootWithService.serviceTest;

import com.odentJava.SpringBootWithService.model.Employee;
import com.odentJava.SpringBootWithService.repository.EmployeeRep;
import com.odentJava.SpringBootWithService.service.InventoryService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTest {

    @Mock
    private EmployeeRep employeeRep;

    @InjectMocks
    private InventoryService employeeService;

    private Employee testEmployee;

    private Employee updatedEmployee;

    @BeforeEach
    void setUp(){
        testEmployee = new Employee(101L,"Odent","IT");
        updatedEmployee = new Employee(102L,"Odent","Info Tech");
    }

    //Get all emps
    @Test
    void getAllEmployees_shouldReturnAllEmployees(){
        //Arrange
        List<Employee> expectedListOfEmployees = Arrays.asList(
                testEmployee,
                new Employee(102L, "Dent","DevOps")
        );
        when(employeeRep.findAll()).thenReturn(expectedListOfEmployees);

        //Act
        List<Employee> actualEmployee = employeeService.getAllEmployees();

        //Assert
        assertEquals(expectedListOfEmployees.size(),actualEmployee.size());
        verify(employeeRep).findAll();
    }

    @Test
    void getEmployeeById_ShouldReturnEmployeeById_WhenEmployeeIsExist(){
        //Arrange
        when(employeeRep.findById(5L)).thenReturn(Optional.of(testEmployee));

        //Act
        Optional<Employee> result = employeeService.getEmpById(5L);

        //Assert
        assertTrue(result.isPresent());
        assertEquals(testEmployee.getName(),result.get().getName());
    }

    @Test
    void addEmployee_ShouldReturnSaveEmployee(){
        //Arrange
        when(employeeRep.save(testEmployee)).thenReturn(testEmployee);

        //Act
        Employee saveEmployee = employeeService.addEmployee(testEmployee);

        //Assert
        assertNotNull(saveEmployee);
        assertEquals(testEmployee.getName(),saveEmployee.getName());

        verify(employeeRep).save(testEmployee);
    }

    @Test
    void updateEmployee_ShouldReturnUpdatedEmployeeWhenEmployeeExist(){
        //Arrange
        when(employeeRep.existsById(1L)).thenReturn(true);

        when(employeeRep.save(updatedEmployee)).thenReturn(updatedEmployee);


        //Act
        Employee result = employeeService.updateEmployee(1L, updatedEmployee);

        //Assert
        assertNotNull(result);
        assertEquals(updatedEmployee.getName(),result.getName());
        verify(employeeRep).existsById(1L);
        verify(employeeRep).save(updatedEmployee);
    }
    @Test
    void updateEmployee_ShouldReturnUpdatedEmployeeWhenEmployeeNotExist(){
        //Arrange
        when(employeeRep.existsById(1L)).thenReturn(false);

//        when(employeeRep.save(updatedEmployee)).thenReturn(updatedEmployee);


        //Act
        Employee result = employeeService.updateEmployee(1L, updatedEmployee);

        //Assert
        assertNull(result);
//        assertEquals(updatedEmployee.getName(),result.getName());
        verify(employeeRep).existsById(1L);
        verify(employeeRep, never()).save(updatedEmployee);
    }


}
