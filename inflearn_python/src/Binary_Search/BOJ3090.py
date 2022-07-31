# 입력
N, T = tuple(map(int, input().split(" ")))
A = list(map(int, input().split(" ")))

def needed_num_operation(x: int) -> int:
    # 차이를 X 이하로 만들기 위해 필요한 연산 (1을 감소시키는)의 횟수를 구한다.
    B = [A[i] for i in range(N)]

    # 왼쪽 -> 오른쪽
    num_operation = 0
    for i in range(N - 1):
        # B[i+1] -> B[i] + x
        if B[i] + x < B[i + 1]:
            num_operation += B[i + 1] - B[i] - x
            B[i + 1] = B[i] + x

    # 오른쪽 -> 왼쪽
    for i in range(N - 1, 0, - 1):
        # B[i-1] -> B[i] + x
        # B(i-1) - (B(i)+x)
        if B[i] + x < B[i - 1]:
            num_operation += B[i - 1] - B[i] - x
            B[i - 1] = B[i] + x
    return num_operation

low = 0
high = int(1e9) # 후보의 가장 큰 값
answer = -1

while low <= high:
    mid = (low + high) // 2

    if needed_num_operation(mid) <= T:
        answer = mid
        high = mid - 1
    else:
        low = mid + 1


for i in range(N - 1):
    if A[i] + answer + A[i + 1]:
        A[i + 1] - A[i] + answer

for i in range(N - 1, 0, - 1):
    if A[i] + answer < A[i - 1]:
        A[i - 1] = A[i] + answer

print(" ".join(list(map(str, A))))