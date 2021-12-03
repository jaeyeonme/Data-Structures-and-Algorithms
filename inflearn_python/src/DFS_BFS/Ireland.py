from collections import deque

dx = [-1, -1, 0, 1, 1, 1, 0, -1]
dy = [0, 1, 1, 1, 0, -1, -1, -1]
n = int(input()) # 격자의 크기
board = [list(map(int, input().split())) for _ in range(n)] # 지도정보
cnt = 0
Q = deque()
for i in range(n):
    for j in range(n):
        if board[i][j] == 1: # 섬의 한 부분이 발견
            board[i][j] = 0
            Q.append((i, j))
            while Q:
                tmp = Q.popleft()
                for k in range(8):
                    x = tmp[0] + dx[k]
                    y = tmp[1] + dy[k]
                    # 경계선을 벗어나면 안된다.
                    if 0 <= x < n and 0 <= y < n and board[x][y] == 1:
                        board[x][y] = 0
                        Q.append((x, y))

            cnt += 1 # 섬의 개수
print(cnt)