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
        int hours[] = new int[] {1,2,3,4,5,6};
        int target = 3;
        int ans = numberOfEmployeesWhoMetTarget(hours, target);
    }
}