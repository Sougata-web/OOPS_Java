package OOPS_ASSIGNMENT;

/*Write a java program to Create a package Banking under this create a class
BankAccount having minimum balance, account holder name, etc. as member
variables with interest rate as member function. You may add more functions if
required. Now create two child classes SavingsAccount and FixedDepositAccount of
the BankAccount class. Interest rate of SavingsAccount and FixedDepositAccount
should be different. Now in main create atleast one SavingsAccount and one
FixedDepositAccount of yours. Add money to those accounts; calculate the interest of
these accounts after five years; also credit and debit money from the SavingsAccount
with some transactions.*/

import java.util.Scanner;
//package Banking;

class BankAccount {
    protected String accountHolderName;
    protected double balance;
    protected double interestRate;
    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }
    public double calculateInterest(int years) {
        return balance * interestRate * years;
    }
    public double getBalance() {
        return balance;
    }
    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: $" + balance);
        System.out.println("Interest Rate: " + (interestRate * 100) + "%");
    }
}
class SavingsAccount extends BankAccount {
    private final double SAVINGS_INTEREST_RATE = 0.04; // 4% interest rate

    public SavingsAccount(String accountHolderName, double initialBalance) {
        super(accountHolderName, initialBalance);
        this.interestRate = SAVINGS_INTEREST_RATE;
    }
    public void credit(double amount) {
        balance += amount;
        System.out.println("Credited $" + amount + " to Savings Account.");
    }
    public void debit(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Debited $" + amount + " from Savings Account.");
        } else {
            System.out.println("Insufficient funds for debit.");
        }
    }
}


class FixedDepositAccount extends BankAccount {
    private final double FD_INTEREST_RATE = 0.06;

    public FixedDepositAccount(String accountHolderName, double initialBalance) {
        super(accountHolderName, initialBalance);
        this.interestRate = FD_INTEREST_RATE;
    }
}


public class qs_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SavingsAccount mySavings = new SavingsAccount("John Doe", 0);
        FixedDepositAccount myFixedDeposit = new FixedDepositAccount("John Doe", 0);

        int choice;
        do {
            System.out.println("\n===== Banking System Menu =====");
            System.out.println("1. Credit money to Savings Account");
            System.out.println("2. Debit money from Savings Account");
            System.out.println("3. Display Savings Account details");
            System.out.println("4. Display Fixed Deposit Account details");
            System.out.println("5. Calculate Interest (5 years)");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to credit: ");
                    double creditAmount = scanner.nextDouble();
                    mySavings.credit(creditAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to debit: ");
                    double debitAmount = scanner.nextDouble();
                    mySavings.debit(debitAmount);
                    break;

                case 3:
                    mySavings.displayAccountDetails();
                    break;

                case 4:
                    myFixedDeposit.displayAccountDetails();
                    break;

                case 5:
                    double savingsInterest = mySavings.calculateInterest(5);
                    double fdInterest = myFixedDeposit.calculateInterest(5);
                    System.out.println("Savings Account Interest after 5 years: $" + savingsInterest);
                    System.out.println("Fixed Deposit Account Interest after 5 years: $" + fdInterest);
                    break;

                case 6:
                    System.out.println("Exiting the Banking System...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        } while (choice != 6);

        scanner.close();
    }
}
