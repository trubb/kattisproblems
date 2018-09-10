import java.util.Scanner;

public class coldputer {

    public static void main(String[] args) {
        // initialize the counter
        int cc = 0;
        // initialize the scanner
        Scanner in = new Scanner(System.in);
        // inputs takes first input to determine how many temps there will be
        int vals = in.nextInt();
        /*
            check each new input to determine if it is negative
            until the proper number of inputs have been reached
            then continue
         */
        for (int i = 0; i < vals; i++) {
            if (in.nextInt() < 0) {
                cc++;
            }
        }
        // close the scanner
        in.close();
        // print the number of negative numbers
        System.out.println(cc);
    }
}
