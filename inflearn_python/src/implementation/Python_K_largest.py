n, k = map(int, input().split())
a = list(map(int, input().split()))
res = set() # 중복저장X
for i in range(n):
    for j in range(i + 1, n):
        for m in range(j + 1, n):
            res.add(a[i] + a[j] + a[m])

# set 자료구조 sort 기능이 없다.
res = list(res)
res.sort(reverse=True)
print(res[k-1])