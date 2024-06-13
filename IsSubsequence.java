public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        char[] s_char = s.toCharArray();
        char[] t_char = t.toCharArray();
        int s_length = s_char.length;
        int t_length = t_char.length;

        if (s_length == 0) return true;
        if (s_length > t_length) return false;

        int s_index = 0;
        int t_index = 0;

        while(t_index < t_length && s_index < s_length) {
            if (s_char[s_index] == t_char[t_index]) {
                s_index++;
                t_index++;
            }
            else {
                t_index++;
            }
       }

       if(s_index == s_length)
            return true;

        return false;
    }

    public static void main(String[] args) {
        String s = "";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }
}
