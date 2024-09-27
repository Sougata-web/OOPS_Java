package OOPS_ASSIGNMENT;
//Write a java program to Create an interface specialArithmatic with the function
//all_devisors(int n) which will take an integer as input. Now implement this interface
//in a class which will return all the divisors of the inputted integer value. In main call
//the class object to print all the divisors from main

interface SpecialArithmetic {
    void all_divisors(int n);
}
class DivisorCalculator implements SpecialArithmetic {
    @Override
    public void all_divisors(int n) {
        System.out.print("Divisors of " + n + ": ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

public class qs_14 {
    public static void main(String[] args) {
        DivisorCalculator calculator = new DivisorCalculator();
        int number = 28;
        calculator.all_divisors(number);
    }
}

