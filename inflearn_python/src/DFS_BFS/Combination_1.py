import itertools as lt

n, k = map(int, input().split())
a = list(map(int, input().split()))
m = int(input())
cnt = 0
for x in lt.combinations(a, k): # a라는 리스트에서 k개를 뽑는다.
    if sum(x) % m == 0: # 원소들의 합이 m의 배수이면
        cnt += 1
print(cnt)