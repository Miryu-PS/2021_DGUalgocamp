n = int(input())
#총 수행횟수: n
l = [i for i in range(1,n+1)]
for i in range(n):
    if len(l)%2==0:
        l = l[1::2]
    else:
        l=[l[-1]]+l[1::2]
print(*l)

        
