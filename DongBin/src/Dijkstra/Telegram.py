import heapq

n, m, c = map(int, input().split())
INF = 1001
distance = [INF] * (n + 1)
graph = [[] for _ in range(n + 1)]
for _ in range(m):
    x, y, z = map(int, input().split())
    graph[x].append((y, z))

# 시작 노드(c) 처리
q = []
distance[c] = 0
heapq.heappush(q, (0, c))
while q:
    dist, node = heapq.heappop(q)
    if dist > distance[node]:
        continue
    for next in graph[node]:
        cost = distance[node] + next[1]
        if cost < distance[next[0]]:
            distance[next[0]] = cost
            heapq.heappush(q, (cost, next[0]))

count = 0
max_dist = 0
for d in distance:
    if d != INF:
        count += 1
        max_dist = max(max_dist, d)

print(count - 1, max_dist)
