public class day74 {
    public String toLowerCase(String s) {
        char res[] = s.toCharArray();
        for(int i=0; i<s.length(); i++) {
            res[i] = Character.toLowerCase(res[i]);
        }
        String a = new String(res);
        return a;
    }
}