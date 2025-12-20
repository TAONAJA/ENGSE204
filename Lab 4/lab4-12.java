import java.util.Scanner;

class Schedule {

    private int HOUR;

    public Schedule(int HOUR) {
        this.HOUR = HOUR;
    }

    public void setHour(int NEWHOUR) {
        this.HOUR = NEWHOUR;
    }

    public int getHour() {
        return HOUR;
    }

    public Schedule(Schedule OTHER) {
        this.HOUR = OTHER.HOUR;
    }
}

class EmployeeSchedule {

    private String NAME;
    private Schedule SCHEDULE;

    public EmployeeSchedule(String NAME, Schedule SCHEDULE) {
        this.NAME = NAME;
        this.SCHEDULE = SCHEDULE;
    }

    public EmployeeSchedule(EmployeeSchedule OTHER) {
        this.NAME = OTHER.NAME;
        this.SCHEDULE = new Schedule(OTHER.SCHEDULE);
    }

    public void displaySchedule() {
        System.out.println(NAME + ": " + SCHEDULE.getHour() + ":00");
    }
}

public class Main {

    public static void main(String[] ARGS) {

        Scanner SC = new Scanner(System.in);

        String NAME = SC.nextLine();
        int HOUR = Integer.parseInt(SC.nextLine());
        int NEWHOUR = Integer.parseInt(SC.nextLine());

        Schedule SCH1 = new Schedule(HOUR);

        EmployeeSchedule EMP1 = new EmployeeSchedule(NAME, SCH1);
        EmployeeSchedule EMP2 = new EmployeeSchedule(EMP1);

        SCH1.setHour(NEWHOUR);

        EMP1.displaySchedule();
        EMP2.displaySchedule();

        SC.close();
    }
}
