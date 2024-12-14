//Day73/100: LeetCode 657. Robot Return to Origin
public class day73 {
    public static boolean judgeCircle(String moves) {
        int up = 0;
        int down = 0;
        int left = 0;
        int right = 0;
        for(int i=0; i<moves.length(); i++) {
            if(moves.charAt(i) == 'R') {
                right++;
            } else if(moves.charAt(i) == 'L') {
                left++;
            } else if(moves.charAt(i) == 'U') {
                up++;
            } else {
                down++;
            }
        }
        return up == down && left == right;
    }
    public static void main(String[] args) {
        
    }
}