def solution(number, k):
    len_number = len(number)
    cur_index = 0
    start_index = 0
    while True:
        # 끝까지 갔으면 맨 뒤에서 남은 k만큼 지우는 게 최대값
        if cur_index + 1 == len_number:
            return number[:-k]
        # 지금 숫자가 뒤 숫자보다 작으면 지운다
        if number[cur_index] < number[cur_index + 1]:
            number = number[:cur_index] + number[cur_index + 1:]
            k -= 1
            if k == 0:
                return number
            len_number -= 1
            cur_index = start_index - 1
        # 만약 9면 뒤로 옮긴다
        if number[cur_index] == '9':
            while number[cur_index] == '9':
                if cur_index + 1 == len_number:
                    return number[:-k]
                cur_index += 1
            start_index = cur_index = cur_index - 1
        cur_index += 1


if __name__ == '__main__':
    print(solution("1924", 2))  # 94
    print(solution("1231234", 3))  # 3234
    print(solution("4177252841", 4))  # 775841
    print(solution("87654321", 3))  # 87654
    print(solution("9991999199", 5))  # 99999
