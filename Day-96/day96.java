//Day96/100: LeetCode 3285. Find Indices of Stable Mountains
import java.util.*;
public class day96 {
    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<height.length-1; i++) {
            if(height[i] > threshold) {
                list.add(i+1);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int height[] = new int[] {1,2,3,4,5};
        int threshold = 2;
        
    }
}
