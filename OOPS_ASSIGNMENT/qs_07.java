package OOPS_ASSIGNMENT;
//Write a java program to search a specific element in an array

import java.util.Scanner;
import java.util.Arrays;

public class qs_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  elem, size;
        System.out.println("Enter the size of the array: ");
        size= scanner.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the "+(i+1)+" element in the array: ");
            arr[i]= scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Enter the element you want to find: ");
        elem=scanner.nextInt();
        int res = Arrays.binarySearch(arr, elem);

        if (res >= 0)
            System.out.println(
                    elem + " found at index = " + res);
        else
            System.out.println(elem + " Not found");
    }
}
