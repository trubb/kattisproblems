import java.util.Scanner;

public class pet {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] competitor = new int[5];  // 5 competitors
        int id = 0; // cant start an array at 1
        int winner = 0;
        int topscore = 0;

        /*
         * Handling input
         */
        for (int i = 0; i < 5; i++) {   // outer loop, for picking ID of current contestant
            int temp = 0;
            for (int j = 0; j < 4; j++) {    // inner loop, for iterating over a contestants score
                temp += in.nextInt();   // add up the contestants score
            }
            competitor[id] = temp;  // store the sum at the right place
            id++;   // increment id
        }

        /*
         * Determining the winner
         */
        for (int i = 0; i < 5; i++) {
            if ( Math.max( topscore, competitor[i] ) == competitor[i] ) {   // pick the highest value
                winner = i + 1;
                topscore = competitor[i];
            }
        }

        System.out.println(winner + " " + topscore);    // output the winner

    }

}
