def DFS(L, s):
    global res
    # 조합을 구해주면 된다.
    if L == m:
        # 종착점
        sum = 0 # 도시의 피자 거리
        for j in range(len(hs)): # 0부터 집 개수 순회
            x1 = hs[j][0]
            y1 = hs[j][1]
            # 각 집의 피자 배달 거리
            dis = 2147000000
            for x in cb:
                x2 = pz[x][0]
                y2 = pz[x][1]
                dis = min(dis, abs(x1 - x2) + abs(y1 - y2))

            sum += dis
        if sum < res:
            res = sum

    else:
        for i in range(s, len(pz)):
            cb[L] = i
            DFS(L + 1, i + 1)

if __name__ == "__main__":
    n, m = map(int, input().split()) # n: 도시의 정보, m: 살아남은 피자집의 개수
    board = [list(map(int, input().split())) for _ in range(n)] # 도시의 지도정보
    hs = [] # 집의 좌표
    pz = [] # 피자집의 좌표
    cb = [0] * m # 조합의 경우 수
    res = 2147000000
    for i in range(n):
        for j in range(n):
            if board[i][j] == 1: # 집을 발견하면
                hs.append((i, j))
            elif board[i][j] == 2: # 피자집을 발견하면
                pz.append((i, j))
    DFS(0, 0)
    print(res)