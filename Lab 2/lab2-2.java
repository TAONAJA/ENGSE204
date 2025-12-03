import java.util.Scanner;

class Student {
    String studentId;
    String name;

    void displayInfo() {
        System.out.println(studentId);
        System.out.println(name);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String id = sc.nextLine();
        String name = sc.nextLine();

        Student std = new Student();

        std.studentId = id;
        std.name = name;

        std.displayInfo();

        sc.close();
    }
}