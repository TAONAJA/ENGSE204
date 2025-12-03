package lab1_1;

import java.util.Scanner;

public class lab1_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstNumber  = Integer.parseInt(input.nextLine().trim());
        int secondNumber = Integer.parseInt(input.nextLine().trim());

        int sum = firstNumber + secondNumber;

        System.out.println(sum);

        input.close();
    }
}

