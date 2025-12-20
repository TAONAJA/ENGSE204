import java.util.Scanner;

class Subscription {

    private final String PLANNAME;
    private final int DURATIONDAYS;

    private static int MAXDURATION = 365;

    public Subscription(String PLANNAME, int DURATIONDAYS) {
        int DAYS = DURATIONDAYS;
        if (DAYS > MAXDURATION) DAYS = MAXDURATION;
        if (DAYS < 0) DAYS = 0;
        this.PLANNAME = PLANNAME;
        this.DURATIONDAYS = DAYS;
    }

    public Subscription(Subscription OTHER) {
        this.PLANNAME = OTHER.PLANNAME;
        this.DURATIONDAYS = OTHER.DURATIONDAYS;
    }

    public static void setMaxDuration(int MAX) {
        if (MAX <= 0) {
            System.out.println("Invalid max policy.");
            return;
        }
        MAXDURATION = MAX;
        System.out.println("Max duration set to " + MAXDURATION);
    }

    public Subscription extend(int DAYS) {
        if (DAYS <= 0) {
            System.out.println("Invalid extension days.");
            return this;
        }

        int NEWDAYS = this.DURATIONDAYS + DAYS;

        if (NEWDAYS > MAXDURATION) {
            System.out.println("Extension failed: Exceeds max policy.");
            return this;
        }

        System.out.println("Extension successful.");
        return new Subscription(this.PLANNAME, NEWDAYS);
    }

    public void displayInfo() {
        System.out.println("Plan: " + PLANNAME + ", Days: " + DURATIONDAYS);
    }
}

public class Main {

    public static void main(String[] ARGS) {

        Scanner SC = new Scanner(System.in);

        int MAX = Integer.parseInt(SC.nextLine().trim());
        Subscription.setMaxDuration(MAX);

        String PLAN = SC.nextLine();
        int DAYS = Integer.parseInt(SC.nextLine().trim());
        int EXT1 = Integer.parseInt(SC.nextLine().trim());
        int EXT2 = Integer.parseInt(SC.nextLine().trim());

        Subscription SUB = new Subscription(PLAN, DAYS);
        SUB = SUB.extend(EXT1);
        SUB = SUB.extend(EXT2);
        SUB.displayInfo();

        SC.close();
    }
}
