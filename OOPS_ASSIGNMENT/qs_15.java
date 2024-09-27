package OOPS_ASSIGNMENT;
//Write a java program to handle divide by zero, array index out of bound and null
//pointer exception in a same class with different try catch.

public class qs_15 {
    public static void main(String[] args) {
        try {
            int numerator = 10;
            int denominator = 0;
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
        try {
            int[] numbers = {1, 2, 3};
            System.out.println("Accessing element at index 5: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        }
        try {
            String str = null;
            System.out.println("String length: " + str.length());
        } catch (NullPointerException e) {
            System.out.println("Error: Cannot call method on a null object.");
        }
    }
}

