import java.util.Scanner;

class Employee {

    private String name;
    private double monthlySalary;

    // Constructor
    public Employee(String name, double monthlySalary) {
        this.name = name;
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0;
        }
    }

    // Getter
    public String getName() {
        return name;
    }

    // Give raise
    public void giveRaise(double amount) {
        if (amount > 0) {
            monthlySalary += amount;
            System.out.println("Raise applied.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    // Private helper
    private double getAnnualSalary() {
        return monthlySalary * 12;
    }

    // Tax calculation
    public double calculateTax(double taxRate) {
        return getAnnualSalary() * taxRate;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        double monthlySalary = sc.nextDouble();
        double taxRate = sc.nextDouble();
        double raiseAmount = sc.nextDouble();

        Employee emp = new Employee(name, monthlySalary);

        // Before raise
        System.out.println("Tax (Before): " + emp.calculateTax(taxRate));

        // Raise
        emp.giveRaise(raiseAmount);

        // After raise
        System.out.println("Tax (After): " + emp.calculateTax(taxRate));

        sc.close();
    }
}
