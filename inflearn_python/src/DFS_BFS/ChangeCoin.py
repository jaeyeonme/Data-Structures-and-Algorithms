def DFS(L, sum):
    global cnt
    # 금액이 넘어가면 cut를 해줘야 한다.
    if sum > T:
        return
    if L == k:
        if sum == T:
            # 20원을 찾았다.
            cnt += 1
    else:
        for i in range(cn[L] + 1): # cn[L]: 동전의 개수
            DFS(L + 1, sum + (cv[L] * i)) # cv[L]: 동전의 금액

if __name__ == "__main__":
    T = int(input()) # 지폐 금액
    k = int(input()) # 동전의 가지수
    cv = list() # 동전의 금액
    cn = list() # 동전의 개수
    for i in range(k):
        a, b = map(int, input().split())
        cv.append(a)
        cn.append(b)
    cnt = 0
    DFS(0, 0)
    print(cnt)