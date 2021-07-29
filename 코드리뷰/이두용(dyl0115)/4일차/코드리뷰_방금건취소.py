arr = [0 for i in range(100000)]
last = -1

K = int(input())
for k in range(K):
    N = int(input())
    if (N != 0):
        last += 1
        arr[last] = N
    else:
        arr[last] = 0
        last -= 1

print(sum(arr))
    
