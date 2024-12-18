//Day61/100: LeetCode 28. Find the Index of the First Occurrence in a String
public class day61 {
    public static int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length()) {
            return -1;
        }
        for(int i=0; i<=haystack.length() - needle.length(); i++) {
            if(haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String haystack = "HelloWorld";
        String needle = "Hello";
        int ans = strStr(haystack, needle);
        System.out.println(ans);
    }
}
