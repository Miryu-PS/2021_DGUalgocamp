N, M = list(map(int, input().rstrip().split(" ")))
h = set()
l = set()
hl = set()
for n in range(N):
    h.add(input())
for m in range(M):
    l.add(input())

hl = h.intersection(l)
print(len(hl))
