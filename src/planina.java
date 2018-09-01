import java.util.Scanner;

public class planina {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();

        int output = (int) Math.pow( Math.pow(2, n) + 1, 2 );
        // (2^n + 1)^2

        System.out.println(output);
    }
}
