public class day72 {
    public static int countSegments(String s) {
        int count = 0;
        String arr[] = s.split(" ");
        for(String c : arr) {
            if(!c.isEmpty()) {
                count += 1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "Hello, my name is Dheeraj";
        int ans = countSegments(s);
        
    }
}