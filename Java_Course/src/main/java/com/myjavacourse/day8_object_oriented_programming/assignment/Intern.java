package com.myjavacourse.day8_object_oriented_programming.assignment;

public class Intern  implements Trainable{

//    double bonus;
    private  int id;
    private String name;
    private double basedSalary;
    private double bonus;

    public Intern(int id, String name, double basedSalary, double bonus) {
        this.id = id;
        this.name = name;
        this.basedSalary = basedSalary;
        this.bonus = bonus;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return id;
    }


    @Override
    public boolean isAttending() {
       return false;
    }

    @Override
    public double basedSalary() {
        return basedSalary;
    }

    @Override
    public double calculateSalary() {
        return basedSalary +=(basedSalary * bonus) ;
    }

    @Override
    public void displayInfo() {
        Trainable.super.displayInfo();
    }
}
