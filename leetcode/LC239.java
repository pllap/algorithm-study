import java.util.Arrays;
import java.util.PriorityQueue;

public class LC239 {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int[] maximums = new int[nums.length + 1 - k];

        // 인덱스와 값을 같이 저장하는 최대 힙
        PriorityQueue<Element> priorityQueue = new PriorityQueue<>((a, b) -> b.value - a.value);

        // 첫 번째 구간의 원소들을 최대 힙에 넣는다
        for (int i = 0; i < k; ++i) {
            priorityQueue.add(new Element(i, nums[i]));
        }
        // 최대값을 저장한다
        maximums[0] = priorityQueue.peek().value;

        // 두 번째 구간부터는 구간을 움직여가며 진행하는데
        for (int i = 1; i < maximums.length; ++i) {
            // 구간을 벗어나는 최댓값은 최대 힙에서 없앤다 (최대 힙의 peek 값은 무조건 최댓값이므로)
            while (!priorityQueue.isEmpty() && priorityQueue.peek().index < i) {
                priorityQueue.remove();
            }
            priorityQueue.add(new Element(i + k - 1, nums[i + k - 1]));
            maximums[i] = priorityQueue.peek().value;
        }

        return maximums;
    }

    static class Element {

        public Element(int index, int value) {
            this.index = index;
            this.value = value;
        }

        int index;
        int value;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new LC239().maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3)));
        System.out.println(Arrays.toString(new LC239().maxSlidingWindow(new int[]{1}, 1)));
    }
}
