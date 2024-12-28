//Day87/100: LeetCode 1431. Kids With the Greatest Number of Candies
import java.util.*;
public class day87 {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();
        int maxcan = 0;
        int currcan = 0;
        for(int i=0; i<candies.length; i++) {
            currcan = candies[i];
            maxcan = Math.max(currcan, maxcan);
        }
        for(int j : candies) {
            if(j + extraCandies >= maxcan) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int candies[] = new int[] {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }
}