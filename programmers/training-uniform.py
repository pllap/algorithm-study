def solution(n, lost, reserve):
    # 반 전체가 수업을 들을 수 있다고 한다
    # 수업을 들을 수 없는 학생이 나오면 하나씩 뺀다
    answer = n

    # 각 학생이 가지고 있는 유니폼 수
    students = [1 for i in range(n)]
    for l in lost:
        students[l - 1] -= 1
    for r in reserve:
        students[r - 1] += 1

    for i in range(n):
        # 체육복이 없으면
        if students[i] == 0:
            # 앞 번호 친구한테 빌리거나
            if i - 1 >= 0 and students[i - 1] == 2:
                students[i] = students[i - 1] = 1
            # 뒷 번호 친구한테 빌린다
            elif i + 1 < n and students[i + 1] == 2:
                students[i] = students[i + 1] = 1
            # 앞 뒤 전부 여벌 체육복이 없으면 수업을 못 듣는다
            else:
                answer -= 1

    return answer


if __name__ == '__main__':
    N = 5
    LOST = [2, 4]
    RESERVE = [1, 3, 5]
    print(solution(N, LOST, RESERVE))
