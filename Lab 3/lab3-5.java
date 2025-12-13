import java.util.Scanner;

class DatabaseConnection {
    private String connectionString; // ชื่อเซิร์ฟเวอร์
    private boolean connected;        // สถานะการเชื่อมต่อ

    // Constructor
    public DatabaseConnection(String connectionString) {
        this.connectionString = connectionString;
        this.connected = false; // เริ่มต้นยังไม่เชื่อมต่อ
    }

    // ตรวจสอบสถานะการเชื่อมต่อ
    public boolean isConnected() {
        return connected;
    }

    // เชื่อมต่อฐานข้อมูล
    public void connect() {
        if (!connected) {
            connected = true;
            System.out.println("Connected to " + connectionString);
        } else {
            System.out.println("Already connected.");
        }
    }

    // ตัดการเชื่อมต่อ
    public void disconnect() {
        if (connected) {
            connected = false;
            System.out.println("Disconnected.");
        } else {
            System.out.println("Already disconnected.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String connectionString = sc.nextLine(); // รับชื่อเซิร์ฟเวอร์

        DatabaseConnection db = new DatabaseConnection(connectionString);

        db.connect();      // เชื่อมต่อ
        db.disconnect();   // ตัดการเชื่อมต่อ
        db.disconnect();   // เรียกซ้ำเพื่อทดสอบ

        System.out.println(db.isConnected()); // แสดงสถานะสุดท้าย
    }
}
