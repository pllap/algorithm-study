public class LC8 {
    public int myAtoi(String s) {
        // 앞뒤로 공백을 자른다
        s = s.strip();
        // 빈 문자열이면 0
        if ("".equals(s)) {
            return 0;
        }

        // 문자열보단 배열이 좀 더 빠르지 않을까 해서
        char[] charArray = s.toCharArray();

        // left부터 right까지 숫자로 채운다
        int left = 0;
        int right = 0;
        boolean isNegative = charArray[0] == '-';
        if (charArray[0] == '+' || charArray[0] == '-') {
            left = right = 1;
        }

        // 순회하면서 left랑 right를 먼저 구한다
        while (right < charArray.length && Character.isDigit(charArray[right])) {
            ++right;
        }
        while (left < right && charArray[left] == '0') {
            ++left;
        }

        // 자릿수 체크, long으로도 커버 안되는 범위면 자르기
        if (right - left > 10) {
            return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }

        // 계산
        long result = 0;
        for (int i = left; i < right; ++i) {
            result *= 10;
            result += charArray[i] - '0';
        }

        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
        return (int) (isNegative ? -result : result);
    }

    public static void main(String[] args) {
        System.out.println(new LC8().myAtoi("42"));
        System.out.println(new LC8().myAtoi("   -42"));
        System.out.println(new LC8().myAtoi("4193 with words"));
        System.out.println(new LC8().myAtoi("1 2 3 4 5"));
        System.out.println(new LC8().myAtoi("1a2b3c4d5e"));
        System.out.println(new LC8().myAtoi("-91283472332")); // -2147483648
        System.out.println(new LC8().myAtoi(""));
        System.out.println(new LC8().myAtoi("+"));
        System.out.println(new LC8().myAtoi("-"));
        System.out.println(new LC8().myAtoi("     "));
        System.out.println(new LC8().myAtoi("18446744073709551617"));
    }
}
