package com.myjavacourse.day10_java_collections_framework.hashMap;

import java.util.Map;

public class EmployeeServiceHashMap {
    private java.util.HashMap<Integer, EmployeeHashMap> employeeHashMap;

    public EmployeeServiceHashMap() {
        employeeHashMap = new java.util.HashMap<>();
    }

    //CRUD

    //add
    public EmployeeHashMap addEmployee(EmployeeHashMap addEmployee ){
        return employeeHashMap.put(addEmployee.getId(),addEmployee);
    }

    //get
    public EmployeeHashMap getEmployeeById(int id){
        return employeeHashMap.get(id);
    }

    //remove
    public EmployeeHashMap removeEmployeeById(int id){
        return employeeHashMap.remove(id);
    }

    //update
    public void updateEmployee(int id, String name,String department){
        if (employeeHashMap.containsKey(id)){
            employeeHashMap.put(id, new EmployeeHashMap(id,name,department));
        }
    }

    //check employee exist
    public boolean hasEmployee(int id){
        return employeeHashMap.containsKey(id);
    }

    //display
    public void displayAllEmployees(){
        for (Map.Entry<Integer, EmployeeHashMap> entry: employeeHashMap.entrySet()){
            System.out.println("id: "+ entry.getKey() +" , Value: " + entry.getValue());
        }
    }

    //total number
    public int getTotal(){
        return employeeHashMap.size();
    }
}
