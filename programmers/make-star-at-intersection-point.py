def solution(lines):
    # 라인들의 교점을 찾아서 교점들을 모아놓는 배열에 저장한다
    intersection_points = []
    len_lines = len(lines)
    for i in range(len_lines - 1):
        for j in range(i + 1, len_lines):
            a, b, e, c, d, f = *lines[i], *lines[j]
            if a * d - b * c != 0:
                x: float = (b * f - e * d) / (a * d - b * c)
                y: float = (e * c - a * f) / (a * d - b * c)
                if x.is_integer() and y.is_integer():
                    intersection_points.append([int(x), int(y)])

    # 위 배열에서 x,y 각각 최대, 최소값을 구해놓는다
    num_points = len(intersection_points)
    x_min = x_max = intersection_points[0][0]
    y_min = y_max = intersection_points[0][1]
    for i in range(1, num_points):
        x_min = min(x_min, intersection_points[i][0])
        x_max = max(x_max, intersection_points[i][0])
        y_min = min(y_min, intersection_points[i][1])
        y_max = max(y_max, intersection_points[i][1])

    # 모든 점에 x,y 최소값을 뺀다 (0부터 시작하게 만들기)
    for i in range(num_points):
        intersection_points[i][0] = intersection_points[i][0] - x_min
        intersection_points[i][1] = intersection_points[i][1] - y_min
    x_max -= x_min
    y_max -= y_min

    # .으로 이루어진 문자열 배열을 만든다
    answer = [''.join(['.' for i in range(x_max + 1)]) for j in range(y_max + 1)]

    # 배열에서 x,y 좌표를 꺼내 각 좌표에 표시한다
    for i in range(num_points):
        point = intersection_points.pop()
        x: int = point[0]
        y: int = y_max - point[1]
        answer[y] = answer[y][:x] + '*' + answer[y][x + 1:]

    return answer


if __name__ == '__main__':
    print(solution([[2, -1, 4], [-2, -1, 4], [0, -1, 1], [5, -8, -12], [5, 8, 12]]))
    print(solution([[0, 1, -1], [1, 0, -1], [1, 0, 1]]))
    print(solution([[1, -1, 0], [2, -1, 0]]))
    print(solution([[1, -1, 0], [2, -1, 0], [4, -1, 0]]))
    print(solution([[1, 0, 0], [0, 1, 1], [0, 1, 0], [0, 1, -1]]))
    print(solution([[1, 0, 1], [1, 0, 0], [1, 0, -1], [0, 1, 1], [0, 1, 0], [0, 1, -1]]))
