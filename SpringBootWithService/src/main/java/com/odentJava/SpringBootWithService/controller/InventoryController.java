package com.odentJava.SpringBootWithService.controller;



import com.odentJava.SpringBootWithService.model.Assets;
import com.odentJava.SpringBootWithService.model.Employee;
import com.odentJava.SpringBootWithService.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {

    @Autowired
    InventoryService inventoryService;

    //==============EMPLOYEES================

    //GET ALL
    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return inventoryService.getAllEmployees();
    }

    //GET by ID
    @GetMapping("/employees/{id}")
    public Optional<Employee> getEmpById(@PathVariable Long id){
        return inventoryService.getEmpById(id);
    }

    //ADD
    @PostMapping("/addEmployee")
    public ResponseEntity<?> addEmployee(@RequestBody Employee addEmp){
        try {
            if (addEmp.getName() == null || addEmp.getName().trim().isEmpty()){
                return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                        .body("Employee name cannot be null");
            }
            if (addEmp.getDepartment() == null || addEmp.getDepartment().trim().isEmpty()){
                return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                        .body("Employee department cannot be null");
            }
            Employee saveEmployee = inventoryService.addEmployee(addEmp);
            return ResponseEntity.created(URI.create("/api/inventory/addEmployee/" + saveEmployee.getId()))
                    .body(saveEmployee);
        }catch (IllegalArgumentException e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(e.getMessage());
        }catch (RuntimeException e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(e.getMessage());
        }
    }

    //UPDATE
    @PutMapping("/updateEmployee/{employeeId}")
    public ResponseEntity<?> updateEmpById(@PathVariable Long employeeId, @RequestBody Employee updateEmployee){
        try {
            if (updateEmployee.getName() == null || updateEmployee.getName().trim().isEmpty()){
                return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                        .body("Employee name cannot be null");
            }
            if (updateEmployee.getDepartment() == null || updateEmployee.getDepartment().trim().isEmpty()){
                return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                        .body("Employee department cannot be null");
            }
            Employee update = inventoryService.updateEmployee(employeeId,updateEmployee);
            return ResponseEntity.ok(update);
        }catch (IllegalArgumentException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(e.getMessage());
        }catch (RuntimeException e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(e.getMessage());
        }
    }

    //DELETE
    @DeleteMapping("/deleteEmployee/{employeeId}")
    public ResponseEntity<Void> deleteEmp(@PathVariable Long employeeId){
        inventoryService.deleteEmp(employeeId);
        return ResponseEntity.noContent().build();
    }

    //==========Assets============

    //Add
    @PostMapping("/addAssets")
    public ResponseEntity<Assets> addAssets(@RequestBody Assets assets){
        Assets saveAssets =  inventoryService.addAssets(assets);
        return ResponseEntity.created(URI.create("/api/inventory/assets/" + saveAssets.getId()))
                .body(saveAssets);
    }

    //Fetch
    @GetMapping("/assets")
    public List<Assets> getAllAssets(){
        return  inventoryService.getAllAssets();
    }

    @GetMapping("/assets/{assetsId}")
    public Optional<Assets> getAssetsById(@PathVariable Long assetsId){
        return inventoryService.getAssetsById(assetsId);
    }

//    //Delete
//    @DeleteMapping("/deleteAssets/{assetsId}")
//    public void deleteAssets(@PathVariable Long assetsId){
//        inventoryService.deleteAssets(assetsId);
//    }

    @DeleteMapping("/deleteAss/{assetId}")
    public ResponseEntity<Void> deleteAsset(@PathVariable Long assetId){
        inventoryService.deleteAssets(assetId);
        return ResponseEntity.noContent().build();
    }

    //Update
    @PutMapping("/updateAssets/{assetId}")
    public ResponseEntity<?> updateAss(@PathVariable Long assetId, @RequestBody Assets updateAsset){
        try {
            if (updateAsset.getName() == null){
                return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                        .body("Name cannot be null");
            }
            if (updateAsset.getSerialNumber() == null){
                return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                        .body("Serial Number cannot be null");
            }
            Assets update = inventoryService.updateAsset(assetId, updateAsset);
            return ResponseEntity.ok(update);
        }catch (IllegalArgumentException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(e.getMessage());
        }catch (RuntimeException e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(e.getMessage());
        }
    }

    //==============ASSIGNING ASSETS

    //Assigning assets to specific employee


    //Delete assets from specific employee


    //Get asset from specific employee




}
