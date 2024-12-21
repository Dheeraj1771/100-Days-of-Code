//Day80/100: LeetCode 412. Fizz Buzz
import java.util.*;
public class day80 {
    public static List<String> fizzBuzz(int n) {
        ArrayList<String> list = new ArrayList<>();
        for(int i=1; i<=n; i++) {
            if(i%3 == 0 && i%5 == 0) {
                list.add("FizzBuzz");
            } else if(i%3 == 0) {
                list.add("Fizz");
            } else if(i%5 == 0) {
                list.add("Buzz");
            } else {
                list.add(Integer.toString(i));
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int n = 6;
    }
}