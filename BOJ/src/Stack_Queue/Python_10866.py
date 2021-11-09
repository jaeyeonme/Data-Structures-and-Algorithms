import sys
from collections import deque
input = sys.stdin.readline

N = int(input()) # 명령의 수

dq = deque()

for _ in range(N):
    Order = list(input().split())

    if Order[0] == "push_front":
        dq.appendleft(Order[1])

    elif Order[0] == "push_back":
        dq.append(Order[1])

    elif Order[0] == "pop_front":
        if len(dq) == 0 :
            print(-1)
        else:
            print(dq.popleft())

    elif Order[0] == "pop_back":
        if len(dq) == 0 :
            print(-1)

        else:
            print(dq.pop())

    elif Order[0] == "size":
        print(len(dq))

    elif Order[0] == "empty":
        if len(dq) == 0:
            print(1)
        else:
            print(0)

    elif Order[0] == "front":
        if len(dq) == 0:
            print(-1)
        else:
            print(dq[0])

    elif Order[0] == "back":
        if len(dq) == 0:
            print(-1)
        else:
            print(dq[-1])