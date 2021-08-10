import sys
n = int(sys.stdin.readline())
l = list(map(int,sys.stdin.readline().split()))
l.sort()
sum = 0
c = len(l)
for i in l:
    sum+=i*c
    c-=1
print(sum)
