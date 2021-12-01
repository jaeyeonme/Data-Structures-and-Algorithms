def DFS(L, sum): # (T, P를 접근하는 접근하는 index 이면서 날짜)
    global res
    if L == n + 1:
        # 하나의 일정이 완성
        if sum > res:
            res = sum
    else:
        if L + T[L] <= n + 1: # L:현재 지점 T[L]: 앞으로 상담할 날짜
            DFS(L + T[L], sum + P[L])
        # 상담을 하지 않을 경우
        DFS(L + 1, sum)


if __name__ == "__main__":
    n = int(input()) # 날자
    T = list() # 걸리는 시간(날짜)
    P = list() # 얻을 수 있는 금액
    for i in range(n):
        a, b = map(int, input().split())
        T.append(a)
        P.append(b)
    res = -2147000000
    T.insert(0, 0)
    P.insert(0, 0)
    DFS(1, 0) # (날짜, 얻을 수 있는 수익의 총합)
    print(res)