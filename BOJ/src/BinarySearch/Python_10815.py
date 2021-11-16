from bisect import bisect_left, bisect_right

N = int(input())
cards = sorted(list(map(int, input().split()))) # 이분탐색 정렬
M = int(input())
qry = list(map(int, input().split()))
ans = []
for q in qry:
    l = bisect_left(cards, q) # 탐색하려는 배열, 원하는 값
    r = bisect_right(cards, q)
    ans.append(1 if r - l else 0) # 0인지 아닌지 중요한 조건문에서는 부등호 생략 가능

print(' '.join(map(str, ans))) # join: 문자열 합쳐주는 함수, ans: 숫자 -> 문자열 변환