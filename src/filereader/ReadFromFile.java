package filereader;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class ReadFromFile {
    public static void main(String[] args) throws Exception {
        String textFile = System.getProperty("user.dir") + "/data/file";
        FileReader fr = null;
        BufferedReader br = null;
        BufferedReader br1 = null;
        //Connect to database
        // ConnectDB connectDB = new ConnectDB();
        //create table in Mysql database
        // connectDB.createTableFromStringToMySql("SelfDrivingCar","text" );

        try {
            fr = new FileReader(textFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        br = new BufferedReader(fr);
        //br1 = new BufferedReader(fr);
        String text, text1;
        Stack stack = new Stack();  // Create Stack
        LinkedList<String> linkedList = new LinkedList<>();
        int count = 0;
        try {
            while ((text = br.readLine()) != null) {
                System.out.println(text);
                String[] words = text.split(" ");
                /*for (int i = 0; i < words.length; i++) {       //loop to read
                    stack.push(words[i]);

                    //System.out.println("Stack "+stack.peek());
                    linkedList.add(words[i]);
                    //System.out.println("LinkedList "+linkedList.get(i));
                }*/
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
                br.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
