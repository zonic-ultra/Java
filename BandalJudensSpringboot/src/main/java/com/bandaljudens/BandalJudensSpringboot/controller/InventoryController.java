package com.bandaljudens.BandalJudensSpringboot.controller;

import com.bandaljudens.BandalJudensSpringboot.model.Assets;
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
    //==========Assets
    @PostMapping("/addAssets")
    public Assets addAssets(@RequestBody Assets assets){
        return inventoryService.addAssets(assets);
    }

    @GetMapping("/assets")
    public List<Assets> getAllAssets(){
        return  inventoryService.getAllAssets();
    }
    @GetMapping("/assets/{assetsId}")
    public Assets getAssetsById(@PathVariable Long assetsId){
        return inventoryService.getAssetsById(assetsId);
    }
    @GetMapping("/employees/{employeeId}/assets")
    public List<Assets> getEmployeeAssetsByEmployeeId(@PathVariable Long employeeId){
        return inventoryService.getAssetsByEmployee(employeeId);
    }
    @PostMapping("/employees/{employeeId}/assets/{assetsId}")
    public Employee addAssetsToSpecificEmployee(@PathVariable Long employeeId, @PathVariable Long assetsId){
        return inventoryService.assignAsset(employeeId, assetsId);
    }
    @DeleteMapping("/deleteAssets/{assetsId}")
    public void deleteAssets(@PathVariable Long assetsId){
        inventoryService.deleteAssets(assetsId);
    }
    @DeleteMapping("/employees/{employeeId}/assets/{assetsId}")
    public void removeAssetsFromSpecificEmployee(@PathVariable Long employeeId, @PathVariable Long assetsId){
        inventoryService.removeAssetsFromEmployee(employeeId, assetsId);
    }





}
