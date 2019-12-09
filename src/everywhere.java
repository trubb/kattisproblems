import java.util.*;

public class everywhere {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt(); // number of test cases
      
        // outer loop, runs *cases* times
        for (int i = 0; i < cases; i++) {
        
            int trips = in.nextInt(); // number of trips
            Set<String> cities= new HashSet<String>(); // set containing the cities visited

            // inner loop, populates the set
            for (int j = 0; j < trips; j++) {
                cities.add( in.next() );
            }

            // print the size of the set - how many unique entries there are
            System.out.println( cities.size() );
        }
    }
}
