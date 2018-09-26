import java.util.Scanner;

public class oddities {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        int num = 0;

        for (int i = 0; i < cases; i++) {

            num = in.nextInt();

            if ( (num & 1) == 0) {
                System.out.println(num + " is even");
            } else {
                System.out.println(num + " is odd");
            }

        }

    }

}
