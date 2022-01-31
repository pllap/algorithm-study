import heapq


# def solution(jobs):
#     answer = 0
#
#     num_jobs = len(jobs)
#     job_min_heap = []
#     # 길이가 짧은 작업부터 처리한다
#     for job in jobs:
#         heapq.heappush(job_min_heap, (job[1], job[0]))
#
#     # 대기 시작 시간으로 정렬, 같으면 작업 길이 순으로 정렬
#     jobs.sort(key=lambda x: x[1])
#     jobs.sort(key=lambda x: x[0])
#     print(jobs)
#
#     time = 0
#     num_done = 0
#     while num_done < num_jobs:
#         current_job = jobs.pop(0)
#         time = max(time, current_job)
#         for job in jobs:
#             if time < job[0] < time + current_job[1]:
#                 heapq.heappush(job_min_heap)
#         time = time
#         while
#
#     while len(job_min_heap) > 0:
#         current_job = heapq.heappop(job_min_heap)
#         # 작업이 올 때까지 기다린다
#         time = max(time, current_job[1])
#         # 작업 시간을 더하고
#         time = time + current_job[0]
#         # 완료 시간 - 대기 시작 시간 = 총 대기 시간
#         answer = answer + time - current_job[1]
#     # 평균인데 소수점 밑은 버린다
#     answer = answer // num_jobs
#
#     return answer


import heapq


def solution(jobs):
    answer = 0

    num_jobs = len(jobs)
    # 도착 시점 순서대로 정렬한다.
    jobs.sort(key=lambda x: x[0])

    # 대기 큐
    start = jobs[0][0]
    idx = 0
    queue = []
    # 가장 먼저 들어오는 일들을 큐에 넣는다
    while idx < num_jobs:
        if jobs[idx][0] == start:
            heapq.heappush(queue, (jobs[idx][1], jobs[idx][0]))
        else:
            break
        idx += 1
    end = start
    num_done = 0
    while True:
        current_job = heapq.heappop(queue)
        # 완료 전에 도착하는 게 있으면 힙에 넣는다
        while idx < num_jobs:
            if jobs[idx][0] <= end + current_job[0]:
                heapq.heappush(queue, (jobs[idx][1], jobs[idx][0]))
            else:
                break
            idx += 1
        # 완료 처리한다
        answer += current_job[0] + end - current_job[1]
        end += current_job[0]
        num_done += 1
        if num_done == num_jobs:
            return answer // num_jobs
        # 힙이 비어 있으면 완료까지 도착한 게 없다는 의미이므로 떙긴다
        if len(queue) == 0:
            end = jobs[idx][0]
            heapq.heappush(queue, (jobs[idx][1], jobs[idx][0]))
            idx += 1


if __name__ == '__main__':
    JOBS = [[0, 3], [1, 9], [2, 6]]
    print(solution(JOBS))  # 9
    JOBS = [[0, 3], [4, 5]]
    print(solution(JOBS))  # 4
    JOBS = [[0, 9], [0, 4], [0, 5], [0, 7], [0, 3]]
    print(solution(JOBS))  # 13
    JOBS = [[0, 5], [1, 2], [5, 5]]
    print(solution(JOBS))  # 6
