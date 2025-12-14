import java.util.Scanner;
class Employeeei {
	private String name;
	private double monthlySalary;
	public Employeeei(String name, double monthlySalary) {
		this.name = name;
		if (monthlySalary > 0) {
			this.monthlySalary = monthlySalary;
		} else {
			this.monthlySalary = 0;
		}
	}
	
	public String GetName() {
		return this.name;
	}
	
	public void GiveRaise(double amount) {
		if (amount > 0) {
			this.monthlySalary += amount;
			System.out.println("Raise applied.");
		} else {
			System.out.println("Invalid amount.");
		}
	}
	
	private double getAnnualSalary() {
		return this.monthlySalary * 12;
	}
	
	public double calculateTax(double taxRate) {
		return getAnnualSalary() * taxRate;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner scannerrra = new Scanner(System.in);
		String Name = scannerrra.nextLine();
		
		double salary = scannerrra.nextDouble();
		double taxRate = scannerrra.nextDouble();
		double raiseAmount = scannerrra.nextDouble();
		
		Employeeei emppi = new Employeeei(Name, salary);
		System.out.println("Tax (Before): " + emppi.calculateTax(taxRate));
		emppi.GiveRaise(raiseAmount);
		System.out.println("Tax (After): " + emppi.calculateTax(taxRate));
		scannerrra.close();
	}
}
