import sys
N = int(sys.stdin.readline())
arr = sorted(list(map(int, sys.stdin.readline().rstrip().split())))
answer = 0
a = N
for i in range(N):
    answer += arr[i] * a
    a -= 1
print(answer)
