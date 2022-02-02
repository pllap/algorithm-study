# # brute force
# def solution(board):
#     answer = 0
#
#     row = len(board)
#     col = len(board[0])
#     for r in range(row):
#         for c in range(col):
#             if board[r][c] == 1:
#                 until = min(row - r, col - c)
#                 max_area = 1
#                 for u in range(1, until):
#                     contains_0 = False
#                     for i in range(u):
#                         if board[r + i][c + u] == 0 or board[r + u][c + i] == 0:
#                             contains_0 = True
#                             break
#                         if board[r + u][c + u] == 0:
#                             contains_0 = True
#                             break
#                     if contains_0:
#                         break
#                     else:
#                         max_area = (u + 1) * (u + 1)
#                 answer = max(answer, max_area)
#
#     return answer


# dp
def solution(board):
    num_rows = len(board)
    num_cols = len(board[0])
    contains_1 = False
    # 표에 1이 있는지 검사
    for r in range(num_rows):
        for c in range(num_cols):
            if board[r][c] == 1:
                contains_1 = True
                break
    # 1이 없으면 최대 넓이는 0
    if not contains_1:
        return 0
    
    # 탐색 진행
    max_area = 1
    for r in range(1, num_rows):
        for c in range(1, num_cols):
            if board[r][c] != 0:
                val = min(board[r - 1][c], board[r][c - 1], board[r - 1][c - 1])
                if val != 0:
                    board[r][c] = val + 1
                    max_area = max(max_area, board[r][c])
    return max_area ** 2


if __name__ == '__main__':
    BOARD = [[0, 1, 1, 1], [1, 1, 1, 1], [1, 1, 1, 1], [0, 0, 1, 0]]
    print(solution(BOARD))  # 9
    BOARD = [[0, 0, 1, 1], [1, 1, 1, 1]]
    print(solution(BOARD))  # 4
    BOARD = [[1, 1, 1, 1]]
    print(solution(BOARD))  # 1
