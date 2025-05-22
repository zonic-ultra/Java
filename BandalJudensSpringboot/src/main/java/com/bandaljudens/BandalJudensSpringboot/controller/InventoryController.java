package com.bandaljudens.BandalJudensSpringboot.controller;

import com.bandaljudens.BandalJudensSpringboot.model.Employee;
import com.bandaljudens.BandalJudensSpringboot.service.InventoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {
    private final InventoryService inventoryService;

    public InventoryController() {
        this.inventoryService = new InventoryService();
    }
    //==============EMPLOYEES================

    //GET ALL
    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return inventoryService.getAllEmployees();
    }

    //GET by ID
    @GetMapping("/employees/{id}")
    public Employee getEmpById(@PathVariable Long id){
        return inventoryService.getEmpById(id);
    }

    //ADD
    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee addEmp){
        return inventoryService.addEmployee(addEmp);
    }

    //UPDATE
    @PutMapping("/updateEmployee/{employeeId}")
    public Employee updateEmpById(@PathVariable Long employeeId, @RequestBody Employee updateEmployee){
        return inventoryService.updateEmployee(employeeId, updateEmployee);
    }

    //DELETE
    @DeleteMapping("/deleteEmployee/{employeeId}")
    public void deleteEmp(@PathVariable Long employeeId){
        inventoryService.deleteEmp(employeeId);
    }

}
