n, m = map(int, input().split())
l = []
min = []

for _ in range(n):
    l.append(input())

for a in range(n - 7):
    for i in range(n - 7):
        idx1 = 0
        idx2 = 0
        for b in range(a, a + 8):
            for j in range(i, i + 8):
                if (j + b) % 2 == 0:
                    if l[b][j] != 'W': idx1 += 1
                    if l[b][j] != 'B': idx2 += 1
                else:
                    if l[b][j] != 'B': idx1 += 1
                    if l[b][j] != 'W': idx2 += 1
        min.append(idx1)
        min.append(idx2)

print(min(min))