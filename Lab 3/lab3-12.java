import java.util.Scanner;

class Employee {

    private String name;
    private double monthlySalary;

    public Employee(String name, double monthlySalary) {
        this.name = name;

        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0;
        }
    }

    public String getName() {
        return this.name;
    }

    public void giveRaise(double amount) {

        if (amount > 0) {
            this.monthlySalary = this.monthlySalary + amount;
            System.out.println("Raise applied.");
        } else {
            System.out.println("Invalid amount.");
        }

    }

    private double getAnnualSalary() {

        double annualSalary;
        annualSalary = this.monthlySalary * 12;
        return annualSalary;

    }

    public double calculateTax(double taxRate) {

        double annualSalary;
        double tax;

        annualSalary = getAnnualSalary();
        tax = annualSalary * taxRate;

        return tax;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name;
        double monthlySalary;
        double taxRate;
        double raiseAmount;

        name = input.nextLine();
        monthlySalary = input.nextDouble();
        taxRate = input.nextDouble();
        raiseAmount = input.nextDouble();

        Employee emp = new Employee(name, monthlySalary);

        System.out.println("Tax (Before): " + emp.calculateTax(taxRate));

        emp.giveRaise(raiseAmount);

        System.out.println("Tax (After): " + emp.calculateTax(taxRate));

        input.close();
    }
}
