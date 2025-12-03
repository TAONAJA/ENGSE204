import java.util.Scanner;
class Car {
    private String model; 
    private int year;
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
    public String getModel() {
        return this.model;
    }
    public int getYear() {
        return this.year;
    }
    public void setYear(int newYear) {
        this.year = newYear;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String carModel = scanner.nextLine();
        int initialYear = scanner.nextInt();
        int newYear = scanner.nextInt();
        scanner.close();
        Car car = new Car(carModel, initialYear);
        car.setYear(newYear);
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
    }
}