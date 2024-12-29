//Day88/100: LeetCode 917. Reverse Only Letters
public class day88 {
    public String reverseOnlyLetters(String s) {
        String letters = "";
        for(int i = s.length()-1; i>=0; i--) {
            if(Character.isLetter(s.charAt(i))) {
                letters += s.charAt(i);
            }
        }
        String result = "";
        int index = 0;
        for(int i=0; i<s.length(); i++) {
            if(Character.isLetter(s.charAt(i))) {
                result += letters.charAt(index);
                index++;
            } else {
                result += s.charAt(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        
    }
}