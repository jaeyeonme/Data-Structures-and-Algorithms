N = int(input())
start = 0
end = 1
answer = 0
sum_numbers = 1

while start < N // 2 + 1:
    if sum_numbers < N:
        end += 1
        sum_numbers += end
    elif sum_numbers == N:
        answer += 1
        end += 1
        sum_numbers -= start
        sum_numbers += end
        start += 1
    else:
        sum_numbers -= start
        start += 1

print(answer + 1)