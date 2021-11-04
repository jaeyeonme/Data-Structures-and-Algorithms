def binary_search(array, target, start, end):
    # 탐색할 데이터가 없는 경우
    if start > end:
        return None
    mid = (start + end) // 2
    # target을 찾은 경우, 중간점 인덱스 변환
    if array[mid] == target:
        return mid
    # 중간점의 값보다 target이 작은 경우: end를 mid-1로 변경(왼쪽 확인)
    elif array[mid] > target:
        return binary_search(array, target, start, mid - 1)
    # 중간점의 값보다 target이 큰 경우: start를 mid+1로 변경(오른쪽 확인)
    else:
        return binary_search(array, target, mid + 1, end)

# n(원소의 개수), target(찾고자 하는 값) 입력받기
n, target = list(map(int, input().split()))
# 전체 원소 입력받기
array = list(map(int, input().split()))

# 이진 탐색 수를 결과 출력
result = binary_search(array, target, 0, n - 1)
if result == None:
    print("원소가 존재하지 않습니다.")
else:
    print(result + 1) # 인덱스 갑에 1을 더함