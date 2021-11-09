num = []
for _ in range(7):
    num.append(int(input()))

num2 = []

sum = 0
for i in num:
    if i % 2 == 1:
        sum += i
        num2.append(i)

num2.sort()

if sum == 0:
    print(-1)
else:
    print(sum)
    print(num2[0])