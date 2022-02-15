import java.util.ArrayList;
import java.util.List;

public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        if (len1 > len2) {
            return false;
        }
        // s1의 각 문자의 개수를 센다
        int[] count1 = new int[26];
        for (int i = 0; i < len1; ++i) {
            ++count1[s1.charAt(i) - 'a'];
        }
        // 슬라이딩 윈도우로 s2의 각 구간의 문자의 count가 맞는 게 있으면 true
        for (int i = 0; i < len2 - len1 + 1; ++i) {
            int[] count2 = new int[26];
            for (int j = i; j < i + len1; ++j) {
                ++count2[s2.charAt(j) - 'a'];
            }
            if (check(count1, count2)) {
                return true;
            }
        }
        // 맞는 게 없었으면 false
        return false;
    }

    private boolean check(int[] count1, int[] count2) {
        for (int j = 0; j < 26; ++j) {
            if (count1[j] > count2[j]) {
                return false;
            }
        }
        return true;
    }

    // 순열을 실제로 만들어서 비교 - 시간 초과
    public boolean checkInclusion1(String s1, String s2) {
        // s1의 순열을 s2가 포함하고 있으면 true

        // 순열을 만들어서 배열에 담는다
        List<String> permutations = new ArrayList<>();
        boolean[] visited = new boolean[s1.length()];
        makePermutations(permutations, s1, "", visited);

        // 만든 순열을 s2가 포함하는지 검사한다
        for (String permutation : permutations) {
            if (s2.contains(permutation)) {
                return true;
            }
        }

        return false;
    }

    void makePermutations(List<String> result, String str, String current, boolean[] visited) {
        if (current.length() == str.length()) {
            result.add(current);
            return;
        }

        for (int i = 0; i < str.length(); ++i) {
            if (!visited[i]) {
                visited[i] = true;
                makePermutations(result, str, current + str.charAt(i), visited);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        String s1;
        String s2;

        s1 = "ab";
        s2 = "eidbaooo";
        System.out.println(new PermutationInString().checkInclusion(s1, s2));

        s1 = "ab";
        s2 = "eidboaoo";
        System.out.println(new PermutationInString().checkInclusion(s1, s2));

        s1 = "abcdxabcde";
        s2 = "abcdeabcdx";
        System.out.println(new PermutationInString().checkInclusion(s1, s2));
    }
}
