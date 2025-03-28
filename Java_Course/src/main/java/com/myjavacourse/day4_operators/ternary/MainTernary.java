package com.myjavacourse.day4_operators.ternary;

public class MainTernary {
    public static void main(String[] args){
        //condition expression1 and expression 2

        int age = 22;

        System.out.println(age == 22? "Not to old to learn": "to old to learn");

        boolean isRecievedBonus = true;

        String recievedBonus = isRecievedBonus ? "Bonus recieved" : "Bonus not recieved";
        System.out.println("Judens has: " + recievedBonus);
    }
}
