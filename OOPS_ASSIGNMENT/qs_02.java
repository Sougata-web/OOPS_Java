package OOPS_ASSIGNMENT;

import java.util.Scanner;
//Write a java program to convert temperature from Celsius to Fahrenheit.
public class qs_02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float c,f;
        System.out.println("Enter the celsius temperature: ");
        c=sc.nextFloat();
        f=c*1.8f+32;
        System.out.println("That temperature in fahrenheit is: "+f);
        sc.close();
    }
}
