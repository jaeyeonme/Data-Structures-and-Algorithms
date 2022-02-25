# 케이스 읽기
T = int(input()) # 테스트 케이스 개수
for t in range(T):
    n, s, e, k = map(int, input().split())
    a = list(map(int, input().split()))
    a = a[s-1:e] # 첫번쨰: s-1, e번째 까지
    # 오름차순 정렬
    a.sort()
    print("#%d %d" %(t, a[k-1]))