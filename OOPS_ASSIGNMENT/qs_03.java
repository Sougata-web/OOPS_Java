package OOPS_ASSIGNMENT;
//Write a java program to find area and perimeter of a rectangle.

import java.util.Scanner;

public class qs_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double len,wid;
        System.out.println("Enter the length of the rectangle: ");
        len=sc.nextDouble();
        System.out.println("Enter the width of the rectangle: ");
        wid=sc.nextDouble();
        System.out.println("The area of that rectangle is: "+(len*wid));
        System.out.println("The perimeter of that rectangle is: "+ 2*(len+wid));
    }
}
