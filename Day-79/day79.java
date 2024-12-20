//Day79/100: LeetCode 2114. Maximum Number of Words Found in Sentences
public class day79 {
    public static int mostWordsFound(String[] sentences) {
        int maxlen = 0;
        for(String s : sentences) {
            int currlen = s.split(" ").length;
            maxlen = Math.max(maxlen, currlen);
        }
        return maxlen;
    }
    public static void main(String[] args) {
        String sentences[] = new String[] {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int ans = mostWordsFound(sentences);
        System.out.println(ans);
    }
}