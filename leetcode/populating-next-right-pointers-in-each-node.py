from collections import deque
from typing import Optional


class Node:
    def __init__(self, val: int = 0, left: 'Node' = None, right: 'Node' = None, next: 'Node' = None):
        self.val = val
        self.left = left
        self.right = right
        self.next = next


class Solution:
    def connect(self, root: 'Optional[Node]') -> 'Optional[Node]':
        queue = deque()
        bfs_queue = deque()

        if not root:
            return None

        # 트리를 큐로 옮긴다
        queue.append(root)
        bfs_queue.append(root)
        while len(bfs_queue) > 0:
            node: Node = bfs_queue.popleft()
            if node.left:
                queue.append(node.left)
                bfs_queue.append(node.left)
            if node.right:
                queue.append(node.right)
                bfs_queue.append(node.right)

        # 큐를 이용해 next를 처리한다
        len_queue = len(queue)
        # 다음 칸의 노드를 next에 담고
        for i in range(len_queue - 1):
            queue[i].next = queue[i + 1]
        # 각 레벨의 끝 노드에 대해서만 처리한다
        current = -1
        i = 0
        while current != len_queue - 1:
            before = current
            current = before + int(2 ** i)
            queue[current].next = None
            i += 1

        return root
