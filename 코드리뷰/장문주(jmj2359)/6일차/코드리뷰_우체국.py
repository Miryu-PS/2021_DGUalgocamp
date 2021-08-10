import sys
n = int(sys.stdin.readline())
d = {}
s = 0
for i in range(n):
    a,b = map(int,sys.stdin.readline().rstrip().split())
    if d.get(a)==None:
            d[a] = b
            s += b
    else:
        d[a] += b
        s += b

#중앙값 나오기 직전 앞의 사람 수
if s%2==0:
    m = s//2-1
else:
    m = s//2
d = sorted(d.items())
c = 0
while m>=0:
    m-=d[c][1]
    c+=1

# 사람 수가 짝수일 때 두 중앙값 사이의 인원이 0인 마을 수 존재여부 파악
c2 = c+1
m2 = m
pos = False
if s%2 == 0:
    if m2==-1:
        while m2<-2:
            m2-d[c2][1]
            c2+=1
        c2-=c+2
        if c2!=0:
            pos = True



if s%2!=0:
    print(d[c-1][0])
else:
    if pos == True:
        if c2%2!=0:
            print(d[(c+(c2//2))][0])
        else:
            print(d[(c-1+(c2//2))][0])
    elif m == -1:
        print(int((d[(c-1)][0]+d[c][0])/2))
    else:
        print(d[c-1][0])
