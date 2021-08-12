import sys
sys.setrecursionlimit(100000)
n = int(sys.stdin.readline())
dx = [-1,0,1,0]
dy = [0,1,0,-1]

arr1 = [["" for i in range(n)] for j in range(n)]
arr2 = [["" for i in range(n)] for j in range(n)]
visited1 = [[False for i in range(n)] for j in range(n)]
visited2 = [[False for i in range(n)] for j in range(n)]

idx = 0
for k in range(n):
    for i in sys.stdin.readline().rstrip().split():
        for j in range(n):
            arr2[idx][j]=i[j]
            if i[j]=='G':
                arr1[idx][j]='R'
            else:
                arr1[idx][j]=i[j]
    idx+=1
#소
def dfs_c(x,y):
    visited1[x][y]=True
    for i in range(4):
        newx = x+dx[i]
        newy = y+dy[i]
        if (newx < 0) or (newy <0) or (newx > n-1) or (newy > n-1) :
            continue
        if (visited1[newx][newy]==False) and (arr1[x][y]==arr1[newx][newy]):
            dfs_c(newx,newy)

#사람            
def dfs_h(x,y):
    visited2[x][y]=True
    for i in range(4):
        newx = x+dx[i]
        newy = y+dy[i]
        if (newx < 0) or (newy <0) or (newx > n-1) or (newy > n-1) :
            continue
        if (visited2[newx][newy]==False) and (arr2[x][y]==arr2[newx][newy]):
            dfs_h(newx,newy)

#사람
cnt2 = 0
for i in range(n):
    for j in range(n):
        if visited2[i][j]==False:
            dfs_h(i,j)
            cnt2+=1
print(cnt2, end = " ")
#소
cnt1 = 0
for i in range(n):
    for j in range(n):
        if visited1[i][j]==False:
            dfs_c(i,j)
            cnt1+=1
print(cnt1)
