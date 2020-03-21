import java.util.Comparator;

public class ComparatorClass {

    Comparator<String> oldComparator = new Comparator<String>() {
        public int compare(String o1, String o2) {
            return Integer.compare(o1.length(), o2.length());
        }
    };

    Comparator<String> lambdaComparator = (s1, s2) -> {
        System.out.println("I am comparing strings");
        return Integer.compare(s1.length(), s2.length());
    };

}
