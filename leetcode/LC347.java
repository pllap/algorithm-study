import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class LC347 {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numCount = new HashMap<>();
        for (int num : nums) {
            numCount.put(num, numCount.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Count> pq = new PriorityQueue<>((a, b) -> b.count - a.count);
        numCount.forEach((num, count) -> pq.offer(new Count(num, count)));

        int[] answer = new int[k];
        for (int i = 0; i < k; ++i) {
            answer[i] = pq.remove().num;
        }
        return answer;
    }

    class Count {
        Count(int num, int count) {
            this.num = num;
            this.count = count;
        }

        int num;
        int count;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new LC347().topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2)));
        System.out.println(Arrays.toString(new LC347().topKFrequent(new int[]{1}, 1)));
    }
}
