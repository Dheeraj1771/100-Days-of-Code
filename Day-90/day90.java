//Day90/100: LeetCode 2798. Number of Employees Who Met the Target
import java.util.*;
public class day90 {
    public static String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        Map<Integer, String> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            map.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        for(int i=0; i<n/2; i++) {
            int temp = heights[i];
            heights[i] = heights[n - 1 - i];
            heights[n - 1 - i] = temp;
        }
        for(int i=0; i<n; i++) {
            names[i] = map.get(heights[i]);
        }
        return names;
    }
    public static void main(String[] args) {
        String names[] = new String[] {"Mary","John","Emma"};
        int heights[] = new int[] {180,165,170};
        String ans[] = sortPeople(names, heights);
        System.out.print("[ ");
        for(int i=0; i<ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.print("]");
    }
}