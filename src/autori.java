import java.util.Scanner;

public class autori {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] authors = s.split("-");

        for (int i = 0; i < authors.length; i++) {
            System.out.print(authors[i].charAt(0));
        }
    }
}
