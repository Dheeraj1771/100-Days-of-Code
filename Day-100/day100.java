//Day100/100: LeetCode 2769. Find the Maximum Achievable Number
public class day100 {
    public static int theMaximumAchievableX(int num, int t) {
        return num + t * 2;
    }
    public static void main(String[] args) {
        int num = 4;
        int t = 1;
        int ans = theMaximumAchievableX(num, t);
        System.out.println(ans);
    }
}