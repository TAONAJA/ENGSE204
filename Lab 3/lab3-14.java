import java.util.Scanner;
class BankAccountt {
	private double balance;
	private static int totalTransactionCount = 0;
	public BankAccountt(double initialDeposit) {
		if (initialDeposit >= 0) {
			this.balance = initialDeposit;
		} else {
			this.balance = 0;
		}
		System.out.println("Account created.");
	}
	
	public double getBalancee() {
		return this.balance;
	}
	
	public void depositti(double amount) {
		if (amount > 0) {
			this.balance += amount;
			totalTransactionCount++;
			System.out.println("Deposit successful.");
		} else {
			System.out.println("Invalid amount.");
		}
	}
	
	public void withdraww(double amount) {
		if (amount > 0 && amount <= this.balance) {
			this.balance -= amount;
			totalTransactionCount++;
			System.out.println("Withdrawal successful.");
		} else if (amount > this.balance) {
			System.out.println("Insufficient funds.");
		} else {
			System.out.println("Invalid amount.");
		}
	}
	
	public static int getTotalTransactionCountti() {
		return totalTransactionCount;
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner scannerrrz = new Scanner(System.in);
		BankAccountt myAccount = null;
		if (!scannerrrz.hasNextInt()) {
			scannerrrz.close();
			return; 
		}
		int N = scannerrrz.nextInt();
		for (int i = 0; i < N; i++) {
			String command = scannerrrz.next();
			if (command.equalsIgnoreCase("CREATE")) {
				double initialDeposit = scannerrrz.nextDouble();
				myAccount = new BankAccountt(initialDeposit);
			} else if (command.equalsIgnoreCase("DEPOSIT")) {
				double amount = scannerrrz.nextDouble();
				if (myAccount != null) {
					myAccount.depositti(amount);
				} else {
					System.out.println("No account exists.");
				}	
			} else if (command.equalsIgnoreCase("WITHDRAW")) {
				double amount = scannerrrz.nextDouble(); 
				if (myAccount != null) {
					myAccount.withdraww(amount);
				} else {
					System.out.println("No account exists.");
				}
			} else if (command.equalsIgnoreCase("STATUS")) {
				if (myAccount != null) {
					System.out.println("Balance: " + myAccount.getBalancee());
				} else {
					System.out.println("No account exists.");
				}
			} else if (command.equalsIgnoreCase("GLOBAL_STATUS")) {
				System.out.println("Total Transactions: " + BankAccountt.getTotalTransactionCountti());
			}
		}
		scannerrrz.close();
	}
}
