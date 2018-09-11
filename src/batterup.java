import java.util.Scanner;

public class batterup {

    public static void main(String[] args) {

        double hits = 0, bats, atbats, slugperc, tc;

        Scanner in = new Scanner(System.in);
        bats = in.nextDouble();
        atbats = bats;

        /*
            for every input we expect, check if it is a walk
            if it is, subtract 1 from the number of at bats
            if it is an accepted bat then add the number of
            bases taken to the sum of battings
         */
        for (int i = 0; i < bats; i++) {
            tc = in.nextDouble();
            if (tc < 0) {
                atbats--;
            } else {
                hits += tc;
            }
        }

        // close the scanner
        in.close();

        // calculate slugging percentage
        slugperc = hits / atbats;

        // print the slugging percentage
        System.out.println(slugperc);
    }
}
