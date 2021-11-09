# 대문자 알파벳으로 구성된 단어를 1개 입력합니다.
# 입력하는 단어는 최대 1000자 이하입니다.
case_word = input()

# 원래 단어를 저장할 변수를 선언합니다.
origin_word = ' '

# 카이사르 단어에서 한 글자씩 반복합니다.
for alphabet in case_word:
    # 현재 알파벳이 D에서 2까지인 경우
    if 68 <= ord(alphabet) <= 91:
        # 현재 알파벳보다 3개 이전의 알파벳으로 변환해서 원래 단어 변수에 넣어준다.
        origin_word += chr(ord(alphabet) - 3)
    # 현재 알파벳이 A, B, C인 경우
    else:
        # 각각 X, Y, Z로 바꿔서 원래 단어 변수에 넣어줍니다.
        origin_word += chr(ord(alphabet) + 26 - 3)

# 원래 단어를 출력
print(origin_word)