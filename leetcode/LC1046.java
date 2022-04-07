import java.util.*;

public class LC1046 {

    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((x,y)->y-x);
        for (int stone : stones) {
            priorityQueue.add(stone);
        }

        int numStone = stones.length;
        while (numStone > 1) {
            int y = priorityQueue.remove();
            int x = priorityQueue.remove();
            numStone -= 2;

            if (x != y) {
                priorityQueue.add(y - x);
                ++numStone;
            }
        }

        return numStone == 0 ? 0 : priorityQueue.remove();
    }

    // 정렬로 푼 것
    public int lastStoneWeight1(int[] stoneArr) {
        List<Integer> stones = linkedList(stoneArr);
        stones.sort((a, b) -> b - a);

        int numStone = stoneArr.length;
        while (numStone > 2) {
            int y = stones.remove(0);
            int x = stones.remove(0);
            numStone -= 2;

            if (x != y) {
                add(stones, numStone++, y - x);
            }
        }

        if (numStone == 1) {
            return stones.get(0);
        }

        if (Objects.equals(stones.get(0), stones.get(1))) {
            return 0;
        }

        return stones.get(0) - stones.get(1);
    }

    /**
     * @param list where value is added
     * @param length of list
     * @param value added to list
     */
    void add(List<Integer> list, int length, int value) {
        int index = 0;
        while (index < length && list.get(index) > value) {
            ++index;
        }
        list.add(index, value);
    }

    List<Integer> linkedList(int[] arr) {
        List<Integer> list = new LinkedList<>();
        for (int num : arr) list.add(num);
        return list;
    }

    public static void main(String[] args) {
        System.out.println(new LC1046().lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1}));
        System.out.println(new LC1046().lastStoneWeight(new int[]{1}));
    }
}
