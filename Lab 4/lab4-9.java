import java.util.Scanner;

class ImmutableAccount {

    private final String ACCOUNTID;
    private final double BALANCE;

    public ImmutableAccount(String ACCOUNTID, double BALANCE) {
        if (BALANCE < 0.0) BALANCE = 0.0;
        this.ACCOUNTID = ACCOUNTID;
        this.BALANCE = BALANCE;
    }

    public ImmutableAccount(ImmutableAccount OTHER) {
        this.ACCOUNTID = OTHER.ACCOUNTID;
        this.BALANCE = OTHER.BALANCE;
    }

    public String getAccountId() {
        return ACCOUNTID;
    }

    public double getBalance() {
        return BALANCE;
    }

    public ImmutableAccount deposit(double AMOUNT) {
        if (AMOUNT <= 0.0) {
            System.out.println("Invalid deposit amount.");
            return this;
        }
        return new ImmutableAccount(ACCOUNTID, BALANCE + AMOUNT);
    }

    public ImmutableAccount withdraw(double AMOUNT) {
        if (AMOUNT > BALANCE) {
            System.out.println("Insufficient funds.");
            return this;
        }
        if (AMOUNT <= 0.0) {
            System.out.println("Invalid withdrawal amount.");
            return this;
        }
        return new ImmutableAccount(ACCOUNTID, BALANCE - AMOUNT);
    }

    public void displayInfo() {
        System.out.println("ID: " + ACCOUNTID + ", Balance: " + BALANCE);
    }
}

public class Main {

    public static void main(String[] ARGS) {

        Scanner SC = new Scanner(System.in);

        String ID = SC.nextLine();
        double BALANCE = Double.parseDouble(SC.nextLine());
        double DEPOSIT = Double.parseDouble(SC.nextLine());
        double WITHDRAW = Double.parseDouble(SC.nextLine());

        ImmutableAccount ACC1 = new ImmutableAccount(ID, BALANCE);
        ImmutableAccount ACC2 = ACC1.deposit(DEPOSIT);
        ImmutableAccount ACC3 = ACC2.withdraw(WITHDRAW);

        ACC1.displayInfo();
        ACC3.displayInfo();

        SC.close();
    }
}
