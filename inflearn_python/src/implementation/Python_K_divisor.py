# Ex 6 3
N, K = map(int, input().split())
cnt = 0 # 개수
for i in range(1, N+1):
    if N % i == 0:
        cnt += 1
    if cnt == K:
        print(i)
        break # 찾았으므로 break

# Python for-else (약수 발견 못했을 때 -> 정상적으로 종료되었을 때)
else:
    print(-1)