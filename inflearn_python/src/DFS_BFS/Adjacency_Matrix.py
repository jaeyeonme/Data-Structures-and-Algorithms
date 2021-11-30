n, m = map(int, input().split())
g = [[0] * (n + 1) for _ in range(n + 1)]
for i in range(m):
    a, b, c = map(int, input().split()) # 한개의 간선정보 입력받음
    g[a][b] = c


for i in range(1, n + 1):
    for j in range(1, n + 1):
        print(g[i][j], end=' ')
    print()