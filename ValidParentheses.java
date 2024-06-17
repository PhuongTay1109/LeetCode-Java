import java.util.Stack;

public class ValidParentheses {
    static boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        for (int i = 0 ; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }
            else if (ch == ')') {
                if (st.empty()) {
                    return false;
                }
                else if(st.peek() == '(')  {
                    st.pop();
                }
                else {
                    return false;
                }   
            }
            else if (ch == '}') {
                if (st.empty()) {
                    return false;
                }
                else if(st.peek() == '{')  {
                    st.pop();
                }
                else {
                    return false;
                }
            }
            else if (ch == ']') {
                if (st.empty()) {
                    return false;
                }
                else if(st.peek() == '[') {
                    st.pop();
                }
                else {
                    return false;
                }                     
            }
        }

        return st.empty();
    }

    public static void main(String[] args) {
        System.out.println(isValid( "()[]{}"));
        System.out.println(isValid( ""));
    }
}
