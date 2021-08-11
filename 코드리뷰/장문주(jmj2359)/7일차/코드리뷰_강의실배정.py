import sys
import heapq
n = int(sys.stdin.readline())
l = []
l2 = []
for i in range(n):
    start, end = map(int,sys.stdin.readline().rstrip().split())
    heapq.heappush(l,(start,end))

while True:
    if len(l)==0:
        break
    if len(l2)==0:
        heapq.heappush(l2,l[0][1])        
    #강의 종료 시각 > 다음 강의 시작 시각
    elif l2[0] > l[0][0]:
        #강의실 개설
        heapq.heappush(l2,l[0][1])
    else:
        #가장 종료시각이 빠른 시각을 이어진 강의 종료시각으로 대체
        heapq.heappop(l2)
        heapq.heappush(l2,l[0][1])
    heapq.heappop(l)

print(len(l2))
