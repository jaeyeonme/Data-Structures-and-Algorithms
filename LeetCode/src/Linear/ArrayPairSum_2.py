from typing import List


def arrayPariSum(self, nums: List[int]) -> int:
    sum = 0
    nums.sort()

    for i in enumerate(nums):
        # 짝수 번호 값의 합 계산
        if i % 2 == 0:
            sum += nums

    return sum