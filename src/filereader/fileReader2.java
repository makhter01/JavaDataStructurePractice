package filereader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class fileReader2 {
    public static void main(String[] args)throws Exception {
        String path=System.getProperty("user.dir")+"/data/file";
        FileReader file=null;
        BufferedReader br=null;
        try{
            file=new FileReader(path);

        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }

        br=new BufferedReader(file);
        String text;
        List<String>list=new LinkedList<>();
        Stack<String> stack=new Stack<>();

        try{
            while ((text=br.readLine())!=null){
                System.out.println(text);
                String [] arr=text.split(" ");
                for(int i=0;i<arr.length;i++) {
                    list.add(arr[i]);
                }
                    System.out.println(" list items"+list);

            }

        }

        catch (Exception ex){
            ex.printStackTrace();
        }

        finally {
            try{
                file.close();
                br.close();
            }
            catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }
}
