from collections import deque

dx = [-1, 0, 1, 0]
dy = [0, 1, 0, - 1]
n, m = map(int, input().split()) # n: 열번호, m: 행번호
board = [list(map(int, input().split())) for _ in range(m)] # 한 줄을 읽어서 m만큼 돈다.
Q = deque()
dis = [[0] * n for _ in range(m)]
for i in range(m):
    for j in range(n):
        if board[i][j] == 1: # 익은 토마토이다.
            Q.append((i, j))

while Q:
    tmp = Q.popleft()
    # 4방향 탐색
    for i in range(4):
        xx = tmp[0] + dx[i]
        yy = tmp[1] + dy[i]
        # 경계선 밖으로 나가면 안된다.
        if 0 <= xx < m and 0 <= yy < n and board[xx][yy] == 0: # 안익은 토마토 이어야 한다.
            board[xx][yy] = 1 # 익은 토마토로 바꾼다.
            # 날짜 변경
            dis[xx][yy] = dis[tmp[0]][tmp[1]] + 1
            Q.append((xx, yy))

flag = 1
for i in range(m):
    for j in range(n):
        if board[i][j] == 0: # 안익은 토마토가 존재하면
            flag = 0

result = 0
if flag == 1:
    for i in range(m):
        for j in range(n):
            if dis[i][j] > result:
                result = dis[i][j]
    print(result)
else:
    print(-1)

