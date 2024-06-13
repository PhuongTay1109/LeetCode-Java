import java.util.Stack;

public class ReverseWordsInAString {
    public static String reverseWords(String s) {
        String[] words = s.split("\\s+");
        StringBuilder reversedStringBuilder = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedStringBuilder.append(words[i]);
            if (i != 0) {
                reversedStringBuilder.append(" ");
            }
        }
        return reversedStringBuilder.toString().trim();

    }

    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }

}
