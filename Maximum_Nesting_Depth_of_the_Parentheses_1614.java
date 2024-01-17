
public class Maximum_Nesting_Depth_of_the_Parentheses_1614 {
    public int maxDepth(String s) {
        int ans = 0;
        int opened = 0;

        for (final char c : s.toCharArray())
            if (c == '(')
                ans = Math.max(ans, ++opened);
            else if (c == ')')
                --opened;

        return ans;
    }
}
