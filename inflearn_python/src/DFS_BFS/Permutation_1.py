def DFS(L, s, sum):
    global cnt
    if L == k:
        if sum % m == 0:
            cnt += 1
    else:
        for i in range(s, n): # a라는 리스트에 0~n-1까지 있으므로, s, n
            DFS(L + 1, i + 1, sum + a[i])


if __name__ == "__main__":
    n, k = map(int, input().split())
    a = list(map(int, input().split())) # 전체의 자료
    m = int(input())
    cnt = 0
    DFS(0, 0, 0)
    print(cnt)