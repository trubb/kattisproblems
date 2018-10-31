import java.util.Scanner;

public class grassseed {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double costpersqm, lawns, lawnwidth, lawnlength, totalcost, totlawnareal = 0;

        costpersqm = in.nextDouble();
        lawns = in.nextDouble();

        for (int i = 0; i < lawns ; i++) {
            lawnwidth = in.nextDouble();
            lawnlength = in.nextDouble();
            totlawnareal += calcSqm(lawnwidth, lawnlength);
        }

        totalcost = costpersqm * totlawnareal;
        System.out.format("%.7f", totalcost);

    }

    public static double calcSqm (double w, double l) {
        double area = w * l;
        return area;
    }

}
