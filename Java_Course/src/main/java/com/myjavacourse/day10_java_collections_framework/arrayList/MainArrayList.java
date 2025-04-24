package com.myjavacourse.day10_java_collections_framework.arrayList;

public class MainArrayList {
    public static void main(String[] args) {
        EmployeeServiceArrayList employee = new EmployeeServiceArrayList();
        employee.addEmployee(new EmployeeArrayList("BSIT", "Judens",1));
        employee.addEmployee(new EmployeeArrayList("BSIT", "Este",2));
        employee.addEmployee(new EmployeeArrayList("BSIT", "John",3));
        employee.addEmployee(new EmployeeArrayList("BSIT", "Zaida",4));
        System.out.println(".....After Adding");
        employee.printAllEmployees();
        System.out.println("Add by index");
        employee.addEmployeeByIndex(1,new EmployeeArrayList("Devops","Zuna",22));
        employee.printAllEmployees();
        System.out.println("Add First");
        employee.addEmployeeByFirst(new EmployeeArrayList("ES","Tomy",5));
        employee.printAllEmployees();
        System.out.println("Add Last");
        employee.addEmployeeLast(new EmployeeArrayList("MB","Zing",6));
        employee.printAllEmployees();
        System.out.println("Update employee");
        employee.updateEmployee(1,new EmployeeArrayList("IT","Odent",44));
        employee.printAllEmployees();
        System.out.println("remove employee");
        employee.removeByIndexEmployee(0);
        employee.removeByIndexEmployee(5);
        employee.printAllEmployees();
        System.out.println();
        System.out.println("Total: "+employee.getTotal());
        System.out.println("Is empty ? : "+employee.isEmpty());
        System.out.println();
        System.out.println("First employee: " + employee.getFirstEmployee());
        System.out.println();
        System.out.println("Last employee: " + employee.getLastEmployee());
        System.out.println();
        System.out.println("First employee: " + employee.getIndexEmployee(2));
//        ArrayList<String> name = new ArrayList<>();
//        name.add("John");
//        name.add("Judens");
//        name.add("Este");
//
//
//
//        System.out.println( name.size());
//
//        for(int i = 0; i < name.size(); i++){
//            System.out.println(name.get(i));
//        }
//
//        ArrayList<Student> students = new ArrayList<Student>();
//        students.add(new Student("Judens", "BSIT"));
//        students.add(new Student("Este", "BSIT"));
//
//
//        for (Student stud : students){
//            stud.introduce();
//        }

    }
}
