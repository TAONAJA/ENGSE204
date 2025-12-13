import java.util.Scanner;

class Player {
    private int score;   // attribute แบบ private

    // Constructor
    public Player(int initialScore) {
        this.score = initialScore;
    }

    // Getter
    public int getScore() {
        return score;
    }

    // Setter
    public void setScore(int newScore) {
        this.score = newScore;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int initialScore = sc.nextInt();   // คะแนนเริ่มต้น
        int updateScore = sc.nextInt();    // คะแนนอัปเดต

        Player player = new Player(initialScore); // สร้าง object
        player.setScore(updateScore);             // อัปเดตคะแนน

        System.out.println(player.getScore());    // แสดงคะแนนล่าสุด
    }
}
