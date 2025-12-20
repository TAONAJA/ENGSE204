import java.util.Scanner;

class Configuration {

    private final String THEME;
    private final int FONTSIZE;
    private final boolean DARKMODE;

    public Configuration(String THEME, int FONTSIZE, boolean DARKMODE) {

        if (FONTSIZE < 10) FONTSIZE = 10;
        if (FONTSIZE > 20) FONTSIZE = 20;

        this.THEME = THEME;
        this.FONTSIZE = FONTSIZE;
        this.DARKMODE = DARKMODE;
    }

    public Configuration(Configuration BASE, Configuration USER) {
        this(
            USER.THEME,
            BASE.FONTSIZE,
            USER.DARKMODE
        );
    }

    public void displaySettings() {
        System.out.println("Theme: " + THEME + ", Size: " + FONTSIZE + ", Dark: " + DARKMODE);
    }
}

public class Main {

    public static void main(String[] ARGS) {

        Scanner SC = new Scanner(System.in);

        String BASETHEME = SC.nextLine();
        int BASESIZE = Integer.parseInt(SC.nextLine());
        boolean BASEDARK = Boolean.parseBoolean(SC.nextLine());

        String USERTHEME = SC.nextLine();
        int USERSIZE = Integer.parseInt(SC.nextLine());
        boolean USERDARK = Boolean.parseBoolean(SC.nextLine());

        Configuration BASECONFIG = new Configuration(BASETHEME, BASESIZE, BASEDARK);
        Configuration USERCONFIG = new Configuration(USERTHEME, USERSIZE, USERDARK);

        Configuration FINALCONFIG = new Configuration(BASECONFIG, USERCONFIG);

        FINALCONFIG.displaySettings();

        SC.close();
    }
}
