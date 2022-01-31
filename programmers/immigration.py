def solution(n, times):
    times.sort()
    min_time = 0
    max_time = times[-1] * n
    while min_time <= max_time:
        expected_time = (min_time + max_time) // 2
        expected_n = sum(expected_time // time for time in times)
        if expected_n < n:
            min_time = expected_time + 1
        else:
            max_time = expected_time - 1
    return min_time


if __name__ == '__main__':
    print(solution(6, [7, 10]))
    print(solution(3, [3, 5]))
