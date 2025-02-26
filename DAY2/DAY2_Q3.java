/*Problem Statement:-
        ---Welcome to ABC bank-------
        1. open an account
        create account object
        display account details
        2. deposit
        - howmuch to deposit
        display account details
        3. withdraw
        - howmuch to withdraw
        verify funds available or not
        - display account details
        4. transfer
        to which account to transfe
        verify funds availability
        do transfer, if funds availa
        display account details
        5. check balance
        6. exit*/

import java.util.Scanner;

class BankAccount { // Renamed correctly
    private long accountNo;
    private String accountHolder;
    private double balance;

    BankAccount(long accountNo, String accountHolder, double balance) {
        this.accountNo = accountNo;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited. New Balance: ₹" + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn. Remaining Balance: ₹" + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    void transfer(BankAccount toAccount, double amount) { // Now consistent
        if (amount > 0 && amount <= balance) {
            this.withdraw(amount);
            toAccount.deposit(amount);
            System.out.println("₹" + amount + " transferred to " + toAccount.accountHolder);
        } else {
            System.out.println("Transfer failed! Check balance.");
        }
    }

    void display() {
        System.out.println("\nAccount Holder: " + accountHolder);
        System.out.println("Account No: " + accountNo);
        System.out.println("Balance: ₹" + balance);
    }

    long getAccountNo() {
        return accountNo;
    }
}

public class DAY2_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account1 = null, account2 = null;

        System.out.println("--- Welcome to ABC Bank ---");

        while (true) {
            System.out.println("\n1. Open an Account  2. Deposit  3. Withdraw  4. Transfer  5. Check Balance  6. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            if (choice == 6) {
                System.out.println("Thank you for banking with us!");
                break;
            }

            if (choice == 1) {
                if (account1 == null) {
                    System.out.print("Enter Account No: ");
                    long accNo = sc.nextLong();
                    System.out.print("Enter Account Holder Name: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.print("Enter Initial Balance: ");
                    double balance = sc.nextDouble();
                    account1 = new BankAccount(accNo, name, balance);
                    System.out.println("Account created successfully!");
                } else if (account2 == null) {
                    System.out.print("Enter Account No: ");
                    long accNo = sc.nextLong();
                    System.out.print("Enter Account Holder Name: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.print("Enter Initial Balance: ");
                    double balance = sc.nextDouble();
                    account2 = new BankAccount(accNo, name, balance);
                    System.out.println("Account created successfully!");
                } else {
                    System.out.println("Only 2 accounts can be created in this system.");
                }
            }

            else if (choice == 2) {
                System.out.print("Enter Account No: ");
                long accNo = sc.nextLong();
                System.out.print("Enter Amount to Deposit: ");
                double depAmount = sc.nextDouble();
                if (account1 != null && account1.getAccountNo() == accNo) {
                    account1.deposit(depAmount);
                } else if (account2 != null && account2.getAccountNo() == accNo) {
                    account2.deposit(depAmount);
                } else {
                    System.out.println("Account not found!");
                }
            }

            else if (choice == 3) {
                System.out.print("Enter Account No: ");
                long accNo = sc.nextLong();
                System.out.print("Enter Amount to Withdraw: ");
                double withAmount = sc.nextDouble();
                if (account1 != null && account1.getAccountNo() == accNo) {
                    account1.withdraw(withAmount);
                } else if (account2 != null && account2.getAccountNo() == accNo) {
                    account2.withdraw(withAmount);
                } else {
                    System.out.println("Account not found!");
                }
            }

            else if (choice == 4) {
                if (account1 == null || account2 == null) {
                    System.out.println("Both accounts must be created to transfer funds!");
                    continue;
                }
                System.out.print("Enter Sender Account No: ");
                long fromAcc = sc.nextLong();
                System.out.print("Enter Receiver Account No: ");
                long toAcc = sc.nextLong();
                System.out.print("Enter Amount to Transfer: ");
                double transAmount = sc.nextDouble();
                if (fromAcc == account1.getAccountNo() && toAcc == account2.getAccountNo()) {
                    account1.transfer(account2, transAmount);
                } else if (fromAcc == account2.getAccountNo() && toAcc == account1.getAccountNo()) {
                    account2.transfer(account1, transAmount);
                } else {
                    System.out.println("Invalid account numbers!");
                }
            }

            else if (choice == 5) {
                System.out.print("Enter Account No: ");
                long accNo = sc.nextLong();
                if (account1 != null && account1.getAccountNo() == accNo) {
                    account1.display();
                } else if (account2 != null && account2.getAccountNo() == accNo) {
                    account2.display();
                } else {
                    System.out.println("Account not found!");
                }
            }

            else {
                System.out.println("Invalid choice! Try again.");
            }
        }

        sc.close();
    }
}
