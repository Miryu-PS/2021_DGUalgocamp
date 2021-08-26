import sys
sys.setrecursionlimit(100000)
fw = {}
bk = {}
n, m, x = map(int,sys.stdin.readline().rstrip().split())
visited = [False for i in range(n)]
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
def dfs(x,list):
    global cnt
    cnt += 1
    visited[x] = True
    if (list.get(x)!=None):
        for y in list.get(x):
            if (visited[y]==False):
                dfs(y,list)


visited = [False for i in range(n)]
cnt = 0
dfs(x-1,bk)
print(cnt, end = " ")

cnt = 0
dfs(x-1,fw)
print(n-cnt+1)
    
