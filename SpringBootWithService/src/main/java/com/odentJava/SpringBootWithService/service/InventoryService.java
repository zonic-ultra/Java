package com.odentJava.SpringBootWithService.service;


import com.odentJava.SpringBootWithService.model.Assets;
import com.odentJava.SpringBootWithService.model.Employee;
import com.odentJava.SpringBootWithService.repository.AssetRep;
import com.odentJava.SpringBootWithService.repository.EmployeeRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventoryService {

    @Autowired
    private AssetRep assetRep;

    @Autowired
    private EmployeeRep employeeRep;



//    ========= get all employees
    public List<Employee> getAllEmployees(){
        return employeeRep.findAll();
    }

//    ========= get employee by id
    public Optional<Employee> getEmpById(long employeeId){
        return employeeRep.findById(employeeId);
    }

//    =========add employee
    public Employee addEmployee(Employee employee) {
       return employeeRep.save(employee);
    }



//    ========= update employee
    public Employee updateEmployee(Long employeeId, Employee updateEmp){
        if (employeeRep.existsById(employeeId)){
            updateEmp.setId(employeeId);
            employeeRep.save(updateEmp);
        }
        return null;
    }
//    =========delete employee
    public void deleteEmp(Long employeeId){
        employeeRep.deleteById(employeeId);
    }

//    public Employee assignAsset(long employeeId, long assetsId) {
//        Optional<Employee> employeeOptional = employeesList.stream().filter(e -> e.getId().equals(employeeId)).findFirst();
//        Optional<Assets> assetsOptional = assetsList.stream().filter(e -> e.getId().equals(assetsId)).findFirst();
//        if (employeeOptional.isPresent()&&assetsOptional.isPresent()){
//            employeeOptional.get().addAssets(assetsOptional.get());
//            return employeeOptional.get();
//        }
//        return null;
//    }

//    public Employee removeAssetsFromEmployee(Long employeeId, Long assetsId){
//        Optional<Employee> employeeOptional = employeesList.stream().filter(employee -> employee.getId().equals(employeeId)).findFirst();
//        Optional<Assets> assetsOptional = assetsList.stream().filter(assets -> assets.getId().equals(assetsId)).findFirst();
//
//        if (employeeOptional.isPresent() && assetsOptional.isPresent()){
//            employeeOptional.get().removeAssets(assetsOptional.get());
//            return employeeOptional.get();
//        }
//        return  null;
//    }

//    ========Assets=============

    //get all
    public List<Assets> getAllAssets(){
        return assetRep.findAll();
    }

    //get by id
    public Optional<Assets> getAssetsById(long assetsId){
        return assetRep.findById(assetsId);
    }

    //add
    //    private Assets addAssets(Assets assets) {
//        assets.setId(assetsId++);
//        assetsList.add(assets);
//        return assets;
//    }

//    public List<Assets> getAssetsByEmployee(Long employeeId){
//        return employeesList.stream()
//                .filter(employee -> employee.getId().equals(employeeId))
//                .findFirst()
//                .map(Employee::getAssets)
//                .orElse(null);
//    }


    //add
    public Assets addAssets(Assets assets){

        return assetRep.save(assets);
    }

    //delete
    public void deleteAssets(Long assetsId){
        assetRep.deleteById(assetsId);
    }

    //update
    public Assets updateAsset(Long assetId, Assets updateAsset) {
        if (assetRep.existsById(assetId)){
            updateAsset.setId(assetId);
            return assetRep.save(updateAsset);
        }
        return null;
    }

}
