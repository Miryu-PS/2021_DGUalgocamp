import sys
n = int(sys.stdin.readline())
b = list(map(int,sys.stdin.readline().split()))
a = list(map(int,sys.stdin.readline().split()))
b.sort()
a.sort()
s = 0
c = 0
for i in b:
    while True:
        if (s==len(a)):
            break
        if    a[s]>i:
            c+=1
            s+=1
            break
        else:
            s+=1
print(c)
