import java.util.Scanner;

public class bijele {

    public static void main(String[] args) {

        int[] pieces = {1, 1, 2, 2, 2, 8};
        int[] found = new int[6];

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < found.length; i++) {
            found[i] = in.nextInt();
        }

        for (int i = 0; i < found.length; i++) {
            System.out.print(pieces[i] - found[i] + " ");
        }
    }
}
