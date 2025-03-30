package com.myjavacourse.day5_control_flow.loopStatement;

public class MainDoWhile {
    public static void main(String[] args) {
        // do first -> check validation

        int trainingModule = 5;

        System.out.println("Training Module");
        do {
            trainingModule++;
            System.out.println("Completed module: " + trainingModule);
//            trainingModule++;
        } while (trainingModule < 10);
            System.out.println("All required module has been completed");
    }
}
