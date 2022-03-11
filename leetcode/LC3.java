public class LC3 {

    public int lengthOfLongestSubstring(String s) {
        int sLength = s.length();
        if (sLength < 2) {
            return s.length();
        }

        boolean[] contained = new boolean[128];
        contained[s.charAt(0)] = true;

        int length = 0;
        int left = 0;
        int right = 1;
        while (right < sLength) {
            if (!contained[s.charAt(right)]) {
                contained[s.charAt(right++)] = true;
                length = Math.max(length, right - left);
            } else {
                contained[s.charAt(left)] = false;
                ++left;
            }
        }

        return length;
    }

    public static void main(String[] args) {
        System.out.println(new LC3().lengthOfLongestSubstring("abcabcbb"));
        System.out.println(new LC3().lengthOfLongestSubstring("bbbbb"));
        System.out.println(new LC3().lengthOfLongestSubstring("pwwkew"));
        System.out.println(new LC3().lengthOfLongestSubstring("   "));
        System.out.println(new LC3().lengthOfLongestSubstring(" 12JABCabc "));
    }
}
