//Day9/100: LeetCode: 20. Valid Parentheses 
import java.util.Stack;
public class day9 {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                st.push(s.charAt(i));
            } else {
                if (st.isEmpty()) {
                    return false;
                } else {
                    char top = st.peek();
                    if (s.charAt(i) == ')' && top == '(' || s.charAt(i) == ']' && top == '['
                            || s.charAt(i) == '}' && top == '{') {
                        st.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        if (st.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        String s = "({{}})";
        boolean ans = isValid(s);
        System.out.println(ans);
    }
}
