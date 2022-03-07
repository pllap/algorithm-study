import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {

        int answer = 0;

        Map<Character, Integer> symbol = new HashMap<>();
        symbol.put('I', 1);
        symbol.put('V', 5);
        symbol.put('X', 10);
        symbol.put('L', 50);
        symbol.put('C', 100);
        symbol.put('D', 500);
        symbol.put('M', 1000);

        int length = s.length();
        for (int i = 0; i < length - 1; ++i) {
            if (symbol.get(s.charAt(i)) < symbol.get(s.charAt(i + 1))) {
                answer -= symbol.get(s.charAt(i));
            } else {
                answer += symbol.get(s.charAt(i));
            }
        }

        return answer + symbol.get(s.charAt(length - 1));
    }

    // 너무 복잡해서 새로 짬
    public int romanToInt1(String s) {

        int answer = 0;

        Map<Character, Integer> symbol = new HashMap<>();
        symbol.put('I', 1);
        symbol.put('V', 5);
        symbol.put('X', 10);
        symbol.put('L', 50);
        symbol.put('C', 100);
        symbol.put('D', 500);
        symbol.put('M', 1000);
        int length = s.length();

        char before = s.charAt(0);
        char current = s.charAt(0);
        int count = 0;
        for (int i = 1; i < length; ++i) {
            ++count;
            current = s.charAt(i);
            if (current != before) {
                if (before == 'I' && current == 'V' ||
                        before == 'I' && current == 'X' ||
                        before == 'X' && current == 'L' ||
                        before == 'X' && current == 'C' ||
                        before == 'C' && current == 'D' ||
                        before == 'C' && current == 'M') {
                    answer += symbol.get(current) - symbol.get(before);
                    ++i;
                    if (i >= length) {
                        return answer;
                    }
                    current = s.charAt(i);
                } else {
                    answer += symbol.get(before) * count;
                }
                count = 0;
            }
            before = current;
        }

        answer += symbol.get(before) * (count + 1);

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new RomanToInteger().romanToInt("III"));
        System.out.println(new RomanToInteger().romanToInt("LVIII"));
        System.out.println(new RomanToInteger().romanToInt("MCMXCIV"));
    }
}
