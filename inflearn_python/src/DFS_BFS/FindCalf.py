from collections import deque

MAX = 100000
ch = [0] * (MAX + 1)
dis = [0] * (MAX + 1)
n, m = map(int, input().split()) # n: 출발점, m: 도착점
ch[n] = 1
dis[n] = 0
dQ = deque()
dQ.append(n)
while dQ:
    now = dQ.popleft()
    if now == m: # 목표지점 발견하면
        break    # break
    for next in (now - 1, now + 1, now + 5):
        if 0 < next <= MAX: # 양수로만 가야 한다.
            # 방문한 것은 큐에 넣으면 안된다.
            if ch[next] == 0:
                dQ.append(next)
                ch[next] = 1 # 방문한 것은 체크
                dis[next] = dis[now + 1]

print(dis[m])
