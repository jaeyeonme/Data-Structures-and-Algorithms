N = int(input()) # 사람 수
res = 0
for i in range(N):
    tmp = input().split() # 문자화된 숫자가 출력된다. ['3', '3', '6']
    tmp.sort() # 오름차순으로 정렬
    a, b, c = map(int, input().split()) # map에 정수화 시킨다.
    # 세게가 같은지 조건
    if a == b and b == c:
        money = 10000 + a * 1000
    # 두 개가 같은 경우
    elif a == b or a == c:
        money = 10000 + (a * 100)
    elif b == c:
        money = 1000 + (b * 100)
    # 규칙3.
    else:
        money = c * 100
    # 상금들 중에서 가장 큰 상금 찾기
    if money > res:
        res = money

print(res)