import java.util.Scanner;

class Student {
    String studentId;
    String name;
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String id = sc.nextLine();
        String name = sc.nextLine();

        Student std = new Student();

        std.studentId = id;
        std.name = name;

        System.out.println(std.studentId);
        System.out.println(std.name);

        sc.close();
    }
}