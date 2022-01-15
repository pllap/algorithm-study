from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        n1 = 0
        n2 = 0
        digit = 0
        while l1 is not None:
            n1 += l1.val * 10 ** digit
            l1 = l1.next
            digit += 1
        digit = 0
        while l2 is not None:
            n2 += l2.val * 10 ** digit
            l2 = l2.next
            digit += 1
        n = n1 + n2

        l = ListNode()
        l_next = l
        while True:
            l_next.val = n % 10
            n = n // 10
            if n:
                l_next.next = ListNode()
                l_next = l_next.next
            else:
                break
        return l


if __name__ == '__main__':
    L1 = ListNode(2, ListNode(4, ListNode(3)))
    L2 = ListNode(5, ListNode(6, ListNode(4)))
    Solution().addTwoNumbers(L1, L2)
