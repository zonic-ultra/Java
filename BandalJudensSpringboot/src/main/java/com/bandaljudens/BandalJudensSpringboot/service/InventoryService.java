package com.bandaljudens.BandalJudensSpringboot.service;

import com.bandaljudens.BandalJudensSpringboot.model.Assets;
import com.bandaljudens.BandalJudensSpringboot.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InventoryService {
    private List<Employee> employeesList = new ArrayList<>();
    private List<Assets> assetsList = new ArrayList<>();

    private Long employeeId = 101L;
    private Long assetsId = 201L;

    public InventoryService() {
        initializeEmployee();
    }

    private void initializeEmployee() {
        addEmployee(new Employee(null,"Judenss Bandal","DevOps"));
        addEmployee(new Employee(null,"Este Banag","IT"));
        addEmployee(new Employee(null,"John durante","AWS"));
        addEmployee(new Employee(null,"Joshua Tan","IT"));
        addEmployee(new Employee(null,"Bhin Canbantoc","IT"));

        addAssets(new Assets(null,"Lenovo","DevOps Laptop","LVN00534"));
        addAssets(new Assets(null,"MSI","IT Laptop","MSI00535"));
        addAssets(new Assets(null,"Asus","AWS Laptop","AWs00536"));
        addAssets(new Assets(null,"Dell","Azure Laptop","AZU00537"));
        addAssets(new Assets(null,"HP","Microsoft Laptop","MIC00538"));

        assignAsset(101L,201L);// default Judens Bandal
        assignAsset(102L,202L);
        assignAsset(103L,203L);
        assignAsset(104L,204L);
        assignAsset(105L,205L);
    }

    //========= get all emps
    public List<Employee> getAllEmployees(){
        return employeesList;
    }

    //========= get emps by id
    public Employee getEmpById(long employeeId){
        return employeesList.stream().filter(employee -> employee.getId().equals(employeeId)).findFirst().orElse(null);
    }

    //=========add emp
    public Employee addEmployee(Employee employee) {
        employee.setId(employeeId++);
        if (employee.getAssets() != null && !employee.getAssets().isEmpty()){
            for (Assets assets : employee.getAssets()){
                assets.setId(assetsId++);
            }
        }
        employeesList.add(employee);
        return employee;
    }

//    private Assets addAssets(Assets assets) {
//        assets.setId(assetsId++);
//        assetsList.add(assets);
//        return assets;
//    }


    //========= update emps
    public Employee updateEmployee(Long employeeId, Employee updateEmp){
        for (int i = 0; i < employeesList.size(); i++){
            if (employeesList.get(i).getId().equals(employeeId)){
                updateEmp.setId(employeeId);
                employeesList.set(i,updateEmp);
                return updateEmp;
            }
        }
        return null;
    }
    //=========delete
    public void deleteEmp(Long employeeId){
        employeesList.removeIf(employee -> employee.getId().equals(employeeId));
    }

    public Employee assignAsset(long employeeId, long assetsId) {
        Optional<Employee> employeeOptional = employeesList.stream().filter(e -> e.getId().equals(employeeId)).findFirst();
        Optional<Assets> assetsOptional = assetsList.stream().filter(e -> e.getId().equals(assetsId)).findFirst();
        if (employeeOptional.isPresent()&&assetsOptional.isPresent()){
            employeeOptional.get().addAssets(assetsOptional.get());
            return employeeOptional.get();
        }
        return null;
    }

    public Employee removeAssetsFromEmployee(Long employeeId, Long assetsId){
        Optional<Employee> employeeOptional = employeesList.stream().filter(employee -> employee.getId().equals(employeeId)).findFirst();
        Optional<Assets> assetsOptional = assetsList.stream().filter(assets -> assets.getId().equals(assetsId)).findFirst();

        if (employeeOptional.isPresent() && assetsOptional.isPresent()){
            employeeOptional.get().removeAssets(assetsOptional.get());
            return employeeOptional.get();
        }
        return  null;
    }

    //========Assets=============

    //get
    public List<Assets> getAllAssets(){
        return assetsList;
    }

    public Assets getAssetsById(long assetsId){
        return assetsList.stream().filter(emp -> emp.getId().equals(assetsId)).findFirst().orElse(null);
    }
    public List<Assets> getAssetsByEmployee(Long employeeId){
        return employeesList.stream()
                .filter(employee -> employee.getId().equals(employeeId))
                .findFirst()
                .map(Employee::getAssets)
                .orElse(null);
    }

    public Assets addAssets(Assets assets){
        assets.setId(assetsId++);
        assetsList.add(assets);
        return assets;
    }

    public void deleteAssets(Long assetsId){
        assetsList.removeIf(assets -> assets.getId().equals(assetsId));
    }



}
