package OOPS_ASSIGNMENT;
import java.util.Scanner;
//Write a java program to print the maximum between right diagonal and left diagonal
//sum of a square matrix.
public class qs_08 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int size,rdl=0, ldl=0;
        System.out.println("Enter the size of the array: ");
        size=scanner.nextInt();
        int arr[][]= new int[size][size];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                arr[i][j]=scanner.nextInt();
            }
        }
        for(int i=0;i<size;i++){
            ldl +=arr[i][i];
            rdl+=arr[i][size-(i+1)];
        }
        System.out.println("The maximum between two diagonals is: "+ Math.max(rdl,ldl));
    }
}
