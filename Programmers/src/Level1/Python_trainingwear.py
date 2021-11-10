def solution(n, lost, reverse):
    _reverse = [r for r in reverse if r not in lost]
    _lost = [l for l in lost if l not in reverse]
    for r in _reverse:
        f = r - 1
        b = r + 1
        if f in _lost:
            _lost.remove(f)
        elif b in _lost:
            _lost.remove(b)

    return n - len(_lost)