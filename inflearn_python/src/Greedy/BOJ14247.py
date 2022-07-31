import sys

# 입력
N = int(sys.stdin.readline())
H = list(map(int, sys.stdin.readline().split()))
A = list(map(int, sys.stdin.readline().split()))
I = list(range(N)) # [0, 1, 2 ,.... N-1]

# 정렬
# i를 정렬하는데, A[i]가 작은 순서로 정렬
# I=[0,1,2,3,4] -> I=[4,1,0,2,3]. A[4] < A[1] <= A[0] <= A..
I = sorted(I, key=lambda i: A[i])

ans = 0
for i in range(N):
    index = I[i]
    # H[4] + 0 * A[4]
    # H[1] + 1 * A[1]
    # H[0] + 2 * A[0]
    ans += H[index] + i * A[index]
print(ans)