import sys
import heapq

n = int(sys.stdin.readline())
l = []
l2 = []
for i in range(n):
    size, day = map(int,sys.stdin.readline().rstrip().split())
    heapq.heappush(l,(day,size))

while True:
    if len(l)==0:
        break
    if l[0][0] > len(l2):
        heapq.heappush(l2,l[0][1])
        heapq.heappop(l)
    else:
        if l2[0] < l[0][1]:
            heapq.heappush(l2,l[0][1])
            heapq.heappop(l2)
            heapq.heappop(l)
print(sum(l2))
