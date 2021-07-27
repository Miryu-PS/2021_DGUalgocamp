n, m = map(int,input().split())
arr = list(map(int,input().split()))
c = 0
for i in range(n-1):
    j=i
    sum = 0
    while (sum<=m and j<len(arr)):
        sum+=arr[j]
        j+=1
        if (sum==m):
            c+=1
print(c)
