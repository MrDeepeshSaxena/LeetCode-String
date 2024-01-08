public class Jewels_and_Stones_771 {

    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        int jewelsLen = jewels.length();
        for (int j = 0; j < jewelsLen; j++) {
            for (int k = 0; k < stones.length(); k++) {
                if (jewels.charAt(j) == stones.charAt(k)) {
                    count += 1;
                }
            }

        }
        return count;
    }
}
