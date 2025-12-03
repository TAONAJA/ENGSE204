import java.util.Scanner;
class Product {
    private String name;
    private double price;
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
}
class ShoppingCart {
    private Product[] items = new Product[10];
    private int itemCount = 0;
    public void addProduct(Product p) {
        if (itemCount < items.length) {
            items[itemCount] = p;
            itemCount++;
        } else {
        }
    }
    public double calculateTotalPrice() {
        double totalPrice = 0.0;
        for (int i = 0; i < itemCount; i++) {
            totalPrice += items[i].getPrice();
        }
        return totalPrice;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int N = Integer.parseInt(scanner.nextLine());
            ShoppingCart cart1 = new ShoppingCart();
            for (int i = 0; i < N; i++) {
                String productName = scanner.nextLine();
                double productPrice = Double.parseDouble(scanner.nextLine());
                Product newProduct = new Product(productName, productPrice);
                cart1.addProduct(newProduct);
            }
            double finalPrice = cart1.calculateTotalPrice();
            System.out.println(String.format("%.1f", finalPrice));
            
        } catch (Exception e) {
        } finally {
            scanner.close();
        }
    }
}
