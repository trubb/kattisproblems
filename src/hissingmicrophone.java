import java.util.Scanner;

public class hissingmicrophone {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.next();

        if (s.contains("ss")) {
            System.out.println("hiss");
        } else {
            System.out.println("no hiss");
        }

    }

}
