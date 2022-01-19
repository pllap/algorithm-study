from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        if not list1 and not list2:
            return None
        result = ListNode()
        head = result
        while list1 is not None and list2 is not None:
            if list1.val < list2.val:
                head.val = list1.val
                list1 = list1.next
                head.next = ListNode()
                head = head.next
            else:
                head.val = list2.val
                list2 = list2.next
                head.next = ListNode()
                head = head.next

        if list1 is not None:
            head.val = list1.val
            head.next = list1.next
        elif list2 is not None:
            head.val = list2.val
            head.next = list2.next

        return result


if __name__ == '__main__':
    sol = Solution().mergeTwoLists(ListNode(1, ListNode(2, ListNode(4))), ListNode(1, ListNode(3, ListNode(4))))
    while sol is not None:
        print(sol.val)
        sol = sol.next
