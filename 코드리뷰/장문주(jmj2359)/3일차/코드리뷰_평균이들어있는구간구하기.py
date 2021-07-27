n = int(input())
l = list(map(int,input().split()))
k = 0
for i in range(len(l)):
    c = 0
    t = 0
    for j in range(i+1,len(l)+1):
        t = sum(l[i:j])
        c = len(l[i:j])
        if (t%c==0) and (int(t/c) in l[i:j]):
            k+=1
print(k)
