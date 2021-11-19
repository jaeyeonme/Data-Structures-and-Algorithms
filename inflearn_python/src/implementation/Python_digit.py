# Python - 1
n = int(input())
a = list(map(int, input().split()))

def digit_sum(x):
    sum = 0
    # 각 자리수를 더해준다.
    while x > 0:
        sum += x % 10 # x를 10으로 나눈 나머지 누적
        x = x // 10   # x를 10으로 나눈 몫을 누적
    return sum

max = float('-inf') # 무한대를 의미 -> -2147000000. if total > max: 이 조건이 첫 번째는 무조건 참이 되게 하기 위해
                   # float('-inf'): 음의 무한대를 의미

for x in a:
    total = digit_sum(x)
    # 각 자리수 중에서 가장 큰 값
    if total > max:
        max = total
        res = x # total를 만든 숫자 x를 넣어준다.

print(res)
