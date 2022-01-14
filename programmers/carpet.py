def solution(brown, yellow):
    from typing import List

    def divisors(num: int) -> List[int]:
        result = []
        for i in range(1, num + 1):
            if num % i == 0:
                result.append(i)
        return result

    from collections import deque
    lengths = deque(divisors(yellow))
    while len(lengths) > 1:
        width = lengths.pop() + 2
        height = lengths.popleft() + 2
        if width * height == brown + yellow:
            return [width, height]
    import math
    return [math.sqrt(brown + yellow), math.sqrt(brown + yellow)]


if __name__ == '__main__':
    print(solution(10, 2))
