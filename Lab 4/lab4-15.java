import java.util.Scanner;

class AuditRecord {

    private final String USER;
    private final String[] LOGMESSAGES;

    private static int MAXMESSAGES = 3;

    public AuditRecord(String USER) {
        this.USER = USER;
        this.LOGMESSAGES = new String[0];
    }

    public AuditRecord(String USER, String[] LOGS) {
        this.USER = USER;
        this.LOGMESSAGES = new String[LOGS.length];
        for (int I = 0; I < LOGS.length; I++) {
            this.LOGMESSAGES[I] = LOGS[I];
        }
    }

    public static void setMaxMessages(int MAX) {
        if (MAX > 0) {
            MAXMESSAGES = MAX;
            System.out.println("Policy set to " + MAX);
        } else {
            System.out.println("Invalid policy.");
        }
    }

    public AuditRecord addMessage(String MESSAGE) {
        if (LOGMESSAGES.length >= MAXMESSAGES) {
            System.out.println("Log is full.");
            return this;
        }

        String[] NEWLOGS = new String[LOGMESSAGES.length + 1];
        for (int I = 0; I < LOGMESSAGES.length; I++) {
            NEWLOGS[I] = LOGMESSAGES[I];
        }
        NEWLOGS[NEWLOGS.length - 1] = MESSAGE;

        System.out.println(MESSAGE + " added.");
        return new AuditRecord(USER, NEWLOGS);
    }

    public void displayLog() {
        StringBuilder SB = new StringBuilder();
        SB.append("User: ").append(USER)
          .append(", Logs: ").append(LOGMESSAGES.length)
          .append(" [");
        for (int I = 0; I < LOGMESSAGES.length; I++) {
            SB.append(LOGMESSAGES[I]);
            if (I < LOGMESSAGES.length - 1) SB.append(", ");
        }
        SB.append("]");
        System.out.println(SB.toString());
    }
}

public class Main {

    public static void main(String[] ARGS) {

        Scanner SC = new Scanner(System.in);

        int MAX = Integer.parseInt(SC.nextLine().trim());
        AuditRecord.setMaxMessages(MAX);

        String USER = SC.nextLine();
        int N = Integer.parseInt(SC.nextLine().trim());

        AuditRecord RECORD = new AuditRecord(USER);

        for (int I = 0; I < N; I++) {
            String CMD = SC.nextLine();
            if (CMD.equals("SET_POLICY")) {
                int NEWMAX = Integer.parseInt(SC.nextLine().trim());
                AuditRecord.setMaxMessages(NEWMAX);
            } else {
                RECORD = RECORD.addMessage(CMD);
            }
        }

        RECORD.displayLog();
        SC.close();
    }
}
