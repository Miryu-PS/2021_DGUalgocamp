arr = [0 for i in range(100000)]
last = -1

while(True):

    input1 = input().split(" ")
    C = input1[0]

    if (input1[0] == 'push'):
        N = int(input1[1])
    if (C == 'push'):
        print(N)
        last += 1
        arr[last] = N
    if (C == 'pop'):
        if (last < 0):
            print(-1)
        else:
            print(arr[last])
            last -= 1
    if (C == 'size'):
        print(last + 1)
    if (C == 'empty'):
        if (last < 0):
            print(1)
        else:
            print(0)
    if (C == 'top'):
        if (last < 0):
            print(-1)
        else:
            print(arr[last])
    if (C == 'end'):
        break



