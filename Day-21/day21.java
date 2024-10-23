//Day21/100: LeetCode: 2427. Number of Common Factor  
public class day21 {
    public int commonFactors(int a, int b) {
        int count = 0;
        for(int i=1; i<=Math.min(a,b); i++) {
            if(a%i==0 && b%i==0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        
    }
    
}
