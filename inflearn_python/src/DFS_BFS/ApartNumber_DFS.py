dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]

def DFS(x, y):
    global cnt
    cnt += 1 # 집의 좌표가 넘어왔다.
    board[x][y] = 0 # 집이라는 좌표를 0이라고 한다.
    for i in range(4):
        xx = x + dx[i]
        yy = y + dy[i]
        # 경계선 밖으로 나가면 안된다.
        if 0 <= xx < n and 0 <= yy < n and board[xx][yy] == 1:
            DFS(xx, yy)

if __name__ == "__main__":
    n = int(input())
    board = [list(map(int, input())) for _ in range(n)]
    res = []
    for i in range(n):
        for j in range(n):
            if board[i][j] == 1: # 집을 발견하면
                cnt = 0 # 발견될 때 마다 0으로 초기화 후
                DFS(i, j) # DFS 호출
                res.append(cnt)

    print(len(res))
    res.sort()
    for x in res:
        print(x)
