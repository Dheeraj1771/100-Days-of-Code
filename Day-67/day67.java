public class day67 {
    public int scoreOfString(String s) {
        int score = 0;
        for(int i=0; i<s.length()-1; i++) {
            score += Math.abs((s.charAt(i)-'a') - (s.charAt(i+1) - 'a'));
        }
        return score;
    }
}