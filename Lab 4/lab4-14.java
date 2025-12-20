import java.util.Scanner;

class ScoreBoard {
    private final String GAMENAME;
    private final int[] SCORES;

    public ScoreBoard(String GAMENAME, int[] SCORES) {
        this.GAMENAME = GAMENAME;
        this.SCORES = SCORES;
    }

    public ScoreBoard(ScoreBoard OTHER) {
        this.GAMENAME = OTHER.GAMENAME;
        this.SCORES = new int[OTHER.SCORES.length];
        for (int I = 0; I < OTHER.SCORES.length; I++) {
            this.SCORES[I] = OTHER.SCORES[I];
        }
    }

    public void displayScores() {
        System.out.println(GAMENAME + ": " + SCORES[0] + ", " + SCORES[1] + ", " + SCORES[2]);
    }
}

public class Main {
    public static void main(String[] ARGS) {
        Scanner SC = new Scanner(System.in);

        String GAMENAME = SC.nextLine();
        int[] ORIGINALSCORES = new int[3];
        ORIGINALSCORES[0] = SC.nextInt();
        ORIGINALSCORES[1] = SC.nextInt();
        ORIGINALSCORES[2] = SC.nextInt();
        int NEWFIRST = SC.nextInt();

        ScoreBoard SB1 = new ScoreBoard(GAMENAME, ORIGINALSCORES);
        ScoreBoard SB2 = new ScoreBoard(SB1);

        ORIGINALSCORES[0] = NEWFIRST;

        SB1.displayScores();
        SB2.displayScores();

        SC.close();
    }
}
