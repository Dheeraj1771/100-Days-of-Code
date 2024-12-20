public class day79 {
    public int mostWordsFound(String[] sentences) {
        int maxlen = 0;
        for(String s : sentences) {
            int currlen = s.split(" ").length;
            maxlen = Math.max(maxlen, currlen);
        }
        return maxlen;
    }
}