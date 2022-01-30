import copy


def solution(tickets):
    # DFS로 진행
    # dict에 도착 가능한 도시들을 적는다
    # 반복:
    #   현재 도시에서 갈 수 있는 도시들을 쭉 적는다
    #   path를 적으면서 그 도시들로 이동한다
    #   갈 수 있는 도시가 없으면 그대로 리턴
    #   스텝 수 == num_tickets이면 성공이므로 path 리턴

    num_tickets = len(tickets)
    can_go = {}
    for ticket in tickets:
        if ticket[0] not in can_go:
            can_go[ticket[0]] = []
        can_go[ticket[0]].append(ticket[1])
    for key in can_go:
        can_go[key].sort()

    def dfs(city, path, can_go):
        # dfs 종료 조건
        # 현재 도시에서 더이상 갈 수 있는 도시가 없을 때
        if city not in can_go or len(can_go[city]) == 0:
            # 제대로 된 경로면 path 리턴
            if len(path) - 1 == num_tickets:
                return path
            # 제대로 되지 않은 경로면 None 리턴
            else:
                return

        # 갈 수 있는 도시들을 쭉 적는다
        cities = can_go[city]
        for next_city in cities:
            next_path = path[::]
            next_path.append(next_city)
            next_can_go = copy.deepcopy(can_go)
            next_can_go[city].remove(next_city)
            # 다음 도시에 대해 dfs를 진행한다
            result = dfs(next_city, next_path, next_can_go)
            # dfs가 제대로 되었으면 path를 리턴하며 콜스택을 빠져나간다
            if result:
                return result

    return dfs('ICN', ['ICN'], can_go)


if __name__ == '__main__':
    TICKETS = [["ICN", "JFK"], ["HND", "IAD"], ["JFK", "HND"]]
    print(solution(TICKETS))  # ['ICN', 'JFK', 'HND', 'IAD']
    TICKETS = [["ICN", "SFO"], ["ICN", "ATL"], ["SFO", "ATL"], ["ATL", "ICN"], ["ATL", "SFO"]]
    print(solution(TICKETS))  # ['ICN', 'ATL', 'ICN', 'SFO', 'ATL', 'SFO']
    TICKETS = [["ICN", "A"], ["ICN", "B"], ["B", "ICN"]]
    print(solution(TICKETS))  # ["ICN", "B", "ICN", "A"]
    TICKETS = [["ICN", "A"], ["A", "C"], ["A", "D"], ["D", "B"], ["B", "A"]]
    print(solution(TICKETS))  # ["ICN", "A", "D", "B", "A", "C"]
    TICKETS = [['ICN', 'B'], ['B', 'ICN'], ['ICN', 'A'], ['A', 'D'], ['D', 'A']]
    print(solution(TICKETS))  # ['ICN', 'B', 'ICN', 'A', 'D', 'A']
    TICKETS = [["ICN", "A"], ["ICN", "A"], ["A", "ICN"]]
    print(solution(TICKETS))
    TICKETS = [['ICN', 'A'], ['A', 'ICN'], ['ICN', 'A'], ['A', 'ICN'], ['ICN', 'A']]
    print(solution(TICKETS))  # ['ICN', 'A', 'ICN', 'A', 'ICN', 'A']
    TICKETS = [["ICN", "BBB"], ["ICN", "CCC"], ["BBB", "CCC"], ["CCC", "BBB"], ["CCC", "ICN"]]
    print(solution(TICKETS))  # ["ICN", "BBB", "CCC", "ICN", "CCC", "BBB"]
    TICKETS = [["ICN", "C"], ["ICN", "B"], ["C", "ICN"], ["B", "D"]]
    print(solution(TICKETS))  # ["ICN", "C", "ICN", "B", "D"]
