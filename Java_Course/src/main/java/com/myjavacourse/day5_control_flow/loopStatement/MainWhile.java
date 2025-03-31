package com.myjavacourse.day5_control_flow.loopStatement;

public class MainWhile {
    public static void main(String[] args) {

        //check the validation before running the application
        int yearsOfService = 4;
        int performanceRating = 8;
        boolean isPromotionEligible = false;
        boolean isValid = false;
        String employeeID = "987654321012";
//        int lastFourDigits = (int) (employeeID % 10000);
        String lastFourDigits = employeeID.substring(employeeID.length() - 4);

//        long employeeID1 = 21242421l;

        //        4.  (while loop): Validates the last 4 digits of an employee's ID.

        while (!isPromotionEligible){
            if (yearsOfService >= 10 || (yearsOfService>=5 && performanceRating >=6)){
                isPromotionEligible = true;
                System.out.println("Employee is eligible for promotion");
            }else {
                yearsOfService++;
                System.out.println("Years of service: "+ yearsOfService);
            }
        }
        while (!isValid){
            if (employeeID.length() < 4){
                isValid = true;
                System.out.println("Employee ID " + employeeID + " is valid");
            }
        }


//        while (lastFourDigits != 1) {
//            System.out.println("Employee ID " + employeeID + " is valid.");
//            break;
//        }
//        4.  (while loop): Validates the last 4 digits of an employee's ID.
//        Task 4: Employee ID Validation
//        Employee ID 987654321012 is valid.
    }
}
