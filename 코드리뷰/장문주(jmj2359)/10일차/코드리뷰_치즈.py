import sys
sys.setrecursionlimit(100000)
n, m = map(int, sys.stdin.readline().rstrip().split())

dx = [1,0,-1,0]
dy = [0,-1,0,1]

arr = []
for i in range(n):
    arr+=[list(map(int,sys.stdin.readline().rstrip().split()))]

def dfs(x,y):
    visited[x][y] = -1
    for i in range(4):
        newx = x+dx[i]
        newy = y+dy[i]
        if (newx < 0) or (newy < 0) or (newx > n-1) or (newy > m-1):
            continue
        if (arr[newx][newy] == 1):
            visited[newx][newy]+=1
        if visited[newx][newy] == False and arr[newx][newy] == 0:
            dfs(newx,newy)

cheese = 0
for i in range(n):
    for j in range(m):
        if arr[i][j] >= 1:
            cheese += 1
            
            
ans = 0
while (cheese > 0):
    ans+=1
    visited = [[0 for i in range(m)] for j in range(n)]
    dfs(0,0)
    for i in range(n):
        for j in range(m):
            if (arr[i][j] == 1 and visited[i][j] >= 2):
                arr[i][j] = 0
                cheese-=1

print(ans)
    
