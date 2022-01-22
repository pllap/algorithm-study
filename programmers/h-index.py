def solution(citations):
    n = len(citations)
    # 정렬 먼저 한다
    citations.sort()

    # h를 배열의 최대값으로 잡아 두고 쭉 내려간다
    h_max = citations[-1]
    while h_max > 0:
        # 인용 수가 현재 h보다 많은 논문을 카운트한다
        count = 0
        for i in range(n - 1, -1, -1):
            if citations[i] >= h_max:
                count += 1
            else:
                break
        # 카운트한 개수가 현재 h 이상이면 현재 h를 리턴
        if count >= h_max:
            break
        else:
            h_max -= 1

    return h_max


if __name__ == '__main__':
    print(solution([3, 0, 6, 1, 5]))
