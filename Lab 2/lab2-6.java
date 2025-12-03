import java.util.Scanner;

class BankAccount {
    private String ownerName;
    private double balance;
    public BankAccount(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        this.balance += amount;
    }
    public void displaySummary() {
        System.out.println("Owner: " + this.ownerName);
        System.out.println("Balance: " + String.format("%.1f", this.balance));
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String owner = scanner.nextLine(); 
        double initialBalance = scanner.nextDouble();
        double depositAmount = scanner.nextDouble();
        scanner.close();
        BankAccount account = new BankAccount(owner, initialBalance);
        account.deposit(depositAmount);
        account.displaySummary();
    }
}