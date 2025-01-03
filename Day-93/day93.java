//Day93/100: LeetCode 1773. Count Items Matching a Rule
import java.util.*;
public class day93 {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for(List i : items) {
            if(ruleKey.equals("type") && i.get(0).equals(ruleValue)) count++;
            else if(ruleKey.equals("color") && i.get(1).equals(ruleValue)) count++;
            else if(ruleKey.equals("name") && i.get(2).equals(ruleValue)) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        items.add(new ArrayList<>(List.of("phone", "blue", "pixel")));
        items.add(new ArrayList<>(List.of("computer", "silver", "lenovo")));
        items.add(new ArrayList<>(List.of("phone", "gold", "iphone")));
        String ruleKey = "color";
        String rulwValue = "gold";
        int ans = countMatches(items, ruleKey, rulwValue);
        System.out.println(ans);
    }
}