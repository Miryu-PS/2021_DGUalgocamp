import sys
import heapq

N = int(sys.stdin.readline())
arr = []
h = []
s = 0
day = 0

for n in range(N):
    p, d = tuple(map(int, sys.stdin.readline().rstrip().split()))
    arr.append((d, p))
arr.sort(key = lambda x:x[0])

for i in range(N):

    if (len(h) < 0):
        heapq.heappush(h,(arr[i][1],arr[i][0]))
        day = arr[i][0]
    elif (day == arr[i][0] and arr[i][1] > h[0][0]):
        heapq.heappop(h)
        heapq.heappush(h,(arr[i][1],arr[i][0]))
    elif (day < arr[i][0]):
        heapq.heappush(h,(arr[i][1],arr[i][0]))
        day += 1

for i in h:
    s += i[0]

print(s)
