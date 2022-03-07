import java.util.Arrays;
import java.util.Comparator;

public class RemoveCoveredIntervals {

    public int removeCoveredIntervals(int[][] intervals) {
        // 구간의 시작을 기준으로 intervals 배열을 정렬한다
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));

        // 첫 번째 구간의 시작과 끝을 기준으로 한다
        int start = intervals[0][0];
        int end = intervals[0][1];
        int count = 1;

        // 뒤 구간은 현재 구간보다 항상 시작점이 같거나 크다
        // 따라서 다음과 같은 경우만 고려하면 된다
        // 구간이 겹치는 경우:
        // - 시작점이 서로 같고, 뒤 구간의 끝점이 현재 구간의 끝점보다 작은 경우
        // - 뒤 구간이 현재 구간에 완전 포함되는 경우
        // 구간이 겹치지 않는 경우:
        // - 뒤 구간이 현재 구간에 포함되지 않는 경우
        // 이 중 구간이 겹칠 때는 세지 않고, 구간이 겹치지 않는 경우에만 센다
        for (int[] interval : intervals) {
            if (interval[0] > start && interval[1] > end) {
                ++count;
                start = interval[0];
            }
            end = Math.max(end, interval[1]);
        }

        return count;
    }

    public static void main(String[] args) {
        int[][] intervals;

        intervals = new int[][]{{1, 4}, {3, 6}, {2, 8}};
        System.out.println(new RemoveCoveredIntervals().removeCoveredIntervals(intervals)); // 2

        intervals = new int[][]{{3, 10}, {4, 10}, {5, 11}};
        System.out.println(new RemoveCoveredIntervals().removeCoveredIntervals(intervals)); // 2

        intervals = new int[][]{{1, 2}, {1, 4}, {3, 4}};
        System.out.println(new RemoveCoveredIntervals().removeCoveredIntervals(intervals)); // 1

        intervals = new int[][]{{66672, 75156}, {59890, 65654}, {92950, 95965}, {9103, 31953}, {54869, 69855}, {33272, 92693}, {52631, 65356}, {43332, 89722}, {4218, 57729}, {20993, 92876}};
        System.out.println(new RemoveCoveredIntervals().removeCoveredIntervals(intervals)); // 3
    }
}
