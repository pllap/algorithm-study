import java.util.ArrayList;
import java.util.List;

public class LC763 {
    public List<Integer> partitionLabels(String s) {

        int length = s.length();

        // 각 글자가 등장하는 마지막 인덱스
        int[] lastIndex = new int[26];
        for (int i = 0; i < length; ++i) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        List<Integer> partitions = new ArrayList<>();

        // 지금 보는 글자의 마지막 인덱스가 현재 알고 있는 마지막 인덱스(right)보다 크다면 구간을 갱신한다
        // 지금 보는 글자의 마지막 인덱스가 현재 보고 있는 인덱스라면 다음 구간으로 넘어간다
        int left = 0;
        int right = lastIndex[s.charAt(0) - 'a'];
        for (int i = 0; i < length; ++i) {
            int lastIndexOfCurChar = lastIndex[s.charAt(i) - 'a'];
            if (lastIndexOfCurChar > right) {
                right = lastIndexOfCurChar;
            }
            if (i == right) {
                partitions.add(right - left + 1);
                if (i == length - 1) {
                    return partitions;
                }
                left = i + 1;
                right = lastIndex[s.charAt(left) - 'a'];
            }
        }

        return partitions;
    }

    public static void main(String[] args) {
        System.out.println(new LC763().partitionLabels("ababcbacadefegdehijhklij"));
        System.out.println(new LC763().partitionLabels("eccbbbbdec"));
    }
}
