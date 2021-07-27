#i점 건너뛸때, 건너뛰지 않을 때 거리 차이
def dist(d,i):
    d1 = abs(d[i][0]-d[i-1][0])+abs(d[i][1]-d[i-1][1])+abs(d[i+1][0]-d[i][0])+abs(d[i+1][1]-d[i][1])
    d2 = abs(d[i+1][0]-d[i-1][0])+abs(d[i+1][1]-d[i-1][1])
    return d1-d2
n = int(input())
d = []

for i in range(n):
    d += [list(map(int,input().split()))]



c = 0
for i in range(1,n-1):
    if (c==0) or (dist(d,i) >= c):
        c = dist(d,i)
t = 0
for i in range(1,n):
    t+=abs(d[i][0]-d[i-1][0])+abs(d[i][1]-d[i-1][1])

print(t-c)
