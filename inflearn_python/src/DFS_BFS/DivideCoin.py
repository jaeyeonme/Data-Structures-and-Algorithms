def DFS(L):
    global res
    if L == n:
        cha = max(money) - min(money) # 최댓값 - 최솟값 차이
        if cha < res:
            # money에 있는 3개의 금액이 서로 달라야 한다.
            tmp = set()
            for x in money:
                tmp.add(x)
            if len(tmp) == 3:
                res = cha
    else:
        for i in range(3): # 0, 1, 2
            money[i] += coin[L] # L번쨰 있는 돈을 i번째 사람한테 준다.
            DFS(L + 1)
            # 뒤로 back 해준다.
            money[i] -= coin[L]

if __name__ == "__main__":
    n = int(input())
    coin = []
    money = [0] * 3 # 3명만 있으므로 각 사람의 금액
    res = -2147000000
    for _ in range(n):
        coin.append(int(input()))
    DFS(0)
    print(res)