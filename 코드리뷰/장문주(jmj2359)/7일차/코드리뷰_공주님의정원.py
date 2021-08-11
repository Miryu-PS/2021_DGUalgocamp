import sys
import heapq
l = []
l2 = []
n = int(sys.stdin.readline())
for i in range(n):
    smonth, sday, emonth, eday = map(int,sys.stdin.readline().rstrip().split())
    heapq.heappush(l,((smonth*100+sday),(emonth*100+eday)))

count = 1
start = 301
#첫번째 꽃 정하기
if len(l2)==0:
    if start>=l[0][0] and start<=l[0][1]:
        heapq.heappush(l2,l[0][1])
        heapq.heappop(l)
    else: count = 0

#start를 포함하면서 지는 기간이 가장 늦은 꽃 찾기
#start가 바뀔 때마다 +1
while True:
    if count == 0:
        break
    if l2[0] >= 1201:
        break
    if len(l)==0:
        count = 0
        break
    if start>=l[0][0] and l2[0]<=l[0][1]:
        heapq.heappop(l2)
        heapq.heappush(l2,l[0][1])
        heapq.heappop(l)
        # 이전 꽃이 지는 날짜를 start에 대입해 다음 꽃 찾기
    elif start < l[0][0] and l[0][0] <l2[0]:
        start = l2[0]
        count+=1
    elif start < l[0][0] and l[0][0] >= l2[0]:
        count = 0

print(count)
