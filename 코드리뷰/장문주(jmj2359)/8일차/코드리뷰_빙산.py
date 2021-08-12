import sys
sys.setrecursionlimit(999999999)
n, m = map(int,sys.stdin.readline().rstrip().split())
arr = [[] for i in range(n)]
for i in range(n):
    for j in sys.stdin.readline().rstrip().split():
        arr[i].append(int(j))


dx = [-1,0,1,0]
dy = [0,1,0,-1]

def dfs(x,y):
    visited[x][y] = True
    for i in range(4):
        newx = x + dx[i]
        newy = y + dy[i]
        if (newx < 0) or (newy < 0) or (newx > n-1) or (newy > m-1) :
            continue
        if arr[newx][newy]==0 and visited[newx][newy] == False:
            dfs(newx,newy)



    
cnt = 0
while True:
    if arr == [[0 for i in range(m)] for j in range(n)]:
        print(0)
        break
    if cnt >=2:
        print(cnt)
        break        
    cnt = 0
    #빙하가 있는 부분 모두 True로 변경1
    visited = [[False for i in range(m)] for j in range(n)]
    for i in range(n):
        for j in range(m):
            if arr[i][j] > 0 :
                visited[i][j] = True
    # 1년 후 빙하 상태
    for i in range(n):
        for j in range(m):    
            for k in range(4):
                newx = i + dx[k]
                newy = j + dy[k]            
                if (newx < 0) or (newy < 0) or (newx > n-1) or (newy > m-1) :
                    continue
                if visited[newx][newy] == False and arr[i][j] > 0:
                    arr[i][j]-=1
                    
    #빙하가 있는 부분 모두 True로 변경2
    visited = [[False for i in range(m)] for j in range(n)]
    for i in range(n):
        for j in range(m):
            if arr[i][j] > 0 :
                visited[i][j] = True            
    # 빙하가 없는 부분을 모두 True로 변경하며 이어지는지 개수 세기
    for i in range(n):
        for j in range(m):
            if arr[i][j] == 0 and visited[i][j] == False:
                dfs(i,j)
                cnt+=1

