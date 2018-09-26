import java.util.Scanner;

public class ladder {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int h = in.nextInt();
        int v = in.nextInt();

        /**
         * a / sin A == c
         */
        int ans = (int) Math.ceil( h / Math.sin( Math.toRadians( v ) ) );

        System.out.println(ans);

    }

}
