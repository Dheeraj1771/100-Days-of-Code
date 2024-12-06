//Day65/100: LeetCode 796. Rotate String
public class day65 {
    public static boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) {
            return false;
        }
        return (s+s).contains(goal);
    }
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        boolean ans = rotateString(s, goal);
        System.out.println(ans);
    }
}