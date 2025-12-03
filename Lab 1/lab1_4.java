import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int score = Integer.parseInt(reader.nextLine().trim());
        String grade;
        if (score >= 80) {
            grade = "A";
        } else if (score >= 70) {
            grade = "B";
        } else if (score >= 60) {
            grade = "C";
        } else if (score >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println(grade);
        reader.close();
    }
}
