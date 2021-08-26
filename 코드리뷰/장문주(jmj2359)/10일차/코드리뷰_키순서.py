import sys

n, m = map(int,sys.stdin.readline().rstrip().split())
fw = {}
bk = {}
for i in range(m):
    a, b = map(int,sys.stdin.readline().rstrip().split())
    if fw.get(a-1) == None:
        fw[a-1] = [b-1]
    else:
        fw[a-1] += [b-1]
    if bk.get(b-1) == None:
        bk[b-1] = [a-1]
    else:
        bk[b-1] += [a-1]

def dfs(x, list):
    if (visited[x]==False):
        global cnt
        cnt+=1
    visited[x] = True
    if list.get(x) != None:
        for y in list.get(x):
            if (not visited[y]):
                dfs(y, list)

ans = 0
for i in range(n):
    visited = [False for j in range(n)]
    cnt = 0
    dfs(i, fw)
    dfs(i, bk)
    if (cnt == n):
        ans+=1

print(ans)
