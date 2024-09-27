package OOPS_ASSIGNMENT;
//Write a java program to create a class calculator to do addition, subtraction, and
//multiplication of N numbers inputted by the user.
import java.util.Scanner;
public class qs_12 {
    public static int add(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
    public static double add(double... numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum;
    }
    public static int subtract(int... numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }
        return result;
    }
    public static double subtract(double... numbers) {
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }
        return result;
    }
    public static int multiply(int... numbers) {
        int result = 1;
        for (int num : numbers) {
            result *= num;
        }
        return result;
    }
    public static double multiply(double... numbers) {
        double result = 1;
        for (double num : numbers) {
            result *= num;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Integer Addition");
            System.out.println("2. Integer Subtraction");
            System.out.println("3. Integer Multiplication");
            System.out.println("4. Double Addition");
            System.out.println("5. Double Subtraction");
            System.out.println("6. Double Multiplication");
            System.out.println("7. Exit");
            System.out.print("Enter your choice (1-7): ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter how many integers you want to input: ");
                    int n = input.nextInt();
                    int[] intNumbersAdd = new int[n];
                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter integer " + (i + 1) + ": ");
                        intNumbersAdd[i] = input.nextInt();
                    }
                    System.out.println("Integer Addition: " + add(intNumbersAdd));
                    break;
                case 2:
                    System.out.print("Enter how many integers you want to input: ");
                    int m = input.nextInt();
                    int[] intNumbersSub = new int[m];
                    for (int i = 0; i < m; i++) {
                        System.out.print("Enter integer " + (i + 1) + ": ");
                        intNumbersSub[i] = input.nextInt();
                    }
                    System.out.println("Integer Subtraction: " + subtract(intNumbersSub));
                    break;
                case 3:
                    System.out.print("Enter how many integers you want to input: ");
                    int p = input.nextInt();
                    int[] intNumbersMul = new int[p];
                    for (int i = 0; i < p; i++) {
                        System.out.print("Enter integer " + (i + 1) + ": ");
                        intNumbersMul[i] = input.nextInt();
                    }
                    System.out.println("Integer Multiplication: " + multiply(intNumbersMul));
                    break;
                case 4:
                    System.out.print("Enter how many doubles you want to input: ");
                    int q = input.nextInt();
                    double[] doubleNumbersAdd = new double[q];
                    for (int i = 0; i < q; i++) {
                        System.out.print("Enter double " + (i + 1) + ": ");
                        doubleNumbersAdd[i] = input.nextDouble();
                    }
                    System.out.println("Double Addition: " + add(doubleNumbersAdd));
                    break;
                case 5:
                    System.out.print("Enter how many doubles you want to input: ");
                    int r = input.nextInt();
                    double[] doubleNumbersSub = new double[r];
                    for (int i = 0; i < r; i++) {
                        System.out.print("Enter double " + (i + 1) + ": ");
                        doubleNumbersSub[i] = input.nextDouble();
                    }
                    System.out.println("Double Subtraction: " + subtract(doubleNumbersSub));
                    break;
                case 6:
                    System.out.print("Enter how many doubles you want to input: ");
                    int s = input.nextInt();
                    double[] doubleNumbersMul = new double[s];
                    for (int i = 0; i < s; i++) {
                        System.out.print("Enter double " + (i + 1) + ": ");
                        doubleNumbersMul[i] = input.nextDouble();
                    }
                    System.out.println("Double Multiplication: " + multiply(doubleNumbersMul));
                    break;
                case 7:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);
        input.close();
    }
}

