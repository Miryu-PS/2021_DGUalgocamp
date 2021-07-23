"""
mode = i%3 이라면 (i+2)%3에서 i%3으로 우유를 옮기는 코드를 짜는 건 어땠을까 합니다.
from = (i+2)%3
to = i%3
totalmilk = arr[from][1] + arr[to][1]
arr[to][1] = min(totalmilk, arr[to][0]
arr[from][1] = totalmilk - arr[to][1]
과 같은 구현이 가능합니다.
"""
arr = [[0,0] for i in range(3)]

for i in range(3):
    input1 = input().split(" ")
    arr[i][0] = int(input1[0])
    arr[i][1] = int(input1[1])

for i in range(1,101):
    mode = i % 3
    if (mode == 1):
        total_milk = arr[0][1] + arr[1][1]
        if (total_milk > arr[1][0]):
            arr[0][1] = total_milk - arr[1][0]
            arr[1][1] = arr[1][0]
        else:
            arr[0][1] = 0
            arr[1][1] = total_milk

    if (mode == 2):
        total_milk = arr[1][1] + arr[2][1]
        if (total_milk > arr[2][0]):
            arr[1][1] = total_milk - arr[2][0]
            arr[2][1] = arr[2][0]
        else:
            arr[1][1] = 0
            arr[2][1] = total_milk

    if (mode == 0):
        total_milk = arr[2][1] + arr[0][1]
        if (total_milk > arr[0][0]):
            arr[2][1] = total_milk - arr[0][0]
            arr[0][1] = arr[0][0]
        else:
            arr[2][1] = 0
            arr[0][1] = total_milk

print(arr[0][1])
print(arr[1][1])
print(arr[2][1])
