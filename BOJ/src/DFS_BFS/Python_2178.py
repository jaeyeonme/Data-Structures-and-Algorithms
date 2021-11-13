# BFS
from collections import deque

dy = [0, 1, 0, - 1]
dx = [1, 0, -1, 0]
N, M = map(int, input().split())
board = [input() for _ in range(N)] # 붙어서 입력받으므로 string

def is_valid_coord(y, x): # 벙뮈 체크
    return 0 <= y < N and 0 <= x < M

def bfs():
    chk = [[False] * M for _ in range(N)] # 체크배열 필요하므로 생성. 체크배열 없으면 4방향 다 갈 수 있으므로, 왔던 길 다시 반복 가능하다.
    chk[0][0] = True # 초기값은 체크
    dq = deque()
    dq.append((0, 0, 1)) # 0, 0 넣어준다. <-- 시작칸도 넣어준다. 1부터 시작
    while dq:
        y, x, d = dq.popleft()

        if y == N - 1 and x == M - 1: # 가장 우하단에 도달한 경우
            return d

        nd = d + 1
        for k in range(4):
            ny = y + dy[k]
            nx = x + dx[k]
            if is_valid_coord(ny, nx) and board[ny][nx] == '1' and not chk[ny][nx]: # 범위 체크 & 방문 체크
                chk[ny][nx] = True
                dq.append((ny, nx, nd))

print(bfs())