N = int(input())
req = list(map(int, input().split()))
M = int(input())

lo = 0
hi = max(req)
mid = (lo + hi) // 2 # 절반
ans = 0

def is_possible(mid):
    # 상한선이 몇인지 각 지방마다 얼마를 줄지
    sum(min(r, mid) for r in req) <= M # 총합 <= M

while lo <= hi:
    if is_possible(mid):
        lo = mid + 1
        ans = mid
    else:
        hi = mid - 1 # 상한선이 낮은 쪽으로 세팅

    mid = (lo + hi) // 2 # lo, hi가 바뀌었기 때문에 mid도 갱신을 해준다.

print(ans)