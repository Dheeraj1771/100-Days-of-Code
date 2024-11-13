//Day42/100: LeetCode: 1720. Decode XORed Array
public class day42 {
    public static int[] decode(int[] encoded, int first) {
        int decoded[] = new int[encoded.length+1];
        decoded[0] = first;
        for(int i=0; i<encoded.length; i++) {
            decoded[i+1] = decoded[i] ^ encoded[i];
        }
        return decoded;
    }
    public static void main(String[] args) {
        int encoded[] = new int[] {1,2,3};
        int first = 1;

    }
}