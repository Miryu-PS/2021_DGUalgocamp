n=int(input())
k=int(input()) # 쌍의 수
visited=[]

for i in range(n+1):
    visited.append(0)
graph=[[0] *(n+1) for i in range(n+1)]

for i in range(k):
    x,y=map(int,input().split())
    graph[x][y]=1
    graph[y][x]=1
    

def dfs(x):
    visited[x]=1
    for i in range(1,n+1):
        if visited[i]==0 and graph[x][i]==1:
            
            dfs(i)

dfs(1)
ans=0
for i in range(2,n+1):
    if visited[i]!=0:
        ans+=1
        


        
print(ans)


    
