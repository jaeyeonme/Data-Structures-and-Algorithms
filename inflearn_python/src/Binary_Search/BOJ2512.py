# 입력
n = int(input())
requests = list((map(int, input().split())))
budget = int(input())

def calculate_needed_budget(upper_bound: int) -> int:
    # 상한액이 upper_bound 일 때 필요한 예산을 계산하는 함수입니다.
    needed_budget = 0
    for request in requests:
        needed_budget += min(request, upper_bound)
    return needed_budget

# 이분 탐색을 수행하는 메인 로직
low = 0
high = max(requests)
good_upper_bound = -1 # 찾고자 하는 적절한 상한액, 아직은 정해지지 않았으므로 -1로 초기화

while low <= high:
    mid = (low + high) // 2

    if calculate_needed_budget(mid) <= budget:
        good_upper_bound = mid
        low = mid + 1
    else:
        high = mid - 1

answer = -1
for request in requests:
    given = min(request, good_upper_bound) # 모든 Request 에 대해 계산
    answer = max(answer, given)
print(answer)