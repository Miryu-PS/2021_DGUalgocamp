n=int(input())
l=list(map(int,input().split()))
sort=sorted(set(l))
d={a:b for b,a in enumerate(sort)}

for i in l:
    print(d[i], end = " ")
print("")
