#좌우 거리 중 가까운 쪽 출력
def dist(d,a):
    return min(d[a+1]-d[a],d[a]-d[a-1])
n = int(input())
d = {}
for i in range(n):
    a,b = map(int,input().split())
    if (d.get(b)==None):
        d[b] = []
        d[b]+=[a]
    else:
        d[b]+=[a]
t = 0
for i in d:
    d[i].sort()
    t+=(d[i][1]-d[i][0]+d[i][len(d[i])-1]-d[i][len(d[i])-2])
    for j in range(1,len(d[i])-1):
        t+=dist(d[i],j)    
print(t)
