def DFS(k):
    if dy[k] > 0:
        return dy[k]
    if k == 1 or k == 2:
        return k
    else:
        dy[k] = DFS(k - 1) + DFS(k - 2)
        return dy[k]

if __name__ == "__main__":
    n = int(input())
    dy = [0] * (n * 1)
    print(DFS(n))