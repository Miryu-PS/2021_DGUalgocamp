import sys
n = int(sys.stdin.readline())
sum = 0
l = []
for  i in range(n):
    l.append(int(sys.stdin.readline()))

l.sort(reverse=True)
m = 0
c = 1
t = 0

for i in l:
    if t < i*c:
        t = i*c
    if i*c >= m:
        c+=1
        sum+=i
    m = sum/(c-1)
print(t)
