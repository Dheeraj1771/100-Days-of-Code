public class day95 {
    public int countAsterisks(String s) {
        int bar = 0;
        int count = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '|') {
                bar++;
            }
            if(bar % 2 == 0 && s.charAt(i) == '*') {
                count++;
            }
        }
        return count;
    }
}