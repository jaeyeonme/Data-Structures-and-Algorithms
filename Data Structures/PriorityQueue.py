# PriorityQueue
from queue import PriorityQueue

pq = PriorityQueue()
pq.put(6)
pq.put(10)
pq.put(-5)
pq.put(0)
pq.put(8)

while not pq.empty():
    print(pq.get()) # pop