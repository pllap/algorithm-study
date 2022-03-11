public class LC61 {

    public ListNode rotateRight(ListNode head, int k) {
        int length = 0;
        ListNode node = head;
        ListNode tail = node;
        while (node != null) {
            if (node.next == null) {
                tail = node;
            }
            node = node.next;
            ++length;
        }

        if (length < 2) {
            return head;
        }

        k = k % length;
        if (k == 0) {
            return head;
        }

        node = head;
        ListNode pre = node;
        for (int i = 0; i < length - k; ++i) {
            node = node.next;
            while (pre.next != node) {
                pre = pre.next;
            }
        }

        tail.next = head;
        pre.next = null;

        return node;
    }

    public static void main(String[] args) {
        new LC61().rotateRight(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))), 2);
        new LC61().rotateRight(new ListNode(0), 2);
        new LC61().rotateRight(null, 2);
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
