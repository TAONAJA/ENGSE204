import java.util.Scanner;
class Userrname {
	private String username;
	private int failedAttempts;
	private boolean isLocked;
	private static int maxAttempts = 3;
	public Userrname(String username) {
		this.username = username;
		this.failedAttempts = 0;
		this.isLocked = false;
	}
	
	public String getUsernameeiei() {
		return this.username;
	}
	
	public boolean isLoockeddi() {
		return this.isLocked;
	}
	
	public int getFailedAttemptssi() {
		return this.failedAttempts;
	}
	public static void setPolicyyi(int max) {
		if (max > 0) {
			maxAttempts = max;
			System.out.println("Policy updated.");
		} else {
			System.out.println("Invalid policy.");
		}
	}
	public void login(String password) {
		if (isLocked) {
			System.out.println("Account is locked.");
		} else {
			if (password.equals("pass123")) {
				failedAttempts = 0;
				System.out.println("Login successful.");
			} else {
				failedAttempts++;
				if (failedAttempts >= maxAttempts) {
					isLocked = true;
					System.out.println("Login failed. Account locked.");
				} else {
					int left = maxAttempts - failedAttempts;
					System.out.println("Login failed. " + left + " attempts left.");
				}
			}
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner scannerrt = new Scanner(System.in);
		String username = scannerrt.next();
		Userrname user = new Userrname(username);
		if (scannerrt.hasNextInt()) {
			int N = scannerrt.nextInt();
			for (int i = 0; i < N; i++) {
				String command = scannerrt.next();
				if (command.equals("SET_POLICY")) {
					int max = scannerrt.nextInt();
					Userrname.setPolicyyi(max);
				} else if (command.equals("LOGIN")) {
					String password = scannerrt.next();
					user.login(password);
				}
			}
		}
		scannerrt.close();
	}
}
