if __name__ == '__main__':
    N = int(input())
    A = input().split()
    for i in range(N):
        A[i] = int(A[i])
    M = int(input())
    X = input().split()
    for i in range(M):
        X[i] = int(X[i])

    # A를 정렬하고 이분 탐색한다
    A.sort()
    for x in X:
        left = 0
        right = N - 1
        mid = N // 2
        while left <= right:
            mid = (left + right) // 2
            if A[mid] > x:
                right = mid - 1
            elif A[mid] < x:
                left = mid + 1
            else:
                break
        if A[mid] == x:
            print(1)
        else:
            print(0)
