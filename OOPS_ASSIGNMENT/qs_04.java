package OOPS_ASSIGNMENT;
import java.util.Scanner;
//Write a java program to find the grade of total marks entered by an user using the
//following table.
//Marks Grade
//95-100 O
//85-94 A+
//75-84 A
//60-74 B
//50-59 C
//40-49 D
//<40 F
public class qs_04 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        float marks;
        System.out.println("Enter the mark to get the grade: ");
        marks= scanner.nextFloat();
        if(marks >= 95 && marks <= 100){
            System.out.println("O");
        }else if(marks>=85 && marks<=94){
            System.out.println("A+");
        }else if(marks>=75 && marks<=84){
            System.out.println("A");
        }else if(marks>=60 && marks<=74){
            System.out.println("B");
        }else if(marks>=50 && marks<=59){
            System.out.println("C");
        }else if(marks>=40 && marks<=49){
            System.out.println("D");
        }else if(marks <40){
            System.out.println("F");
        }
    }
}
