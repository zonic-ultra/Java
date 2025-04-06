package com.myjavacourse.day8_object_oriented_programming.inheritance.inheritance01;

public class MainInheritance {
    public static void main(String[] args) {
        superClass father = new superClass("Judens","Bandal", "male", 25);
        subClass son = new subClass("Odent","Bandal", "male", 12,"Dancing");
        kidClass kid = new kidClass("Denie","Bandal","famale", 9, "Singing",2 );

        //inherit
        System.out.println(".........Super Class.........");
        System.out.println("Son inherit the father");
        father.checkStatus();

        System.out.println();
        System.out.println(".........Sub Class.........");
        son.checkStatus();

        System.out.println();
        System.out.println(".......End / Kid Class.......");
        kid.checkStatus();


        //father can't inherit son's talent
        System.out.println("\n father can't inherit son's talent");
        son.talent();
//        father.drink();

        //son inherit father's face
        System.out.println("\n son inherit father's characteristic");
        son.characteristic();
        father.characteristic();

    }
}
