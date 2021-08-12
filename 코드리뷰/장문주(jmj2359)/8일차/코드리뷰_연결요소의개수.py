import sys

n, m = map(int,sys.stdin.readline().rstrip().split())
d = {i:[] for i in range(n)}
visited = [False for i in range(n)]

for i in range(m):
    x, y = map(int,sys.stdin.readline().rstrip().split())
    d[x-1]+=[y-1]
    d[y-1]+=[x-1]

def dfs(x):
    visited[x]=True
    for i in d.get(x):
        if (visited[i]==False):
            dfs(i)

dfs(1)
cnt=1
for i in range(n):
    if (visited[i]==False):
        dfs(i)
        cnt+=1
print(cnt)
