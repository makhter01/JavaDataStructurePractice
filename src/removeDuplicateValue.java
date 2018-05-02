import java.util.HashSet;
import java.util.Set;

public class removeDuplicateValue {
    public static void main(String[] args) {


        // public static void removeDuplicate(){
        int[] arr = {2, 3, 4, 56, 2, 5, 7, 3};
        Set<Integer> hasset = new HashSet<>();
        for (Integer e : arr) {
            if (hasset.add(e) == false) {
                System.out.println(e + " is a duplicate value");

            }
            hasset.add(e);
        }
        System.out.println("the hasset values are " );
        for (int n:hasset
             ) {
            System.out.println(n + " ");

        }

    }
}
