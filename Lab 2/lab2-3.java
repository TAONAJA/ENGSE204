import java.util.Scanner;

class Student {
    private String studentId;
    private String name;

    public static int studentCount = 0;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;

        Student.studentCount++;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < N; i++) {
            String id = scanner.nextLine(); 
            String studentName = scanner.nextLine(); 
            Student newStudent = new Student(id, studentName);
        }

        System.out.println(Student.studentCount);
        
        scanner.close();
    }
}