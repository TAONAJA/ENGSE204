import java.util.Scanner;

class User {
    private String password;   // attribute แบบ private

    // Constructor
    public User(String initialPassword) {
        this.password = initialPassword;
    }

    // Getter
    public String getPassword() {
        return password;
    }

    // Setter พร้อมเงื่อนไข
    public void setPassword(String newPassword) {
        if (newPassword.length() >= 8) {
            password = newPassword;
            System.out.println("Password updated.");
        } else {
            System.out.println("Password is too short.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String initialPassword = sc.nextLine(); // รหัสผ่านเริ่มต้น
        String newPassword = sc.nextLine();     // รหัสผ่านใหม่

        User user = new User(initialPassword); // สร้าง object
        user.setPassword(newPassword);         // พยายามอัปเดตรหัสผ่าน

        System.out.println(user.getPassword()); // แสดงรหัสผ่านปัจจุบัน
    }
}
