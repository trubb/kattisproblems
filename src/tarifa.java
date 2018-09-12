import java.util.Scanner;

public class tarifa {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int X = in.nextInt();
        int N = in.nextInt();
        int[] months = new int[N];

        for (int i = 0; i < N; i++) {
            months[i] = in.nextInt();
        }
        in.close();

        int asum = 0;

        for (int i = 0; i < months.length ; i++) {
            asum += months[i];

        }

        int out = X + ( (X * N) - asum );

        System.out.println(out);
    }

}
