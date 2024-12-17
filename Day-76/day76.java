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
}