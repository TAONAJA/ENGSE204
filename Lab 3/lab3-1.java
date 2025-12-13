class User {
    private String username;  // Attribute แบบ private

    // Constructor รับค่าเริ่มต้นมาใส่ให้ username
    public User(String username) {
        this.username = username;
    }

    // Getter method สำหรับอ่านค่า username
    public String getUsername() {
        return username;
    }
}

public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        String name = sc.nextLine();   // รับชื่อผู้ใช้จาก input

        User u = new User(name);       // สร้าง object User
        System.out.println(u.getUsername());   // แสดงผลชื่อผู้ใช้
    }
}