# Python
from collections import deque

dq = deque()
dq.append(123)     # 뒤쪽으로 삽입
dq.appendleft(456) # 왼쪽으로 삽입
dq.appendleft(789)
print(dq)

print(dq.pop())     # 오른쪽(뒤쪽) 출력
print(dq.popleft()) # 왼쪽(앞쪽) 출력