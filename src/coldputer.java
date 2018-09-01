import java.util.Scanner;

public class coldputer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nofinput = scanner.nextInt();

        int[] temps = new int[nofinput];

        for (int i = 0; i <= nofinput; i++) {

            temps[i] = scanner.nextInt();
        }

        for (int i = 0; i < nofinput; i++) {

            System.out.println(temps[i]);

        }

    }
}
