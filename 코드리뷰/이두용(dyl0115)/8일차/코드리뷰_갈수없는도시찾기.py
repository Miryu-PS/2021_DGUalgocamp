import sys

N, M = map(int, sys.stdin.readline().rstrip().split())
G = [[] for i in range(N+1)]
visited = [False for i in range(N+1)]
ans = []
for i in range(M):
    n1, n2 = map(int, sys.stdin.readline().rstrip().split())
    G[n1].append(n2)
    G[n2].append(n1)

def dfs(x):
    visited[x] = True
    for y in G[x]:
        if (visited[y] == False):
            dfs(y)

dfs(1)

for i in range(2,len(visited)):
    if (visited[i] == False):
        ans.append(i)

ans.sort()

if (len(ans) == 0):
    print(0)
else:
    for i in range(len(ans)):
        print(ans[i])

