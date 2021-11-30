def DFS(L, sum, time):
    global res
    if time > m: # 시간이 m보다 크면 가지치기
        return
    if L == n:
        if sum > res:
            res = sum
    else:
        # 뻗어나갈 떄
        DFS(L + 1, sum + pv[L], time + pt[L])
        DFS(L + 1, sum, time) # 문제를 안풀 수도 있으므로 지나간다.


if __name__ == "__main__":
    n, m = map(int, input().split())
    pv = list() # 문제점수
    pt = list() # 푸는데 걸린 시간
    for i in range(n):
        a, b = map(int, input().split())
        pv.append(a) # 점수 리스트
        pt.append(b) # 시간 리스트
    res = -2147000000 # 가장 작은 숫자로 초기화
    DFS(0, 0, 0) # (레벨, 총점, 시간)