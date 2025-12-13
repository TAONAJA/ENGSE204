import java.util.Scanner;

class BankAccount {
    private double balance;   // ป้องกันการแก้ไขโดยตรง

    // Constructor
    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    // Getter
    public double getBalance() {
        return balance;
    }

    // ฝากเงิน
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // ถอนเงิน
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double initialBalance = sc.nextDouble();
        double depositAmount = sc.nextDouble();
        double withdrawAmount = sc.nextDouble();

        BankAccount account = new BankAccount(initialBalance);

        account.deposit(depositAmount);
        account.withdraw(withdrawAmount);

        System.out.println("Final Balance: " + account.getBalance());
    }
}
