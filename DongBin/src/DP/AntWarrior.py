# 정수 N을 입력 받기
n = int(input())
# 모든 식량 정보 입력 받기
array = map(int(input().split()))

# 앞서 계산된 결과를 저장하기 위한 DP 테이블 초기화
d = [0] * 100 # 식량 창고 개수가 100개 이하임을 고려

# 다이나믹 프로그래밍으로 구현 (보텀업)
d[0] = array[0]
d[1] = max(d[0], array[1])
for i in range(2, n):
    d[i] = max(d[i - 1], d[i - 2] + array[i])

# 계산된 결과 출력
print(d[n - 1])