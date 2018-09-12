import java.util.Scanner;

public class faktor {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int articles = in.nextInt();
        int impact = in.nextInt();
        in.close();

        System.out.println(articles*(impact-1) + 1);
    }

}
