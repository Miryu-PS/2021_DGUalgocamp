n,m = map(int,input().split())
s = set()
for i in range(n+m):
    k = input()
    s.add(k)
print(n+m-len(s))
    
