import math


def solution(n):
    t = math.sqrt(n)
    return pow(t + 1, 2) if int(t) == t else -1