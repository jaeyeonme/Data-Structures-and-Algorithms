N, L = map(int, input().split())
coord = [[False] * 1001] # 1000보다 작거나 같은 자연수
for i in map(int ,input().split()): # 1 2 100 101
    coord[i] = True # 구멍 난 부분만 True

ans = 0
x = 0
while x < 1001:
    if coord[x]: # 구멍을 만난다면
        ans += 1 # 테이프르 한 개 사용
        x += L # x좌표도 테이프 길이만큼 점프
    else:
        x += 1 # 구멍은 안만났으면 x를 늘려 줌

# 최종적으로 태이프를 몇개 사용했는지 출력
print(ans)