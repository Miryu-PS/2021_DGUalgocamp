arr = [0 for i in range(100000)]
last = -1
first = 0
N = int(input())
for n in range(N):
    # print(arr)
    input1 = input().split(" ")
    C = input1[0]

    if (input1[0] == 'push'):
        N = int(input1[1])
    if (C == 'push'):
        last += 1
        arr[last] = N
    if (C == 'pop'):
        if (last - first + 1 <= 0):
            print(-1)
        else:     
            print(arr[first])
            first += 1
    if (C == 'size'):
        print(last - first + 1)
    if (C == 'empty'):
        if (last - first + 1 <= 0):
            print(1)
        else:
            print(0)
    if (C == 'front'):
        if (last - first + 1 <= 0):
            print(-1)
        else:
            print(arr[first])
    if (C == 'back'):
        if (last - first + 1 <= 0):
            print(-1)
        else:
            print(arr[last])
    # print(arr)
    # print()
