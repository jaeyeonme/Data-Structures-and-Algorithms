def DFS(x, y):
    ch[x][y] = 1 # 방문했다고 체크
    if x == 0: # 종착지점
        print(y) # 열번호
    else:
        # 왼쪽
        if y - 1 >= 0 and board[x][y - 1] == 1 and ch[x][y - 1] == 0:
            DFS(x, y - 1)
        # 오른쪽
        elif y + 1 < 10 and board[x][y + 1] == 1 and ch[x][y + 1] == 0:
            DFS(x, y + 1)
        # 위쪽
        else:
            DFS(x - 1, y)

if __name__ == "__main__":
    board = [list(map(int, input().split())) for _ in range(10)] # 사다리 정보 10 * 10
    ch = [[0] * 10 for _ in range(10)] # 체크배열
    for y in range(10): # y: 열번호
        if board[9][y] == 2: # 2를 발견하면
            DFS(9, y) # 호출