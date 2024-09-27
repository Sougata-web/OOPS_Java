package OOPS_ASSIGNMENT;
//Write a java program to print the following pattern
//1
//2 4
//3 9 27
//4 16 64 256

import java.util.Scanner;

public class qs_09 {
    public static void main(String[] args) {
        int size =4;
        for(int i=1;i<=size;i++){
            for(int j=1;j<=i;j++){
                System.out.print((int)Math.pow(i,j)+" ");
            }
            System.out.println();
        }
    }
}
