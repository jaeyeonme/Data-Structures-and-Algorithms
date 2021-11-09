N = int(input())

for i in range(1, N + 1):
    answer = ' ' * (N - i) + '*' * ((2 * i) - 1)
    print(answer)