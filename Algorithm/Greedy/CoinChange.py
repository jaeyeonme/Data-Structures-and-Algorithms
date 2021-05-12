# Coin Change Problem in Python

def coinChange(totalNumber, coins):
    N = totalNumber
    coins.sort()
    # 정렬을 한 후 목록의 마지막 색인을 찾아야 한다.
    # 동전의 길이에서 - 1을 뺴면 이것은 마지막 요소의 인덱스가 된다.
    index = len(coins) - 1
    while True:                       # O(N)
        coinValue = coins[index]
        if N >= coinValue:
            print(coinValue)          # O(1)
            N -= coinValue
        if N < coinValue:             # O(1)
            index -= 1

        if N == 0:
            break


coins = [1, 2, 3, 20, 50, 100]
coinChange(201, coins)


# Time Complexity : O(N)
# Space Complexity : O(1)
