//Day80/100: LeetCode 1662. Check If Two String Arrays are Equivalent
public class day81 {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String w1 = "";
        String w2 = "";
        for(int i=0; i<word1.length; i++) {
            w1 += word1[i];
        }
        for(int j=0; j<word2.length; j++) {
            w2 += word2[j];
        }
        if(w1.equals(w2)) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        String word1[] = new String[] {"leet", "code"};
        String word2[] = new String[] {"le", "et", "co", "de"};
        boolean ans = arrayStringsAreEqual(word1, word2);
        System.out.println(ans);
    }
}