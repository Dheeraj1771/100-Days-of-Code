//Day60/100: LeetCode: 1374. Generate a String With Characters That Have Odd Counts
public class day60 {
    public static String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        if(n%2 == 0) {
            for(int i=0; i<n-1; i++) {
                sb.append("a");
            }
            sb.append("d");
        } else {
            for(int i=0; i<n; i++) {
                sb.append("a");
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        int n = 4;
        String ans = generateTheString(n);
        System.out.println(ans);
    }
}