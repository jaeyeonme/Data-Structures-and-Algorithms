def DFS(L, sum):
    global res
    if L == n:
        if 0 < sum <= s: # 양수
            res.add(sum)
    else:
        # 세 갈래로 뻗는다.
        DFS(L + 1, sum + g[L]) # sum+g[L]: 추를 왼쪽에다가 넣는다.
        DFS(L + 1, sum - g[L]) # sum-g[L]: 추를 오른쪽에다가 넣는다.
        DFS(L + 1, sum) # 추를 가운데다가 넣는다.

if __name__ == "__main__":
    n = int(input())
    g = list(map(int, input().split())) # 각 추의 무게들
    s = sum(g) # 각 추들의 총합
    res = set() # set: 중복을 제거하면서 값을 추가, 측정될 수 있는 물의 무게
    DFS(0, 0)
    print(s - len(res))