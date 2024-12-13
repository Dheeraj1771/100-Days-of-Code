public class day72 {
    public int countSegments(String s) {
        int count = 0;
        String arr[] = s.split(" ");
        for(String c : arr) {
            if(!c.isEmpty()) {
                count += 1;
            }
        }
        return count;

    }
}