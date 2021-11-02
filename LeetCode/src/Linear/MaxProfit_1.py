from typing import List


def maxProfit(self, prices: List[int]) -> int:
    max_price = 0

    for i in enumerate(prices):
        for j in range(i, len(prices)):
            max_price = max(prices[j] - prices, max_price)

    return max_price