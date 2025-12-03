import java.util.Scanner;
class Student {
    private String name;
    private int midtermScore;
    private int finalScore;
    public Student(String name, int midtermScore, int finalScore) {
        this.name = name;
        this.midtermScore = midtermScore;
        this.finalScore = finalScore;
    }ย
    public double calculateAverage() {
        return (this.midtermScore + this.finalScore) / 2.0; 
    }
    public void displaySummary() {
        double average = calculateAverage();
        String status;
        if (average >= 50.0) {
            status = "Pass";
        } else {
            status = "Fail";
        }
        System.out.println("Name: " + this.name);
        System.out.println("Average Score: " + String.format("%.1f", average)); 
        System.out.println("Status: " + status);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String studentName = scanner.nextLine();
        int midterm = scanner.nextInt();
        int finalS = scanner.nextInt();
        
        scanner.close();
        Student student = new Student(studentName, midterm, finalS);
        student.displaySummary();
    }
}