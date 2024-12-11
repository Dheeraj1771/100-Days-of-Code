public class day70 {
    public static int numJewelsInStones(String jewels, String stones) {
        char arr1[] = jewels.toCharArray();
        char arr2[] = stones.toCharArray();
        int count = 0;
        for(char c1 : arr1) {
            for(char c2 : arr2) {
                if(c1 == c2) {
                    count += 1;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String jewel = "AD";
        String stones = "ADaabbccAD";
        int ans = numJewelsInStones(jewel, stones);
        System.out.println(ans);
    }
}