public class LC2 {
    public ListNode addTwoNumbers(ListNode node1, ListNode node2) {

        if (node1 == null) {
            return node2;
        }
        if (node2 == null) {
            return node1;
        }

        ListNode result = new ListNode(0, new ListNode(0));
        ListNode node = result;
        while (node1 != null && node2 != null) {
            int val = node1.val + node2.val;

            node.next = new ListNode(val % 10);
            node = node.next;

            node1 = node1.next;
            node2 = node2.next;

            if (node1 != null) {
                node1.val += val / 10;
            } else if (node2 != null) {
                node2.val += val / 10;
            } else if (val > 9) {
                node.next = new ListNode(1);
            }
        }

        if (node1 != null || node2 != null) {
            node.next = node1;
            if (node1 == null) {
                node.next = node2;
            }
            node = node.next;

            while (node != null) {
                if (node.val < 10) {
                    break;
                }
                node.val = node.val - 10;
                if (node.next != null) {
                    node.next.val += 1;
                } else {
                    node.next = new ListNode(1);
                    break;
                }
                node = node.next;
            }
        }

        return result.next;
    }

    public static void main(String[] args) {
        new LC2().addTwoNumbers(new ListNode(2, new ListNode(4, new ListNode(3))), new ListNode(5, new ListNode(6, new ListNode(4))));
        new LC2().addTwoNumbers(new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))))), new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))));
        new LC2().addTwoNumbers(new ListNode(9), new ListNode(1, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))))))));
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
