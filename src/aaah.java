import java.util.Scanner;

public class aaah {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String jon = in.nextLine();
        String doc = in.nextLine();

        if (doc.length() > jon.length()) {
            System.out.println("no");
        } else {
            System.out.println("go");
        }

    }

}
