import sys

N = int(sys.stdin.readline())
arr = []
for n in range(N):
    arr.append(tuple(map(int, sys.stdin.readline().rstrip().split())))

arr.sort(key = lambda x:x[1])

answer = 0
last = 0

for i in range(N):
    tmp = arr[i]
    if (last <= tmp[0]):
        last = tmp[1]
        answer += 1

print(answer)
