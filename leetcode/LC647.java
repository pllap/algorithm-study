public class LC647 {

    public int countSubstrings(String s) {
        if (s.length() == 1) {
            return 1;
        }

        int length = s.length();
        int count = 0;
        // 각 인덱스에서 좌우로 확장하며 회문인지 검사한다
        for (int i = 0; i < length; ++i) {
            count += expand(s, length, i, i);
            count += expand(s, length, i, i + 1);
        }

        return count;
    }

    private int expand(String s, int length, int left, int right) {
        int count = 0;
        while (left >= 0 && right < length && s.charAt(left) == s.charAt(right)) {
            ++count;
            --left;
            ++right;
        }
        return count;
    }
}
