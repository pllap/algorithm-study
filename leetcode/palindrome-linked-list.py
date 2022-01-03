from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        stack = []
        queue = []
        while head is not None:
            stack.append(head.val)
            queue.append(head.val)
            head = head.next
        return stack == queue[::-1]
