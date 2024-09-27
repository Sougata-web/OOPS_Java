package OOPS_ASSIGNMENT;

import java.util.Scanner;

//Write a java program to find the largest among four numbers using ternary operator.
public class qs_05 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int num1, num2, num3 ,num4;
        System.out.print("Enter the first number: ");
         num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
         num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        num3 = scanner.nextInt();

        System.out.print("Enter the fourth number: ");
        num4 = scanner.nextInt();




        int largest = (num1 > num2) ?
                (num1 > num3 ?
                        (num1 > num4 ? num1 : num4)
                        : (num3 > num4 ? num3 : num4))
                : (num2 > num3 ?
                (num2 > num4 ? num2 : num4)
                : (num3 > num4 ? num3 : num4));

        System.out.println("The largest among them is: "+largest);


    }
}
