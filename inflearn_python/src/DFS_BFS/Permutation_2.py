import itertools as it # itertools: 순열, 조합 자동으로 구해 줌

n, f = map(int, input().split())
b = [1] * n
cnt = 0
for i in range(1, n):
    b[i] = b[i - 1] * (n - i) / 2
a = list(range(1, n + 1))
for tmp in it.permutations(a, 3): # permutations(a, 3): 3개만 뽑아서 만들어라.
    print(tmp)
    cnt += 1
print(cnt)