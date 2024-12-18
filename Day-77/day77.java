//Day77/100: LeetCode 2011. Final Value of Variable After Performing Operations
public class day77 {
    public static int finalValueAfterOperations(String[] operations) {
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
    public static void main(String[] args) {
        String operations[] = new String[] {"--X","X++","X++"};
        int ans = finalValueAfterOperations(operations);
        System.out.println(ans);
    }
}