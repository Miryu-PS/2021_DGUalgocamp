"""
ㅣ에 append 하지 않고 개수만 count하여도 됩니다! 
"""

n,m = map(int,input().split())
l = []
for i in range(n):
    k, *args = map(int,input().split())
    for j in args:
        l.append(j)
c = 0
for t in range(1,m+1):
    if l.count(t) == n:
        c+=1
print(c)
