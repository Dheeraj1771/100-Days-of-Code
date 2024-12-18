//Day77/100: LeetCode 2011. Final Value of Variable After Performing Operations
public class day77 {
    public int finalValueAfterOperations(String[] operations) {
        int X = 0;
        for(String s : operations) {
            if(s.charAt(1) == '+') {
                X++;
            } else {
                X--;
            }
        }
        return X;
    }
}