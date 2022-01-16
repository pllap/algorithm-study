def solution(id_list, report, k):
    reported_map = {}
    mail_received_count = {}
    for _id in id_list:
        reported_map[_id] = []
        mail_received_count[_id] = 0

    for r in report:
        reporter, reported = r.split()
        if reporter not in reported_map[reported]:
            reported_map[reported].append(reporter)

    for reported, reporters in reported_map.items():
        if len(reporters) >= k:
            for reporter in reporters:
                mail_received_count[reporter] += 1

    return list(mail_received_count.values())


if __name__ == '__main__':
    ID_LIST = ["muzi", "frodo", "apeach", "neo"]
    REPORT = ["muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"]
    K = 2
    print(solution(ID_LIST, REPORT, K))
    ID_LIST = ["con", "ryan"]
    REPORT = ["ryan con", "ryan con", "ryan con", "ryan con"]
    K = 3
    print(solution(ID_LIST, REPORT, K))
