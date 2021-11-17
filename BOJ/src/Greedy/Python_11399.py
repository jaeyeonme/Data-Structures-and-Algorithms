def solution():
    answer = 0

    for i in range(N):
        for j in range(0, i + 1):
            answer += arr[j]

    return answer

N = int(input()) # 사람의 수
arr = list(map(int, input().split())) # 각 사람이 돈을 인출하는데 걸리는 시간
arr.sort() # 오름차순
print(solution())