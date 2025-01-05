//Day95/100: LeetCode 2315. Count Asterisks
public class day95 {
    public static int countAsterisks(String s) {
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
    public static void main(String[] args) {
        String s = "l|*e*et|c**o|*de|";

    }
}