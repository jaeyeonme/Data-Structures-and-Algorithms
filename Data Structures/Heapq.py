# heapq
import heapq as hq

pq = [] # 순서는 알아서 push, pop 해준다. But, 0번째 index에서는 root node가 위치하게 된다.
hq.heappush(pq, 6)
hq.heappush(pq, 12)
hq.heappush(pq, 0)
hq.heappush(pq, -5)
hq.heappush(pq, 8)
print(pq)
while pq:
    print(pq[0])
    hq.heappop(pq)