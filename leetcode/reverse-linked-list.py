from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    # 스택을 사용한 풀이
    def reverseList1(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None:
            return None
        stack = []
        while head is not None:
            stack.append(head.val)
            head = head.next

        _reversed = ListNode()
        _head = _reversed
        while len(stack) > 0:
            _head.val = stack.pop()
            if len(stack) > 0:
                _head.next = ListNode()
                _head = _head.next
        return _reversed
    # 좀 더 빠른 풀이
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        cur = None
        while head is not None:
            # 현재 노드를 이전 노드로 옮긴다
            prev = cur
            # 현재 노드를 새로 만든다
            cur = ListNode(head.val)
            # 현재 노드를 이전 노드를 가리키게 한다
            cur.next = prev
            # head를 한 칸 옮긴다
            head = head.next
        return cur


if __name__ == '__main__':
    head = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5)))))
    result = Solution().reverseList(head)
    while result is not None:
        print(result.val)
        result = result.next
    print()
    head = None
    result = Solution().reverseList(head)
    while result is not None:
        print(result.val)
        result = result.next
    print()
