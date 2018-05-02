public class reverseStringWithoutOrder {
    public static void main(String[] args) {
        String sentence="I am so good at selenium webdriver";
        reverseEachWordOfString(sentence);
    }



    static void reverseEachWordOfString(String inputString)
    {
        String[] words = inputString.split(" ");

        String newString = "";

        for (int i = 0; i < words.length; i++)
        {
            String word = words[i];

            String reverseWord = "";

            for (int j = word.length()-1; j >= 0; j--)
            {
                reverseWord = reverseWord + word.charAt(j);
            }

            newString = newString + reverseWord + " ";
        }

        System.out.println(inputString);

        System.out.println(newString);
    }
}
