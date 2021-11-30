import itertools as lt

n, f = map(int, input().split())
b = [1] * n
cnt = 0
for i in range(1, n):
    b[i] = b[i - 1] * (n - i) / i
a = list(range(1, n + 1))
for tmp in lt.permutations(a):
    sum = 0
    for L, x in enumerate(tmp):
        sum += (x * b[L])
    if sum == f: # f=16
        for x in tmp:
            print(x, end=' ')
        # permutations를 break
        break