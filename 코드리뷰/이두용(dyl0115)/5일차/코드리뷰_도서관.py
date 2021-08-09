N = int(input())

d = {}
answer = ''

for n in range(N):
    name = input()
    if (name not in d):
        d.update({name : 1})
    else:
        d.update({name : d[name] + 1})

mx = max(d.values())
for name in sorted(list(d.keys())):
    if (d.get(name) == mx):
        answer = name
        break
print(answer)

