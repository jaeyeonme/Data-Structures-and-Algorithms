dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]

def DFS(x, y):
    global cnt
    if x == ex and y == ey: # 도착지점
        cnt += 1 # 카운트
    else:
        for k in range(4):
            xx = x + dx[k]
            yy = y + dy[k]
            if 0 <= xx < n and 0 <= yy < n and ch[xx][yy] == 0 and board[xx][yy] > board[x][y]:
                ch[xx][yy] = 1
                DFS(xx, yy)
                ch[xx][yy] = 0

if __name__ == "__main__":
    n = int(input())
    board = [[0] * n for _ in range(n)]
    ch = [[0] * n for _ in range(n)] # 체크 리스트
    max = -2147000000 # 최대값
    min = 2147000000 # 최소값
    for i in range(n):
        tmp = list(map(int, input().split())) # 격자의 한 줄
        for j in range(n):
            if tmp[j] < min: # 최소값 발견
                min = tmp[j]
                sx = i # 행
                sy = j # 열
            if tmp[j] > max: # 최대값 발견
                max = tmp[j]
                ex = i # 도착지점 행
                ey = j # 도착지점 열
            board[i][j] = tmp[j]
    ch[sx][sy] = 1 # 첫 출발지점 체크
    cnt = 0 # 카운트
    DFS(sx, sy)
    print(cnt)
