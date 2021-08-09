import heapq
h = []

N = int(input())
for n in range(N):
    x = int(input())
    
    if (x > 0):
        heapq.heappush(h, x)
    else:
        try:
            min = heapq.heappop(h)
            print(min)
        except:
            print(0)
