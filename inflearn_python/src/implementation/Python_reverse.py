def reverse(x):
    res = 0
    while x > 0:
        t = x % 10
        res = res * 10 + t
        x = x // 10
    return res

def isPrime(x):
    if x == 1:
        return False
    for i in range(2, x // 2 + 1): # 절반까지만 순회하면 된다.
        # x를 i로 나눠서 나머지가 0이면, i는 x의 약수
        if x % i == 0:
            return False
    # 정상적으로 종ㄹ됴ㅚ었다면
    else:
        return True

n = int(input())
a = list(map(int, input().split()))
for x in n:
    # x를 뒤집는다
    tmp = reverse(x)
    # 소수인지 확인
    if isPrime(tmp):
        print(tmp, end=' ')