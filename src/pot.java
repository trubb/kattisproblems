import java.util.Scanner;

public class pot {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        String[] sa = new String[number];

        int ts;

        for (int i = 0; i < number; i++) {
            ts = in.nextInt();
            sa[i] = Integer.toString(ts);
        }

        for (int i = 0; i < number; i++) {  // print what we received
            System.out.println(sa[i]);
        }

        int[] pow = new int[number];
        int[] num = new int[number];

        for (int i = 0; i < number; i++) {
            String a = Character.toString( sa[i].charAt( sa[i].length() - 1 ) );    // grab last char in string
            StringBuilder sb = new StringBuilder( sa[i] ).deleteCharAt( sa[i].length() - 1);
            num[i] = Integer.parseInt( sb.toString() ); // turn the stringbuilder into int
            pow[i] = Integer.parseInt(a);    // put it into the array of integers so we can math
            System.out.println("num[" + i + "]: " + num[i] + " pow[" + i + "]: " + pow[i]);
        }

        for (int i = 0; i < number; i++) {
            // do tons of shit with math.pow typ math.pow(num, pow)
            // lägg in i int sum

        }

    }

}
