//Day89/100: LeetCode 2798. Number of Employees Who Met the Target
public class day89 {
    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for(int i : hours) {
            if(i >= target) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        
    }
}