def solution(n, lost, reserve):
    _reserve = list(set(reserve) - set(lost)) # [r for r in reserve if r not in lost]
    _lost = list(set(lost) - set(reserve))    # [l for l in lost if l not in reserve]
    for r in _reserve:
        f = r - 1 # 도난당한 학생의 수
        b = r + 1 # 여벌의 체육복을 가져온 학생의 수
        if f in _lost:
            _lost.remove(f)
        elif b in _lost:
            _lost.remove(b)

    return n - len(_lost)