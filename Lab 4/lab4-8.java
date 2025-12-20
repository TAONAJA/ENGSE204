import java.util.Scanner;

class Movie {

    private String TITLE;
    private String DIRECTOR;
    private double RATING;

    public Movie(String TITLE) {
        this.TITLE = TITLE;
        this.DIRECTOR = "Unknown";
        this.RATING = 0.0;
    }

    public Movie(String TITLE, String DIRECTOR) {
        this(TITLE);
        this.DIRECTOR = DIRECTOR;
    }

    public Movie(String TITLE, String DIRECTOR, double RATING) {
        this(TITLE, DIRECTOR);
        if (RATING > 10.0) RATING = 10.0;
        if (RATING < 0.0) RATING = 0.0;
        this.RATING = RATING;
    }

    public void displayDetails() {
        System.out.println("Title: " + TITLE + ", Director: " + DIRECTOR + ", Rating: " + RATING);
    }
}

public class Main {

    public static void main(String[] ARGS) {

        Scanner SC = new Scanner(System.in);

        int TYPE = Integer.parseInt(SC.nextLine());

        if (TYPE == 1) {
            String TITLE = SC.nextLine();
            Movie MOVIE = new Movie(TITLE);
            MOVIE.displayDetails();
        } else if (TYPE == 2) {
            String TITLE = SC.nextLine();
            String DIRECTOR = SC.nextLine();
            Movie MOVIE = new Movie(TITLE, DIRECTOR);
            MOVIE.displayDetails();
        } else if (TYPE == 3) {
            String TITLE = SC.nextLine();
            String DIRECTOR = SC.nextLine();
            double RATING = Double.parseDouble(SC.nextLine());
            Movie MOVIE = new Movie(TITLE, DIRECTOR, RATING);
            MOVIE.displayDetails();
        }

        SC.close();
    }
}
