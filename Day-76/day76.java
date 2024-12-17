//Day76/100: LeetCode 2942. Find Words Containing Character
import java.util.*;
public class day76 {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> arrlst = new ArrayList<>();
        for(int i=0; i<words.length; i++) {
            for(int j=0; j<words[i].length(); j++) {
                if(words[i].charAt(j) == x) {
                    arrlst.add(i);
                    break;
                }
            }
        }
        return arrlst;
    }
    public static void main(String[] args) {
        String words[] = new String[] {"leet","code"};
        char x = 'e';
    }
}