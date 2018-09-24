import java.util.Scanner;

public class twostones {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int stones = in.nextInt();

        // check if lowest bit is 1 or 0
        if ( (stones & 1) == 0) {
            System.out.println("Bob");
        } else {
            System.out.println("Alice");
        }

        // check if divisible by 2
        /*
        if (stones % 2 == 0) {
            System.out.println("Bob");
        } else {
            System.out.println("Alice");
        }*/

    }

}
