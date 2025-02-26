/*Problem Statement:-
        -> Develop an application to perform banking transactions like money deposit, withdraw, transfer for a customer.
        -> create a BankAccount class with properties: accountNo, accountHolder, accountBalance, accountType
- add the constructors to initialize BankAccount objects differently.
        - create operational methods to perform operations like withdraw, deposit, transfer etc.
public void deposit(long accountNo, doubel amount);
public
void withdraw(long accountNo, double amount);
public void transfer(long fromAccountNo, long toAccountNo, double amt
-> create a Customer class and that is having main method, from where you test the BankAccountl*/
import java.util.*;

import java.util.*;

class BankAccount {
    private long accountNo;
    private String accountHolder;
    private double accountBalance;
    private String accountType;

    public BankAccount(long accountNo, String accountHolder, double accountBalance, String accountType) {
        this.accountNo = accountNo;
        this.accountHolder = accountHolder;
        this.accountBalance = accountBalance;
        this.accountType = accountType;
    }

    public long getAccountNo() {
        return accountNo;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.printf("₹%.2f deposited. Updated Balance: ₹%.2f\n", amount, accountBalance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
            System.out.printf("₹%.2f withdrawn. Remaining Balance: ₹%.2f\n", amount, accountBalance);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    public void transfer(BankAccount toAccount, double amount) {
        if (amount > 0 && amount <= accountBalance) {
            this.withdraw(amount);
            toAccount.deposit(amount);
            System.out.printf("Transferred ₹%.2f from Account %d to Account %d\n", amount, this.accountNo, toAccount.getAccountNo());
        } else {
            System.out.println("Transfer failed! Insufficient balance or invalid amount.");
        }
    }

    public void displayAccountInfo() {
        System.out.printf("Account No: %d | Name: %s | Type: %s | Balance: ₹%.2f\n", accountNo, accountHolder, accountType, accountBalance);
    }
}

public class DAY2_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<BankAccount> accounts = new ArrayList<>();

        accounts.add(new BankAccount(1001, "Alice", 5000, "Savings"));
        accounts.add(new BankAccount(1002, "Bob", 3000, "Current"));

        while (true) {
            System.out.println("\n--- Banking System ---");
            System.out.println("1. Deposit\n2. Withdraw\n3. Transfer\n4. Display Accounts\n5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            if (choice == 5) break;

            switch (choice) {
                case 1:
                    System.out.print("Enter Account No: ");
                    long accNo = sc.nextLong();
                    System.out.print("Enter Amount to Deposit: ");
                    double depositAmount = sc.nextDouble();
                    findAccount(accounts, accNo).deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter Account No: ");
                    accNo = sc.nextLong();
                    System.out.print("Enter Amount to Withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    findAccount(accounts, accNo).withdraw(withdrawAmount);
                    break;

                case 3:
                    System.out.print("Enter Sender Account No: ");
                    long fromAcc = sc.nextLong();
                    System.out.print("Enter Receiver Account No: ");
                    long toAcc = sc.nextLong();
                    System.out.print("Enter Amount to Transfer: ");
                    double transferAmount = sc.nextDouble();
                    BankAccount fromAccount = findAccount(accounts, fromAcc);
                    BankAccount toAccount = findAccount(accounts, toAcc);
                    if (fromAccount != null && toAccount != null) {
                        fromAccount.transfer(toAccount, transferAmount);
                    } else {
                        System.out.println("Invalid account number(s)!");
                    }
                    break;

                case 4:
                    for (BankAccount acc : accounts) {
                        acc.displayAccountInfo();
                    }
                    break;

                default:
                    System.out.println("Invalid option!");
            }
        }

        sc.close();
        System.out.println("--- Thank You for Banking with Us! ---");
    }

    private static BankAccount findAccount(List<BankAccount> accounts, long accNo) {
        for (BankAccount acc : accounts) {
            if (acc.getAccountNo() == accNo) {
                return acc;
            }
        }
        System.out.println("Account not found!");
        return null;
    }
}

