import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    public static void main(String [] args){

        String [] arr={"book","table","pen","tablet"};
        List<String>arrayList= Arrays.asList(arr);
        for(String newArr:arrayList){
            System.out.println(newArr);
        }


    }
}
