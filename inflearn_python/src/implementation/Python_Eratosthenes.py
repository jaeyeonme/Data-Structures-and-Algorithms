N = int(input())
ch = [0] * (N + 1) # 체크배열 생성
cnt = 0 # 카운팅

for i in range(2, N + 1): # 2부터 N까지 순회
    # 소수인지 아닌지 확인
    # 체크가 안되었으면 카운팅
    if ch[i] == 0:
        cnt += 1
        for j in range(i, N + 1, i): # i부터 시작해서 i씩 증가하면서 i의 배수 증가
            ch[j] = 1 # 1로 체크

print(cnt)