package filereader;

import java.util.HashSet;
import java.util.Set;

public class CountnonDuplicateValue {
    public static void main(String[] args) {

        String sen = "selenium is a great tools for automation selenium is a open source tools";
        String[] words = sen.split("\\s+");
        Set<String> hasset = new HashSet<String>();
        int count=0;
        for (String s:words
             ) {

            if (hasset.add(s) != false) {
                count++;
            }
        }

            System.out.println(hasset);

            System.out.println(count);


    }
}