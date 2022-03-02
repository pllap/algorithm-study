public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {
        int idxS = 0;
        int idxT = 0;
        int lengthS = s.length();
        int lengthT = t.length();

        while (true) {
            if (idxS == lengthS) {
                return true;
            }
            if (idxT == lengthT) {
                return false;
            }
            if (s.charAt(idxS) == t.charAt(idxT)) {
                ++idxS;
                ++idxT;
                continue;
            }
            ++idxT;
        }
    }

    public static void main(String[] args) {
        System.out.println(new IsSubsequence().isSubsequence("abc", "ahbgdc"));
        System.out.println(new IsSubsequence().isSubsequence("axc", "ahbgdc"));
        System.out.println(new IsSubsequence().isSubsequence("ace", "abcde"));
        System.out.println(new IsSubsequence().isSubsequence("aec", "abcde"));
        System.out.println(new IsSubsequence().isSubsequence("aaaaaa", "bbaaaa"));
    }
}
