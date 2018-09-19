import java.util.Scanner;

public class pot {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int number = in.nextInt(), sum = 0, ts;
        String[] sa = new String[number];
        int[] pow = new int[number];
        int[] num = new int[number];

        for (int i = 0; i < number; i++) {
            ts = in.nextInt();
            sa[i] = Integer.toString(ts);
        }

        for (int i = 0; i < number; i++) {
            String a = Character.toString( sa[i].charAt( sa[i].length() - 1 ) );
            StringBuilder sb = new StringBuilder( sa[i] ).deleteCharAt( sa[i].length() - 1);
            num[i] = Integer.parseInt( sb.toString() );
            pow[i] = Integer.parseInt(a);
        }

        for (int i = 0; i < number; i++) {
            sum += Math.pow(num[i], pow[i]);
        }

        System.out.println(sum);
    }

}
