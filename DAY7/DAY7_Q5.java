import java.util.Scanner;

class Account {
    private String accountNumber;
    private int balance;

    // Constructor
    public Account(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter and Setter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter for balance
    public int getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(int transactionAmount) {
        balance += transactionAmount;
        System.out.println("Your balance after the transaction is: " + balance);
    }

    // Withdraw method
    public void withdraw(int transactionAmount) {
        if (transactionAmount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= transactionAmount;
        }
        System.out.println("Your balance after the transaction is: " + balance);
    }
}

public class BankTransaction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Account Number");
        String accountNumber = scanner.nextLine();

        System.out.println("Enter the Account Balance");
        int balance = scanner.nextInt();

        Account account = new Account(accountNumber, balance);

        System.out.println("Enter 1 to deposit an amount, 2 to withdraw an amount");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Enter the amount to deposit");
            int amount = scanner.nextInt();
            account.deposit(amount);
        } else if (choice == 2) {
            System.out.println("Enter the amount to withdraw");
            int amount = scanner.nextInt();
            account.withdraw(amount);
        } else {
            System.out.println("Invalid choice");
        }

        scanner.close();
    }
}
