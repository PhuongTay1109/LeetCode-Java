public class ReverseVowelsOfAString {
    public static String reverseVowels(String s) {
        if (s.length() <= 1) return s;
        
        char[] chars = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !isVowel(chars[left]))
                left++;
            
            while (left < right && !isVowel(chars[right]))
                right--;
            
            if (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverseVowels(s));
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

}
