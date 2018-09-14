import java.util.Scanner;

public class nodup {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        String[] stra = str.split("\\s+");
        in.close();


/*        for (int i = 0; i < stra.length; i++) { // make sure we actually got the string
            System.out.println(i + " " + stra[i]);

        }
*/

        boolean dupe = false;

        for (int i = 0; i < stra.length ; i++) {
            String word = stra[i];

            if (dupe) {
                break;
            } else {
                for (int j = i + 1; j < stra.length; j++) {
                    if (word.equals(stra[j])) {
                        System.out.println("no");
                        dupe = true;
                    } else {
                        System.out.println("yes");
                    }

                }
            }

        }


    }

}
