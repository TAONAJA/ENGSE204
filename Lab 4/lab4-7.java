import java.util.Scanner;

class Resource {

    private String ID;

    public Resource(String ID) {
        this.ID = ID;
        System.out.println("Resource " + ID + " created.");
    }

    @SuppressWarnings("removal")
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Resource " + ID + " finalized (destroyed).");
        super.finalize();
    }
}

public class Main {

    public static void main(String[] ARGS) throws Throwable {

        Scanner SC = new Scanner(System.in);

        String A = SC.nextLine();
        String B = SC.nextLine();
        String C = SC.nextLine();

        Resource R1 = new Resource(A);
        Resource R2 = new Resource(B);
        Resource R3 = new Resource(C);

        Resource X1 = R1;
        Resource X2 = R2;
        Resource X3 = R3;

        R1 = null;
        R2 = null;

        System.gc();
        X1.finalize();
        X2.finalize();

        R3 = null;

        System.gc();
        X3.finalize();

        SC.close();
    }
}
