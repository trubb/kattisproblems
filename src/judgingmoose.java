import java.util.Scanner;

public class judgingmoose {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int left = in.nextInt();
        int right = in.nextInt();


        if (left == 0 && right == 0) {
            System.out.println("Not a moose");
        } else if (left == right) {
            System.out.println("Even " + 2*right );
        } else {
            System.out.println("Odd " + Math.max(left, right) * 2);
        }

    }

}
