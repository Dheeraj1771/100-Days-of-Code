import java.util.*;
public class day66 {
    public static int findPermutationDifference(String s, String t) {
        int perdiff = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<t.length(); i++) {
            map.put(t.charAt(i), i);
        }
        for(int i=0; i<s.length(); i++) {
            perdiff += Math.abs(i - map.get(s.charAt(i)));
        }
        return perdiff;
    }
    public static void main(String[] args) {
        String s = "abc";
        String t = "bac";
    }
}