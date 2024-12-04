public class day63 {
    public void reverseString(char[] s) {
        int j = s.length - 1;
        for(int i=0; i<s.length/2; i++) {
            char k = s[i];
            s[i] = s[j];
            s[j] = k;
            j--;
        }
        System.out.println("[ ");
        for(int i=0; i<s.length; i++) {
            System.out.println(s[i] + " ");
        }
        System.out.println("]");
    }

}