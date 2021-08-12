import sys
sys.setrecursionlimit(100000)
n = int(sys.stdin.readline())
visited = [[False for i in range(102)] for j in range(102)]
arr = [[0 for i in range(102)] for j in range(102)]
for i in range(n):
    x, y = map(int,sys.stdin.readline().rstrip().split())
    arr[x][y] = 1
dx = [-1,0,1,0]
dy = [0,1,0,-1]
c = 0
def dfs(x,y):
    global c
    c+=1
    visited[x][y] = True
    for i in range(4):
        newx = x + dx[i]
        newy = y + dy[i]
        if (newx < 0 or  newy < 0 or newx > 101 or newy >101):
            continue
        if (visited[newx][newy]==False) and (arr[newx][newy]==0):
            dfs(newx,newy)
dfs(0,0)
cnt = 0
for i in range(1,101):
    for j in range(1,101):
        if (arr[i][j]==1):
            for k in range(4):
                newx = i + dx[k]
                newy = j + dy[k]
                if (arr[newx][newy]==0 and visited[newx][newy]==True):
                    cnt+=1
print(cnt)
