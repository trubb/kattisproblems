import java.util.Scanner;

public class apaxiaaans {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char[] name = in.nextLine().toCharArray();
        char prev = name[0];

        System.out.print(prev); // print the first letter because we want it no matter what

        for (int i = 0; i < name.length; i++) {

            if (name[i] == prev) {
                // do nothing
            } else {
                System.out.print(name[i]);
            }

            prev = name[i];
        }

    }

}
