import java.util.Scanner;

class Product {
    private String name;                 // instance attribute
    private static int productCount = 0; // static attribute

    // Constructor
    public Product(String name) {
        this.name = name;
        productCount++;   // เพิ่มจำนวนสินค้าทุกครั้งที่สร้าง object
    }

    // Getter ของ name
    public String getName() {
        return name;
    }

    // Getter ของ productCount (static)
    public static int getProductCount() {
        return productCount;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   // จำนวนสินค้า
        sc.nextLine();          // เคลียร์บรรทัด

        for (int i = 0; i < N; i++) {
            String productName = sc.nextLine();
            new Product(productName);    // สร้างสินค้าแต่ละชิ้น
        }

        // แสดงจำนวนสินค้าทั้งหมด
        System.out.println(Product.getProductCount());
    }
}
