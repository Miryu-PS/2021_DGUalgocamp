n = int(input())
l = []
l2 = []
c = 0
t = 0
for i in range(1,n+1):
    s = int(input())
    if s > c:
        for j in range(c+1,s+1):
            l.append(j)
            l2.append("+")
        c = s
        l2.append("-")
        l.pop()
    elif s < c:
        if l[-1] == s:
            l.pop()
            l2.append("-")
        else:
            t = 1
if t!=1:
    for i in l2:
        print(i)
else:
    print("NO")
