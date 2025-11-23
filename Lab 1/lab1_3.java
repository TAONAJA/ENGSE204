package lab1_3;

import java.util.Scanner;

public class lab1_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = Integer.parseInt(input.nextLine().trim());

        String result = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println(result);

        input.close();
    }
}
