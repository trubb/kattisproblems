import java.util.Scanner;

public class filip {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String as = new String(new StringBuilder(in.next()).reverse());
        String bs = new String(new StringBuilder(in.next()).reverse());
        in.close();

        int a = Integer.parseInt(as);
        int b = Integer.parseInt(bs);

        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

    }

}
