public class Find_the_K_Beauty_of_a_Number_2269 {
    public int divisorSubstrings(int num, int k) {
        final String s = String.valueOf(num);
        int ans = 0;

        for (int i = 0; i + k <= s.length(); ++i) {
            final int x = Integer.parseInt(s.substring(i, i + k));
            if (x != 0 && num % x == 0)
                ++ans;
        }

        return ans;
    }
}
