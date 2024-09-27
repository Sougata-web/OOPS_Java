package OOPS_ASSIGNMENT;
//Write a java program to find the total sum of all array elements.

import java.util.Scanner;

public class qs_06 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int sum=0;
        int []arr= new int[size];
        for (int i=0;i<size;i++){
            System.out.print("Enter the "+(i+1)+" element of the array: ");
            arr[i]=scanner.nextInt();
        }
        for(int i: arr){
            sum+=i;
        }
        System.out.println("The sum of all array elements: "+sum);
    }
}
