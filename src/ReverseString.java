public class ReverseString {
    public static void main(String[] args) {
        String sentence = "I am     a automation enginner";
        String[] sen = sentence.trim().split("\\s+");
        String rev = "";
        for (int i = sen.length - 1;i>=0;i--) {
            rev+=sen[i]+" ";

        }
        System.out.println("reverse string "+rev.trim());
    }
}
