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

    // Give raise with logic
    public void giveRaise(double amount) {
        if (amount > 0) {
            monthlySalary += amount;
            System.out.println("Raise applied.");
        } else {
            System.out.println("Invalid raise amount.");
        }
    }

    // Private helper method
    private double getAnnualSalary() {
        return monthlySalary * 12;
    }

    // Public interface for tax calculation
    public double calculateTax(double taxRate) {
        return getAnnualSalary() * taxRate;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // รับข้อมูล 4 บรรทัด
        String name = sc.nextLine();
        double monthlySalary = sc.nextDouble();
        double taxRate = sc.nextDouble();
        double raiseAmount = sc.nextDouble();

        // สร้างอ็อบเจ็กต์ Employee
        Employee emp = new Employee(name, monthlySalary);

        // แสดง Tax ก่อนขึ้นเงินเดือน
        System.out.println("Tax (Before): " + emp.calculateTax(taxRate));

        // เพิ่มเงินเดือน
        emp.giveRaise(raiseAmount);

        // แสดง Tax หลังขึ้นเงินเดือน
        System.out.println("Tax (After): " + emp.calculateTax(taxRate));

        sc.close();
    }
}
