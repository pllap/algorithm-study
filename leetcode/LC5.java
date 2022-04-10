public class LC5 {

    public String longestPalindrome(String s) {
        // 양쪽으로 확장해 나간다
        int sLength = s.length();

        if (sLength == 1) {
            return s;
        }

        String longest = "";
        for (int i = 0; i < sLength - 1; ++i) {
            // 홀수 길이 확장
            longest = extendPalindrome(s, sLength, longest,  i, i);
            // 짝수 길이 확장
            longest = extendPalindrome(s, sLength, longest, i, i + 1);
        }

        return longest;
    }

    String extendPalindrome(String s, int sLength, String longest, int left, int right) {
        while (left >= 0 && right < sLength && s.charAt(left) == s.charAt(right)) {
            --left;
            ++right;
        }
        return right - left - 1 > longest.length() ? s.substring(left + 1, right) : longest;
    }

    public static void main(String[] args) {
        System.out.println(new LC5().longestPalindrome("babad"));
        System.out.println(new LC5().longestPalindrome("cbbd"));
        System.out.println(new LC5().longestPalindrome("a"));
    }
}
