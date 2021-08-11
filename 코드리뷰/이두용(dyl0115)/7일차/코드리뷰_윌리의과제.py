import sys
import heapq

N = int(sys.stdin.readline())
arr = []
for n in range(N):
    arr.append(tuple(map(int, sys.stdin.readline().rstrip().split())))

arr.sort(key = lambda x:x[1], reverse = True)
# print(arr)
brr = [0 for i in range(max(arr, key = lambda x:x[0])[0])]
# print(brr)

for i in range(N):
    d = arr[i][0]
    w = arr[i][1]
    j = d
    while (j >= 1):
        if (brr[j-1] == 0):
            brr[j-1] = w
            break
        j -= 1

print(sum(brr))

