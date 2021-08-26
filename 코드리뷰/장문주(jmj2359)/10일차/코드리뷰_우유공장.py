import sys

n = int(sys.stdin.readline())
d = {}

for i in range(n-1):
    a,b = map(int,sys.stdin.readline().rstrip().split())
    if d.get(b-1) == None:
        d[b-1] = [a-1]
    else:
        d[b-1] += [a-1]

def dfs(x):
    global cnt
    cnt+=1
    visited[x] = True
    if d.get(x) != None:
        for y in d.get(x):
            if visited[y] == False:
                dfs(y)

for i in range(n):
    visited = [False for j in range(n)]
    cnt = 0
    dfs(i)
    if cnt == n:
        print(i+1)
        break
else:
    print(-1)
