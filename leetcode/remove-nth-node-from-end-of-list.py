from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        nodes = []
        node = head
        while node is not None:
            nodes.append(node)
            node = node.next

        if len(nodes) == 1:
            return None

        if n == 1:
            nodes[-2].next = None
        elif n == len(nodes):
            return head.next
        else:
            nodes[-n - 1].next = nodes[-n + 1]
        return head


if __name__ == '__main__':
    sol = Solution()

    HEAD = ListNode()
    HEAD.val = 1
    HEAD.next = ListNode()
    HEAD.next.val = 2
    HEAD.next.next = ListNode()
    HEAD.next.next.val = 3
    HEAD.next.next.next = ListNode()
    HEAD.next.next.next.val = 4
    HEAD.next.next.next.next = ListNode()
    HEAD.next.next.next.next.val = 5

    print(sol.removeNthFromEnd(HEAD, 2).val)
