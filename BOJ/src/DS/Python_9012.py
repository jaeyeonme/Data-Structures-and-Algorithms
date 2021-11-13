for _ in range(int(input())):
    stack = [] # 스택 생성
    isVPS = True
    for ch in input(): # 한 글자씩 살펴봄
        if ch == '(':
            stack.append(ch)
        else:
            # 닫는괄호
            if stack: # 스택이 비어있는지 검사
                stack.pop()
            else:
                isVPS = False
                break

    if stack: # stack이 비어있지 않다면
        isVPS = False

print('YES' if isVPS else 'NO')
