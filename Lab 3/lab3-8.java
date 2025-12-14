import java.util.Scanner;

class InventoryItem {
    private String productName;
    private int stock;

    public InventoryItem(String productName, int initialStock) {
        this.productName = productName;
        if (initialStock >= 0) {
            this.stock = initialStock;
        } else {
            this.stock = 0;
        }
    }

    public String getProductName() {
        return productName;
    }

    public int getStock() {
        return stock;
    }

    public void addStock(int amount) {
        if (amount > 0) {
            stock += amount;
            System.out.println("Stock added.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void sellStock(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else if (amount <= stock) {
            stock -= amount;
            System.out.println("Sale successful.");
        } else {
            System.out.println("Not enough stock.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String PRODUCTNAME = sc.nextLine();
        int INITIALSTOCK = sc.nextInt();

        InventoryItem ITEM = new InventoryItem(PRODUCTNAME, INITIALSTOCK);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            String COMMAND = sc.next();
            int AMOUNT = sc.nextInt();

            if (COMMAND.equals("ADD")) {
                ITEM.addStock(AMOUNT);
            } else if (COMMAND.equals("SELL")) {
                ITEM.sellStock(AMOUNT);
            }
        }

        System.out.println("Final Stock: " + ITEM.getStock());
    }
}
