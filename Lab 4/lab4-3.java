import java.util.Scanner;

class Player {
    private String USERNAME;
    private int LEVEL;

    public Player() {
        this.USERNAME = "Guest";
        this.LEVEL = 1;
    }

    public Player(String USERNAME, int LEVEL) {
        this.USERNAME = USERNAME;
        this.LEVEL = LEVEL;
    }

    public void displayProfile() {
        System.out.println("User: " + USERNAME + ", Level: " + LEVEL);
    }
}

public class Main {
    public static void main(String[] ARGS) {
        Scanner SC = new Scanner(System.in);

        int MODE = Integer.parseInt(SC.nextLine());
        Player PLAYER;

        if (MODE == 1) {
            PLAYER = new Player();
        } else {
            String USERNAME = SC.nextLine();
            int LEVEL = Integer.parseInt(SC.nextLine());
            PLAYER = new Player(USERNAME, LEVEL);
        }

        PLAYER.displayProfile();
        SC.close();
    }
}
