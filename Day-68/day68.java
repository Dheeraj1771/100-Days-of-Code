public class day68 {
    public static String firstPalindrome(String[] words) {
        for(int i=0; i<words.length; i++) {
            StringBuilder sb = new StringBuilder();
            String s = words[i];
            for(int j=s.length()-1; j>=0; j--) {
                sb.append(s.charAt(j));
            }
            if(sb.toString().equals(words[i])) {
                return sb.toString();
            }
            
        }
        return "";
    }
    public static void main(String[] args) {
        String words[] = new String[] {"abc","car","ada","racecar","cool"};
        String ans = firstPalindrome(words);
        
    }
}