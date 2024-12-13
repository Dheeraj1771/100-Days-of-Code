//Day71/100: LeetCode 389. Find the Difference
public class day71 {
    public static char findTheDifference(String s, String t) {
        char result = 0;
        for(int i = 0; i<s.length(); i++){
            result = (char)(result ^ s.charAt(i));
        }
        for(int i = 0; i<t.length(); i++){
            result = (char)(result ^ t.charAt(i));
        }
        return result;
    }
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        char ans = findTheDifference(s, t);
        System.out.println(ans);
    }
}