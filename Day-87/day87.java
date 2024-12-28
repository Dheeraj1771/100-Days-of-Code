public class day87 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();
        int maxcan = 0;
        int currcan = 0;
        for(int i=0; i<candies.length; i++) {
            currcan = candies[i];
            maxcan = Math.max(currcan, maxcan);
        }
        for(int j : candies) {
            if(j + extraCandies >= maxcan) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }
}