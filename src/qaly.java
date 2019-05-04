import java.util.Scanner;

public class qaly {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int inputs;
        double total = 0, quality, years;

        inputs = in.nextInt();
        for (int i = 0; i < inputs; i++) {
            quality = in.nextDouble();
            years = in.nextDouble();
            total += qaly( quality, years );
        }

        System.out.printf( "%.3f", total );
    }

    public static double qaly( double quality, double years) {
        return quality * years;
    }
}
