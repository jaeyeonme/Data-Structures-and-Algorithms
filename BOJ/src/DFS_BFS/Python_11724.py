# Backtracking
import sys

sys.setrecursionlimit(10 ** 6)
input = sys.stdin.readline() # 시간초과 날 경우 사요
N, M = map(int, input().split())
adj = [[0] * N for _ in range(N)] # 인접행렬을 만들어준다. (2차원 배열)
for _ in range(M): # M줄 만큼 간선이 들어온다.
    # a, b를 1씩 뺀 값이 들어간다. lambda x: x - 1
    a, b = map(lambda x: x - 1, map(int, input().split())) # 이것을 a, b에 넣어준다.
    adj[a][b] = adj[b][a] = 1 # 무방향 = 양방향


# 전역에 체크배열 생성
chk = [False] * N
ans = 0 # 연결요소 개수

def dfs(now): # DFS 구현
    for nxt in range(N):
        if adj[now][nxt] and not chk[nxt]: # now -> nxt 간선이 존재한다면 & 방문체크
            chk[nxt] = True # 체크
            dfs[nxt]

for i in range(N): # N만큼 루프
    if not chk[i]: # 체크 안된 것을 발견을 하면
        ans += 1 # 연결요소 개수 +
        chk[i] = True # 체크해 줌


print(ans)