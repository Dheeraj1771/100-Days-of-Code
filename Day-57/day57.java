//Day57/100: LeetCode: 520. Detect Capital
public class day57 {
    public boolean detectCapitalUse(String word) {
        int lower = 0;
        int upper = 0;
        for(int i=0; i<word.length(); i++) {
            if(Character.isUpperCase(word.charAt(i))) {
                upper++;
            } 
            else {
                lower++;
            } 
        }
        if(upper == word.length() || lower == word.length()){
            return true;
        } 
        else if(Character.isUpperCase(word.charAt(0)) && lower == word.length()-1){
            return true;
        }   
        else {
            return false;
        }
    }
}