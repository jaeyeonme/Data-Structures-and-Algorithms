# N, M, k를 공백으로 구분하여 입력받기
n, m, k = map(int, input().split())

# N개의 수를 공백으로 구분하여 입력받기
data = list(map(int, input().split()))


# 입력받은 수들 정렬하기
data.sort()
# 가장 큰 수
first = data[n - 1]
# 두 번째로 큰 수
second = data[n - 2]


# 가장 큰 수가 더해지는 횟수 계산
count = int(m / (k + 1)) * k
count += m % (k + 1)

result = 0
# 가장 큰 수 더하기
result += count * first
# 두 번째로 큰 수 더하기
result += (m - count) * second

# 최종 답안 출력
print(result)
