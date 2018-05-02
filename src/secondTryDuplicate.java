import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class secondTryDuplicate {
    public static void main(String[] args) {
        List<String>list1=new ArrayList<String>();
        list1.add("name");
        list1.add("phone");
        list1.add("name");
        list1.add("pen");
        list1.add("ticket");
        list1.add("Bob");
        list1.add("laptop");
        list1.add("tv");
        list1.add("cdplayer");
        list1.add("lunchbox");
        list1.add("microwave");
        list1.add("freeze");
        list1.add("cris");
        list1.add("jackfruits");
        list1.add("cd");

        System.out.println(list1);

        Set<String>hasset=new HashSet<String>(list1);
        System.out.println(hasset);

        List<Integer>list2=new ArrayList<Integer>(2);
        list2.add(2);
        list2.add(3);
        list2.add(5);
        list2.add(10);
        System.out.println(list2.size());
        list2.remove(2);
        System.out.println(list2.size());

    }
}
