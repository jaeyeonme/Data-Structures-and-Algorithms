import heapq as hq, sys

pq = []
input = sys.stdin.readline
for _ in range(int(input())):
    x = int(input())
    if x: # x != 0
        hq.heappush(pq, (abs(x), x)) # (절대값, 원본값)
    else: # x == 0
        # heap 비어있는지 검사
        hq.heappop(pq)[1] if pq else 0