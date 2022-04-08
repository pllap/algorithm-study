import java.util.PriorityQueue;

public class LC703 {

    public static void main(String[] args) {
        KthLargest kthLargest;
        kthLargest = new KthLargest(3, new int[]{4,5,8,2});
        System.out.println(kthLargest.add(3));
        System.out.println(kthLargest.add(5));
        System.out.println(kthLargest.add(10));
        System.out.println(kthLargest.add(9));
        System.out.println(kthLargest.add(4));

        kthLargest = new KthLargest(2, new int[]{0});
        System.out.println(kthLargest.add(-1));
        System.out.println(kthLargest.add(1));
        System.out.println(kthLargest.add(-2));
        System.out.println(kthLargest.add(-4));
        System.out.println(kthLargest.add(3));
    }

    static class KthLargest {

        int k;
        PriorityQueue<Integer> queue;

        public KthLargest(int k, int[] arr) {
            this.k = k;
            this.queue = new PriorityQueue<>(k);

            initializeQueue(arr);
        }

        void initializeQueue(int[] arr) {
            for (int i = 0; i < arr.length && i < k; ++i) {
                queue.offer(arr[i]);
            }
            for (int i = k; i < arr.length; ++i) {
                add(arr[i]);
            }
        }

        public int add(int val) {

            if (queue.size() < k) {
                queue.offer(val);
            } else if (val > queue.peek()) {
                queue.add(val);
                queue.poll();
            }

            return queue.peek();
        }
    }
}
