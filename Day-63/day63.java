//Day63/100: LeetCode 344. Reverse String
    public static void reverseString(char[] s) {
        int j = s.length - 1;
        for(int i=0; i<s.length/2; i++) {
            char k = s[i];
            s[i] = s[j];
            s[j] = k;
            j--;
        }
        System.out.print("[ ");
        for(int i=0; i<s.length; i++) {
            System.out.print(s[i] + " ");
        }
        System.out.print("]");
    }
    public static void main(String[] args) {
        char s[] = new char[] {'h','e','l','l','o'};
        reverseString(s);
    }
}