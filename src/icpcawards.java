import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class icpcawards {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int nteams = in.nextInt();
        Set<String> words = new HashSet<>();

        for (int i = 0; i <= nteams; i++) {

            String tempstr = in.nextLine();
            String[] temp = tempstr.split("\\s+");

/*            for (int j = 0; j < temp.length; j++) {
                System.out.println(temp[j] + " index: " + j); // completely fine
            }
*/
//            System.out.println(temp[0]); // fine
//            System.out.println(temp[1]); // error
//            System.out.println(tempstr + " " + temp[0] + " " + temp[1]); // error

            if (!words.contains(temp[0]) && words.size() <= 12) {
                words.add(temp[0]);
                System.out.println(tempstr);
            }

        }

    }

}
