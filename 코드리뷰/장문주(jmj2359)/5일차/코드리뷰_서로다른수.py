n = int(input())
d = {}
for i in map(int,input().split()):
    if i not in d:
        d[i] = 0
print(len(d))
        
