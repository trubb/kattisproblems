import java.util.ArrayList;
import java.util.Scanner;

public class nodup {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] stra = str.split("\\s+");
        String word;
        boolean dupe = false;
        ArrayList<String> words = new ArrayList<>();

        for (int i = 0; i <= stra.length - 1; i++) {
            word = stra[i];
            if (words.contains(word)) {
                dupe = true;
                break;
            } else {
                words.add(word);
            }
        }

        if (dupe) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }
    }

}
