public class LC1663 {
    public String getSmallestString(int n, int k) {

        char[] result = new char[n];
        int index = n - 1;
        while (index >= 0 && k >= index) {
            int ch = 26;
            // k - index = 들어갈수 있는 가장 큰 문자
            if (k - index < ch) {
                ch = k - index;
            }
            result[index] = (char) ('a' - 1 + ch);
            k -= ch;
            index--;
        }

        return new String(result);
    }

    public static void main(String[] args) {
        System.out.println(new LC1663().getSmallestString(3, 27));
        System.out.println(new LC1663().getSmallestString(5, 73));
        System.out.println(new LC1663().getSmallestString(5, 31));
        System.out.println(new LC1663().getSmallestString(24, 552));
    }
}
