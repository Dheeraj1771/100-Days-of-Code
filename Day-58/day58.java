public class day58 {
    public static String truncateSentence(String s, int k) {
        String arr[] = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<k; i++) {
            sb.append(arr[i] + " ");
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        String S = "Hello how are you Contestant";
        int k = 4;
        String ans = truncateSentence(S, k);
        System.out.println(ans);
    }
}
