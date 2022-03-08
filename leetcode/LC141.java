import java.util.HashSet;
import java.util.Set;

public class LC141 {

    public boolean hasCycle(ListNode head) {

        Set<ListNode> nodes = new HashSet<>();

        while (head != null) {
            if (nodes.contains(head)) {
                return true;
            }
            nodes.add(head);
            head = head.next;
        }

        return false;
    }
}
