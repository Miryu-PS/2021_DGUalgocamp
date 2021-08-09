n = int(input())
d = {}

for i in range(n):
    s = input()
    if d.get(s) == None:
        d[s] = 1
    else:
        d[s] += 1

max = 0
d = sorted(d.items())
for i in d:
    if i[1] > max:
        max = i[1]
        ans = i[0]
print(ans)
 
    
