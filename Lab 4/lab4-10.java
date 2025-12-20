import java.util.Scanner;

class TimePeriod {

    private int STARTHOUR;
    private int ENDHOUR;

    public TimePeriod() {
        this(9, 17);
    }

    public TimePeriod(int STARTHOUR, int ENDHOUR) {

        if (STARTHOUR < 0) STARTHOUR = 0;
        if (STARTHOUR > 23) STARTHOUR = 23;
        if (ENDHOUR < 0) ENDHOUR = 0;
        if (ENDHOUR > 23) ENDHOUR = 23;

        if (STARTHOUR > ENDHOUR) {
            int TEMP = STARTHOUR;
            STARTHOUR = ENDHOUR;
            ENDHOUR = TEMP;
        }

        this.STARTHOUR = STARTHOUR;
        this.ENDHOUR = ENDHOUR;
    }

    public void displayPeriod() {
        System.out.println(STARTHOUR + ":00 - " + ENDHOUR + ":00");
    }
}

public class Main {

    public static void main(String[] ARGS) {

        Scanner SC = new Scanner(System.in);

        int MODE = Integer.parseInt(SC.nextLine());

        TimePeriod TP;

        if (MODE == 1) {
            TP = new TimePeriod();
        } else {
            int START = Integer.parseInt(SC.nextLine());
            int END = Integer.parseInt(SC.nextLine());
            TP = new TimePeriod(START, END);
        }

        TP.displayPeriod();

        SC.close();
    }
}
