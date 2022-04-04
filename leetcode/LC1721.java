public class LC1721 {

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode swapNodes(ListNode head, int k) {

        // 0. preHead를 만든다
        ListNode preHead = new ListNode(0, head);
        // 1. 길이를 잰다
        int length = length(head);
        // 1-1. k를 왼쪽 노드를 잡게 만든다
        if (k > (length + 1) / 2) {
            k = length - k + 1;
        }
        // 2. 앞뒤로 이어야 하므로 앞 노드, 뒷 노드를 구한다
        ListNode preLeft = preLeft(preHead, k);
        ListNode preRight = preRight(preHead, k, length);
        ListNode left = preLeft.next;
        ListNode right = preRight.next;
        // 3. (앞노드.next == 뒷노드) 라면 스왑하고 끝
        if (left.next == right) {
            preLeft.next = right;
            left.next = right.next;
            right.next = left;
            return preHead.next;
        }
        // 4. 스왑하고 끝
        ListNode postRight = right.next;
        right.next = left.next;
        left.next = postRight;
        preLeft.next = right;
        preRight.next = left;
        return preHead.next;
    }

    int length(ListNode head) {
        int length = 0;
        while (head != null) {
            head = head.next;
            length++;
        }
        return length;
    }

    ListNode preLeft(ListNode preHead, int k) {
        for (int i = 1; i < k; ++i) {
            preHead = preHead.next;
        }
        return preHead;
    }

    ListNode preRight(ListNode preHead, int k, int length) {
        for (int i = 0; i < length - k; ++i) {
            preHead = preHead.next;
        }
        return preHead;
    }

    public static void main(String[] args) {
        ListNode head;

        head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        System.out.println(new LC1721().swapNodes(head, 2));

        head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6, new ListNode(7, new ListNode(8, new ListNode(9, new ListNode(10))))))))));
        System.out.println(new LC1721().swapNodes(head, 5));

        head = new ListNode(1, new ListNode(2));
        System.out.println(new LC1721().swapNodes(head, 2));
    }
}
