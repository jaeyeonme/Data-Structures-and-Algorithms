# Python
from collections import deque

q = deque()
q.append(123)
q.append(456)
q.append(789)
print("size:", len(q))
while len(q) > 0:
    print(q.popleft())