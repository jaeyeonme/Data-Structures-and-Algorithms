n = int(input())
dy = [0] * (n + 1) # 1차원 리스트. index 1부터 사용
dy[1] = 1
dy[2] = 2
for i in range(3, n + 1): # 3m부터 n까지
    dy[i] = dy[i - 1] + dy[i - 2]

print(dy[n])