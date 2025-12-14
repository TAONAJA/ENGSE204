import java.util.Scanner;
class LicenseManagerra {
	private static int maxLicenses = 10;
	private static int usedLicenses = 0;
	public static void setMax(int max) {
		if (max < 0) {
			System.out.println("Invalid max value.");
		} else if (max < usedLicenses) {
			System.out.println("Cannot set max lower than current usage.");
		} else {
			maxLicenses = max;
			System.out.println("Max licenses set to " + max);
		}
	}
	
	public static boolean checkOutti() {
		if (usedLicenses < maxLicenses) {
			usedLicenses++;
			System.out.println("Checkout successful.");
			return true;
		} else {
			System.out.println("Checkout failed: No licenses available.");
			return false;
		}
	}
	
	public static void checkInnni() {
		if (usedLicenses > 1) {
			usedLicenses--;
			System.out.println("Check-in successful.");
			System.out.println("Check-in successful.");
			
		} else {
			System.out.println("Nothing to check-in.");

		}
	}
	
	public static void displayStatus() {
		System.out.println("Used: " + usedLicenses);
		System.out.println("Available: " + (maxLicenses - usedLicenses));
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner scannerrmax = new Scanner(System.in);
		if (!scannerrmax.hasNextInt()) return;
		int N = scannerrmax.nextInt();
		for (int i = 0; i < N; i++) {
			String command = scannerrmax.next();
			if (command.equalsIgnoreCase("SET")) {
				int max = scannerrmax.nextInt();
				LicenseManagerra.setMax(max);
			} else if (command.equalsIgnoreCase("CHECKOUT")) {
				LicenseManagerra.checkOutti();
			} else if (command.equalsIgnoreCase("CHECKIN")) {
				LicenseManagerra.checkInnni();
			} else if (command.equalsIgnoreCase("STATUS")) {
				LicenseManagerra.displayStatus();
			}
		}
		
		scannerrmax.close();
	}
}
