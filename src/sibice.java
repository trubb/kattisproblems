import java.util.Scanner;

public class sibice {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int w = in.nextInt();
        int h = in.nextInt();

        double hypo = Math.sqrt( (w*w) + (h*h) );

        for (int i = 0; i < n; i++) {
            int matches = in.nextInt();
            if (matches <= w) {
                System.out.println("DA");
            } else if (matches <= h){
                System.out.println("DA");
            } else if(matches <= hypo) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }

    }

}
