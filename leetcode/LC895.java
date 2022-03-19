import java.util.*;

public class LC895 {

    final private PriorityQueue<Element> heap; // 최대 힙
    final private Map<Integer, Integer> count; // 각 원소의 빈도수 저장
    private int index;

    public LC895() {
        // 빈도수가 많은 원소 기준
        // 빈도수가 같다면 top에 가까운 원소 기준
        heap = new PriorityQueue<>((a, b) -> {
            if (a.count == b.count)
                return a.index > b.index ? -1 : 1;
            if (a.count > b.count) {
                return -1;
            }
            return 1;
        });
        count = new HashMap<>();
        index = -1;
    }

    public void push(int val) {
        count.put(val, count.getOrDefault(val, 0) + 1);
        heap.add(new Element(val, count.get(val), index++));
    }

    public int pop() {
        Element popped = heap.poll();
        count.put(popped.val, popped.count - 1);
        return popped.val;
    }

    class Element {

        public Element(int val, int count, int index) {
            this.val = val;
            this.count = count;
            this.index = index;
        }

        int val;
        int count;
        int index;
    }

    public static void main(String[] args) {
        LC895 lc = new LC895();
        lc.push(5);
        lc.push(7);
        lc.push(5);
        lc.push(7);
        lc.push(4);
        lc.push(5);
        System.out.println(lc.pop());
        System.out.println(lc.pop());
        System.out.println(lc.pop());
        System.out.println(lc.pop());
    }
}
