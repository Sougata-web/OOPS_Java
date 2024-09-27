package OOPS_ASSIGNMENT;
//Write a java program to calculate the sum of two integer numbers.

import java.util.Scanner;

public class qs_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the value of first integer: ");
        a=scanner.nextInt();
        System.out.println("Enter the value of second integer: ");
        b=scanner.nextInt();
        System.out.println("Sum of that two numbers is: "+(a+b));
        scanner.close();
    }
}
