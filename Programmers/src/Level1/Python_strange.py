def solution(s):
    cnt = 1
    s = list(s) # 원소를 바꿀 수 있는 list로 변경
    for i, v in enumerate(s): # 인덱스와 값
        if v == ' ': # 단어 단위로 끊기 위해
            cnt = 1
            continue
        if cnt % 2 == 1:
            s[i] = v.upper() # 대문자로 변경
        else:
            s[i] = v.lower() # 소문자로 변경
        cnt += 1

    return ''.join(s) # 문자 리스트를 문자열로 변경