import java.util.Scanner;

public class cetvrta {

    public static void main(String[] args) {

        int[] xvals = new int[3];
        int[] yvals = new int[3];
        int x3 = 0, y3 = 0;

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            xvals[i] = in.nextInt();
            yvals[i] = in.nextInt();
        }

        in.close();

        // black magic solution based on magic modulo rollover of array indexes
        for (int i = 0; i < 3; i++) {
            if (xvals[i] != xvals[(i + 1) % 3] && xvals[i] != xvals[(i + 2) % 3]) {
                x3 = xvals[i];
            }
            if (yvals[i] != yvals[(i + 1) % 3] && yvals[i] != yvals[(i + 2) % 3]) {
                y3 = yvals[i];
            }
        }

        System.out.println(x3 + " " + y3);

        /*
        // less fancy solution based on straight ifs
        if (xvals[0] == xvals[1]) {
            x3 = xvals[2];
        } else if (xvals[0] == xvals[2]) {
            x3 = xvals[1];
        } else {
            x3 = xvals[0];
        }

        if (yvals[0] == yvals[1]) {
            y3 = yvals[2];
        } else if (yvals[0] == yvals[2]) {
            y3 = yvals[1];
        } else {
            y3 = yvals[0];
        }

        System.out.println(x3 + " " + y3);
        */
    }

}
