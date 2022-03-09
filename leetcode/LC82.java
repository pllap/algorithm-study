public class LC82 {
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode result = new ListNode(0, head);
        ListNode before = result;
        head = result;
        while (head.next != null) {
            head = head.next;
            if (head.next == null) {
                break;
            }
            if (head.val != head.next.val) {
                before = head;
                continue;
            }

            while (head.next != null && head.val == head.next.val) {
                head = head.next;
            }
            before.next = head.next;
        }

        return result.next;
    }

    public static void main(String[] args) {
        ListNode head, result;

        head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3, new ListNode(4, new ListNode(4, new ListNode(5)))))));
        result = new LC82().deleteDuplicates(head);

        head = new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3)))));
        result = new LC82().deleteDuplicates(head);

        head = new ListNode(1, new ListNode(1));
        result = new LC82().deleteDuplicates(head);
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
