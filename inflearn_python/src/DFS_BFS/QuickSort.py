# Python
def Qsort(lt, rt):
    if lt < rt:
        pos = lt
        pivot = arr[rt] # 그 영역의 가장 마지막 오른쪽
        for i in range(lt, rt):
            if arr[i] <= pivot:
                arr[i], pos = arr[pos], arr[i] # 파티션 작업
                pos += 1
        arr[rt], pos = arr[pos], arr[rt] # 파티션 작업
        Qsort(lt, pos - 1) # 왼쪽자식: lt, pos-1
        Qsort(pos + 1, rt) # 오른쪽자식: post+1, rt

if __name__== "__main__":
    arr = [45, 21, 23, 36, 15, 67, 11, 60, 20, 33]
    print("Before sort : ", end=' ')
    print(arr)
    Qsort(0, 9)
    print("After sort : ", end=' ')
    print(arr)