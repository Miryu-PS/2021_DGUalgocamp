n, m = map(int,input().split())
l = [i for i in range(1,n+1)]
for i in range(n):
    if len(l)>=m:
        print(l[m-1], end = " ")
        del l[m-1]
        l = l[m-1:]+l[:m-1]
    else:
        t = m%(len(l))-1
        print(l[t], end = " ")
        del l[t]
        if t!=-1:
            l = l[t:]+l[:t]
print("")
