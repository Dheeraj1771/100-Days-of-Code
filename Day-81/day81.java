public class day81 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
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
}