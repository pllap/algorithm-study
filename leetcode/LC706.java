public class LC706 {

    static class MyHashMap {

        private final Bucket[] buckets;
        private final int capacity = 10000;

        public MyHashMap() {
            this.buckets = new Bucket[capacity];
        }

        public void put(int key, int value) {
            int hash = key % capacity;

            if (buckets[hash] == null) {
                buckets[hash] = new Bucket(key, value);
                return;
            }

            Bucket prev = find(buckets[hash], key);

            if (prev.next == null) {
                prev.next = new Bucket(key, value);
                return;
            }
            prev.next.value = value;
        }

        public int get(int key) {
            int hash = key % capacity;

            Bucket prev = find(buckets[hash], key);

            if (prev.next == null) {
                return -1;
            }
            return prev.next.value;
        }

        public void remove(int key) {
            int hash = key % capacity;

            if (buckets[hash] == null) {
                return;
            }
            if (buckets[hash].key == key) {
                buckets[hash] = buckets[hash].next;
            }

            Bucket prev = find(buckets[hash], key);

            if (prev.next == null) {
                return;
            }
            prev.next = prev.next.next;
        }

        private Bucket find(Bucket bucket, int key) {
            Bucket prev = new Bucket(-1, -1);
            prev.next = bucket;
            while (bucket != null) {
                if (bucket.key == key) {
                    break;
                }
                prev = bucket;
                bucket = bucket.next;
            }
            return prev;
        }

        static class Bucket {
            int key;
            int value;
            Bucket next;

            Bucket(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }
    }
}
