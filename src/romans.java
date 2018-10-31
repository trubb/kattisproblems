import java.util.Scanner;

public class romans {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double emile = in.nextDouble();

        System.out.println( Math.round( etormile( emile ) ) );
    }

    private static double etormile (double emile) {
        double efeet = 5280;
        double rfeet = 4854;
        double converted = emile * (1000 * ( efeet / rfeet ) );
        return converted;
    }

}
