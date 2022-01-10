from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # # 공간 절약
        # length = 0
        # tail = head
        # while tail is not None:
        #     tail = tail.next
        #     length += 1
        #
        # mid = length // 2
        # tail = head
        # for i in range(mid):
        #     tail = tail.next
        # return tail

        # 시간 절약
        nodes = []
        while head is not None:
            nodes.append(head)
            head = head.next
        # print([node.val for node in nodes])
        return nodes[len(nodes) // 2]


if __name__ == '__main__':
    sol = Solution()
    head = ListNode()
    head.val = 1
    head.next = ListNode()
    head.next.val = 2
    head.next.next = ListNode()
    head.next.next.val = 3
    head.next.next.next = ListNode()
    head.next.next.next.val = 4
    head.next.next.next.next = ListNode()
    head.next.next.next.next.val = 5
    print(sol.middleNode(head).val)
    head.next.next.next.next.next = ListNode()
    head.next.next.next.next.next.val = 6
    print(sol.middleNode(head).val)
