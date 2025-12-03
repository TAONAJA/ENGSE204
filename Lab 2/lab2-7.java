import java.util.Scanner;
class BankAccount {
    private String ownerName;
    private double balance;
    public BankAccount(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }
    public void withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }
    public void displayBalance() {
        System.out.println("Balance: " + String.format("%.1f", this.balance));
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String owner = scanner.nextLine();
        double initialBalance = scanner.nextDouble();
        double withdrawal1 = scanner.nextDouble();
        double withdrawal2 = scanner.nextDouble();
        scanner.close();
        BankAccount account = new BankAccount(owner, initialBalance);
        account.withdraw(withdrawal1);
        account.withdraw(withdrawal2);
        account.displayBalance();
    }
}