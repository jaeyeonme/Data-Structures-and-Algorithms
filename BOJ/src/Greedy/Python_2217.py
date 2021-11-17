N = int(input())
rope = []
value = []
for i in range(N):
    rope.append(int(input()))
rope.sort(reverse=True) # #1. 내림차순
for num in range(N):
    value.append(rope[num] * (num + 1)) # #2

print(max(value))
