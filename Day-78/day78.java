public class day78 {
    public String interpret(String command) {
        String res = "";
        for(int i=0; i<command.length(); i++) {
            if(command.charAt(i) == 'G') {
                res += "G";
            } 
            if(command.charAt(i) == '(') {
                if(command.charAt(i+1) == ')') {
                    res += "o";
                    i++;
                } else {
                    res += "al";
                    i+=3;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String ans =
    }
}