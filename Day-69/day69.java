public class day69 {
    public static String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for(char c : address.toCharArray()) {
            if(c == '.') {
                sb.append("[.]");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        
    }
}