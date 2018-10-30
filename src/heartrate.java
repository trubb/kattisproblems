import java.util.Scanner;

public class heartrate {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double b, p, diff, ebpm, low, high;
        int cases = in.nextInt();

        for (int i = 0; i < cases; i++) {
            b = in.nextDouble();
            p = in.nextDouble();
            diff = 60.0 / p;
            ebpm = diff * b;
            low = ebpm - diff;
            high = ebpm + diff;
            System.out.format("%.4f " + "%.4f " + "%.4f" + "\n", low, ebpm, high);
        }
    }
}
