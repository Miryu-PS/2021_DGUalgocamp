import sys

n, m  = map(int,sys.stdin.readline().rstrip().split())

visited = [False for i in range(n)]
d = {i:[] for i in range(n)}

for i in range(m):
    x,y = map(int,sys.stdin.readline().rstrip().split())
    d[x-1] += [y-1]
    d[y-1] += [x-1]

def dfs(x):
    visited[x] = True
    for i in d.get(x):
        if (visited[i] == False):
            dfs(i)

cnt = 1
dfs(0)

for i in visited:
    if False not in visited:
        print(0)
        break
    if i==True:
        cnt+=1
    else:
        print(cnt)
        cnt+=1
