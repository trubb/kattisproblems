import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class nodup {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] strings = in.nextLine().split("\\s+");
        Set<String> words = new HashSet<>();

        for (String word : strings) {

            if (!words.add(word)) {
                System.out.println("no");
                return;
            }
        }

        System.out.println("yes");
    }
}
