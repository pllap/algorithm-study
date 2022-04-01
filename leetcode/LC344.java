public class LC344 {
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; ++i) {
            swap(s, i, s.length - 1 - i);
        }
    }

    void swap(char[] s, int left, int right) {
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
    }
}
