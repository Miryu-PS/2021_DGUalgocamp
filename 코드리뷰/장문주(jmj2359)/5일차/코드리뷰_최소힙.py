import sys
import heapq
n = int(input())
heap = []
for i in range(n):
    s = int(sys.stdin.readline())
    if s != 0:
        heapq.heappush(heap,s)
    else:
        try:
            print(heapq.heappop(heap))
        except:
            print(0)
