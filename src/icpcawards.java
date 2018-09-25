import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class icpcawards {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        in.nextLine();
        Set<String> words = new HashSet<>();

        while (words.size() < 12) {
            String uniteam = in.nextLine();
            String university = uniteam.split("\\s+")[0];

            if (words.add(university)) {
                System.out.println(uniteam);
            }

        }

    }

}
