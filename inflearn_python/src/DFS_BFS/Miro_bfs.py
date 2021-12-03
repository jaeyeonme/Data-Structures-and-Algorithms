from collections import deque

dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]
board = [list(map(int, input().split())) for _ in range(7)]
dis = [[0] * 7 for _ in range(7)]
Q = deque()
Q.append((0, 0))
board[0][0] = 1 # 한번 방문한 곳은 벽으로 생성
while Q:
    tmp = Q.popleft() # 큐에서 좌표 하나 빠진다.
    for i in range(4):
        x = tmp[0] + dx[i]
        y = tmp[1] + dy[i]
        if 0 <= x <= 6 and 0 <= y <= 6 and board[x][y] == 0:
            board[x][y] = 1 # 체크를 해서 벽으로 만든다.
            dis[x][y] = dis[tmp[0]][tmp[1]] + 1
            Q.append((x, y))

if dis[6][6] == 0: # 초기값 그대로 0이면 벽에 가로 막혀서 도착점 못왔다.
    print(-1)
else:
    print(dis[6][6])