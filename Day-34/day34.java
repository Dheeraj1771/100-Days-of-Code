//Day34/100: LeetCode: 292. Nim Game
public class day34 {
    public static boolean canWinNim(int n) {
        return (n % 4 != 0);
    }
    public static void main(String[] args) {
        int n = 3;
        boolean ans = canWinNim(n);
        System.out.println(ans);
    }
}
