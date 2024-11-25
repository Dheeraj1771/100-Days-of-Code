public class day54 {
    public int findLucky(int[] arr) {
        int lucky_int = -1;
        int freq[] = new int[arr.length + 1];
        for(int i : arr) {
            if(i >= 1 && i <= arr.length) {
                freq[i]++;
            }
        }
        for(int i=1; i<=arr.length; i++) {
            if(freq[i] == i) {
                lucky_int = Math.max(i, lucky_int);
            }
        }
        return lucky_int;
    }
    public static void main(String[] args) {
        
    }
}