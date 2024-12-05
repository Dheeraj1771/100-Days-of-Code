//Day64/100: LeetCode 1528. Shuffle String
public class day64 {
    public String restoreString(String s, int[] indices) {
        char sarr[] = new char[s.length()];
        int j = 0;
        for(int i : indices) {
            sarr[i] = s.charAt(j);
            j++;
        }
        return new String(sarr);
    }
    public static void main(String[] args) {
        String s = "codeleet";
        
    }
}