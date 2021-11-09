import sys
input = sys.stdin.readline()

li = []

for _ in range(7):
    num = int(input())
    # 홀수면 리스트에 넣기
    if num % 2 != 0:
        li.append(num)

if li:
    print(sum(li))
    print(min(li))
else:
    print(-1)