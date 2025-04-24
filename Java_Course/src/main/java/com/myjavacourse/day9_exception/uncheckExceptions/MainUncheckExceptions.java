package com.myjavacourse.day9_exception.uncheckExceptions;

public class MainUncheckExceptions {
    public static void main(String[] args) {
        try {
            String name = null;
            System.out.println(name.length());
        }catch (NullPointerException e){
            System.out.println("Caught error " + e.getMessage());
        }

        try {
            int[] arr = new int[5];
            System.out.println(arr[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Caught the error " + e.getMessage());
        }
//        int[] arr = new int[5];
//        arr[0] = 1;
//        arr[1] = 2;
//        arr[2] = 3;
//        arr[3] = 4;
//        arr[4] = 5;
//        arr[5] = 6;
//        System.out.println(arr[5]);

    }
}
