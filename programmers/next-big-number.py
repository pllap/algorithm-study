def solution(n):
    count_n = count(n)
    next = n + 1
    while count(next) != count_n:
        next += 1
    return next


# n의 2진수의 1의 개수를 세는 함수
def count(n):
    c = 0
    while n > 0:
        if n % 2 == 1:
            c += 1
        n = n // 2
    return c
