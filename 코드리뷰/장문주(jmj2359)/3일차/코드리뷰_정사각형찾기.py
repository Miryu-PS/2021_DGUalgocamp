n, m = map(int,input().split())
s = []
t = 0
v = 0

for i in range(n):
    s += [input()]

k = min(m,n)
while True:
    k-=1
    for i in range(n):
        for j in range(m):
            if (i+k < n) and (j+k < m):

                if s[i][j] == s[i][j+k] == s[i+k][j] == s[i+k][j+k]:
                    v = (k+1)*(k+1)
                    if t < v:
                        t = v
    if v!=0:
        break
print(t)    
                    
            
    
