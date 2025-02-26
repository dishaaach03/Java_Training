/*Problem statement:- (application to make use of static, non-static, constructors)
        -> Assume that as a developer you need develop an application for an ABC bank to provide bank account for their customers.
Each account should have the details like: acntNo, holderName, amount, ageOfHolder, rateOfInterest, bankName, accountStatus
create a business method that can generate N no.of account objects and return as an array, based on request for N accounts.
Points to consider:-
        1. every account will have same bankName.
        2. rateOfInterest for each account is based on age of account holder.
16>age<25 :: 2 percent ROI
25>age<50:: 3 percent ROI
age>50 :: 4 percent ROI*/

import java.util.Scanner;

class BankAccount {
    private static final String BANK_NAME = "ABC Bank";
    private long accountNo;
    private String holderName;
    private double amount;
    private int ageOfHolder;
    private double rateOfInterest;
    private String accountStatus;

    public BankAccount(long accountNo, String holderName, double amount, int ageOfHolder, String accountStatus) {
        this.accountNo = accountNo;
        this.holderName = holderName;
        this.amount = amount;
        this.ageOfHolder = ageOfHolder;
        this.accountStatus = accountStatus;
        this.rateOfInterest = calculateInterest(ageOfHolder);
    }

    private double calculateInterest(int age) {
        if (age > 16 && age < 25) return 2.0;
        else if (age >= 25 && age < 50) return 3.0;
        else if (age >= 50) return 4.0;
        else return 0.0;
    }

    public void displayDetails() {
        System.out.println("\nAccount No: " + accountNo);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Bank Name: " + BANK_NAME);
        System.out.println("Balance: ₹" + amount);
        System.out.println("Age of Holder: " + ageOfHolder);
        System.out.println("Rate of Interest: " + rateOfInterest + "%");
        System.out.println("Account Status: " + accountStatus);
    }

    public static BankAccount[] createAccounts(int n) {
        Scanner sc = new Scanner(System.in);
        BankAccount[] accounts = new BankAccount[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Account " + (i + 1) + ":");
            System.out.print("Enter Account Number: ");
            long accNo = sc.nextLong();
            System.out.print("Enter Holder Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Enter Initial Deposit Amount: ");
            double balance = sc.nextDouble();
            System.out.print("Enter Age of Holder: ");
            int age = sc.nextInt();
            System.out.print("Enter Account Status (Active/Inactive): ");
            sc.nextLine();
            String status = sc.nextLine();
            accounts[i] = new BankAccount(accNo, name, balance, age, status);
        }
        return accounts;
    }
}

public class DAY3_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of accounts to create: ");
        int n = sc.nextInt();
        BankAccount[] accounts = BankAccount.createAccounts(n);
        System.out.println("\nAccount Details:");
        for (BankAccount acc : accounts) {
            acc.displayDetails();
        }
        sc.close();
    }
}
