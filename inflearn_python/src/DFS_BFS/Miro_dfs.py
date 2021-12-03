dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]
def DFS(x, y):
    global cnt
    if x == 6 and y == 6: # 도착지점에 오면
        cnt += 1 # 카운팅
    else:
        for i in range(4): # 4방향
            xx = x + dx[i]
            yy = y + dy[i]
            # 방향탐색
            if 0 <= x <= 6 and 0 <= y <= 6 and board[xx][yy] == 0:
                board[xx][yy] = 1
                DFS(xx, yy)
                board[xx][yy] = 0

if __name__ == "__main__":
    board = [list(map(int, input().split())) for _ in range(7)]
    cnt = 0
    board[0][0] = 1
    DFS(0, 0)
    print(cnt)