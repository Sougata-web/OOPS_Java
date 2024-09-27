package OOPS_ASSIGNMENT;
//Write a java program to create your own exception that has the ability to handle even
//number exception and exception of having values inserted greater than 2000.

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}


public class qs_17 {


    public static void checkNumber(int number) throws CustomException {
        if (number % 2 == 0) {
            throw new CustomException("Even number exception: " + number + " is even.");
        }
        if (number > 2000) {
            throw new CustomException("Value exception: " + number + " is greater than 2000.");
        }
        System.out.println(number + " is valid.");
    }

    public static void main(String[] args) {
        int[] testNumbers = {1999, 2001, 1500, 1024, 2500};

        for (int number : testNumbers) {
            try {
                checkNumber(number);
            } catch (CustomException e) {
                System.out.println("Caught Exception: " + e.getMessage());
            }
        }
    }
}

