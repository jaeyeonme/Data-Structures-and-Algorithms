n = int(input())
arr = list(map(int, input().split()))
arr.insert(0, 0) # arr의 1번의 첫번째 숫자가 들어가 있다.
dy = [0] * (n + 1)
dy[1] = 1
res = 0 # 최대값
for i in range(2, n + 1):
    # 최대값 찾기
    max = 0
    for j in range(i - 1, 0, -1): # i-1: i바로 앞, 0: 1번까지, -1: 하나씩 작아진다.
        if arr[j] < arr[i] and dy[j] > max: # arr[i]: 내가 만들고자 하는 증가수열의 마지막 항
            max = dy[j]
    dy[i] = max + 1
    # 최대값
    if dy[i] > res:
        res = dy[i]

