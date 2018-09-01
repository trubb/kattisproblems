import java.util.Scanner;

public class fizzbuzz {

    public static void main(String[] args) {

//        boolean fizz = false;
//        boolean buzz = false;

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {

            if (i % x == 0 && i % y == 0) {

                System.out.println("FizzBuzz");
                //if both are divisible so we can print FIZZBUZZ
            }
            else if (i % x == 0) {

                System.out.println("Fizz");
                //do thing so we can print BUZZ
            }
            else if (i % y == 0) {

                System.out.println("Buzz");
                //do thing so we can print BUZZ
            }
            else {

                System.out.println(i);
            }

        }

    }
}
