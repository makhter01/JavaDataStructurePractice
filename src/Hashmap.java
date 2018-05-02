import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args) {
        Map<String,Integer> hashmap=new HashMap<>();
        hashmap.put("jack",21);
        hashmap.put("rob",22);
        hashmap.put("Bob",23);
        hashmap.put("Russel",24);
        hashmap.put("David",25);
        hashmap.put("John",26);
        hashmap.put("Cal",27);
        hashmap.put("Mar",28);

        Set<String> keyset=hashmap.keySet();
        System.out.println("the keya are using keyset : ");
        for (String s:keyset
             ) {
            System.out.println(s+" , ");

        }

        System.out.println("keys and value using entryset :");

        Set<Map.Entry<String,Integer>> hasset=hashmap.entrySet();
        for (Map.Entry<String,Integer> e:
                hasset
             ) {
            System.out.println(" key is "+e.getKey()+ " value is "+ e.getValue());

        }
        System.out.println("***************************");

        System.out.println(hashmap);

    }
}
