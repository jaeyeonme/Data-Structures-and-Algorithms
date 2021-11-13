from collections import deque

N = int(input())
dq = deque(range(1, N + 1))

# 카드가 1장 남을때까지 반복
while len(dq) > 1:
    dq.popleft()            # 가장 앞에 있는 값을 버림
    dq.append(dq.popleft()) # 뺀 값을 append로 넣어줌
    print(dq)