def DFS(v):
    global cnt
    if v == n:
        cnt += 1
        for x in path:
            print(x, end=' ')
    else:
        for i in range(1, n + 1):
            if g[v][i] == 1 and ch[i] == 0: # g[v][i]==1: v노드에서 i번노드 갈 수 있는지, ch[i]==0: 방문을 안했어야 한다.
                ch[i] = 1
                path.append(i) # v -> i
                DFS(i)
                path.pop() # 경로에서 빼준다.
                ch[i] = 0


if __name__ == "__main__":
    n, m = map(int, input().split())
    g = [[0] * (n + 1) for _ in range(n + 1)]
    ch = [0] * (n + 1)
    for i in range(m):
        a, b = map(int, input().split())
        g[a][b] = 1
    cnt = 0
    path = []
    path.append(1)
    ch[1] = 1
    DFS(1)
    print(cnt)