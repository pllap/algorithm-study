public class LC705 {

    private final Node[] bucket;

    public LC705() {
        this.bucket = new Node[10];
    }

    public void add(int key) {
        int hash = key % 10;

        if (bucket[hash] == null) {
            bucket[hash] = new Node(key);
            return;
        }

        if (this.contains(key)) {
            return;
        }

        Node node = bucket[hash];
        while (node.next != null) {
            node = node.next;
        }
        node.next = new Node(key);
    }

    public void remove(int key) {
        if (!this.contains(key)) {
            return;
        }

        int hash = key % 10;
        Node node = bucket[hash];

        if (bucket[hash].val == key) {
            bucket[hash] = bucket[hash].next;
            return;
        }

        while (node.next != null) {
            if (node.next.val == key) {
                break;
            }
            node = node.next;
        }
        if (node.next.next == null) {
            node.next = null;
        } else {
            node.next = node.next.next;
        }
    }

    public boolean contains(int key) {
        int hash = key % 10;

        Node node = bucket[hash];
        while (node != null) {
            if (node.val == key) {
                return true;
            }
            node = node.next;
        }
        return false;
    }

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }
}
