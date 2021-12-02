from collections import deque

dx = [-1, 0, 1, 0] # 12시 3시 6시 9시
dy = [0, 1, 0, -1]
n = int(input()) # 홀수인 숫자
a = [list(map(int, input().split())) for _ in range(n)]
ch = [[0] * n for _ in range(n)]
sum = 0
Q = deque()
ch[n // 2][n // 2] = 1 # 데크의 체크 (중앙 지점)
sum += a[n // 2][n // 2] # 그 값을 sum에 누적
Q.append((n // 2, n // 2))
L = 0 # 레벨=0
while True:
    if L == n // 2: # 레벨이 2가 되었을떄, n=5라면
        break
    size = len(Q) # 큐의 사이즈, 처음은 1이다.
    for i in range(size):
        # 한개가 나오면 꺼낸다.
        tmp = Q.popleft()
        for j in range(4): # 4바퀴 돌면서 (12, 3, 6, 9)
            x = tmp[0] + dx[j]
            y = tmp[1] + dy[j]
            if ch[x][y] == 0: # 탐색한 지점이 방문을 이미 했으면 안되므로 0으로 되있으면 누적
                sum += a[x][y]
                ch[x][y] = 1 # 방문했으므로 체크
                Q.append((x, y))

    L += 1 # 레벨 탐색을 끝냈으므로 1증가
print(sum)