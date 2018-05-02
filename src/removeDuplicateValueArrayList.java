import java.util.*;

public class removeDuplicateValueArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
          list.add(2);
          list.add(4);
          list.add(8);
          list.add(2);
        for (Integer i:list
             ) {
            System.out.println(i);

        }
        Set<Integer>hasset =new LinkedHashSet<>(list);
        System.out.println(hasset);


}
}
