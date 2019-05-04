import java.util.*;

public class compoundwords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<String> inputwords = new HashSet<>();
        Set<String> compoundwords = new HashSet<>();

        while ( in.hasNext() )
            inputwords.add( in.next() );

        for (String s:inputwords) {
            for (String b: inputwords) {
                if ( s.equals(b) ) {}
                else if (!compoundwords.contains( s + b ) ) {
                    compoundwords.add( s + b );
                }
            }
        }

        List<String> sorted = new ArrayList<>(compoundwords);
        Collections.sort(sorted);
        for (String s: sorted)
            System.out.println(s);
    }
}
