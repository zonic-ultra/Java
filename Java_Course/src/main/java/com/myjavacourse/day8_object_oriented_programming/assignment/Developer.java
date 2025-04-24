package com.myjavacourse.day8_object_oriented_programming.assignment;

public class Developer implements Trainable{
    private double techBonus = 500;
    private int id;
    private String name;
    private double basedSalary;


    public Developer(int id, String name, double basedSalary,double techBonus) {
        this.techBonus = techBonus;
        this.id = id;
        this.name = name;
        this.basedSalary = basedSalary;
    }

    @Override
    public double calculateSalary() {
        return basedSalary + techBonus;
    }

    @Override
    public void displayInfo() {
        Trainable.super.displayInfo();
        System.out.println("Tech bonus: " + techBonus);
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
        return true;
    }

    @Override
    public double basedSalary() {
        return basedSalary;
    }
}
