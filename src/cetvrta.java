import java.util.Scanner;

public class cetvrta {

    public static void main(String[] args) {

        int[] xvals = new int[3];
        int[] yvals = new int[3];

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            xvals[i] = in.nextInt();
            yvals[i] = in.nextInt();
        }

        in.close();


        int x3 = CompleteRectangle(xvals);
        int y3 = CompleteRectangle(yvals);

        System.out.println(x3 + " " + y3);
    }

    public static int CompleteRectangle(int[] sides) {

        if (sides[0] == sides[1]) {
            return sides[2];
        } else if (sides[0] == sides[2]) {
            return sides[1];
        }

        return sides[0];
    }

}
